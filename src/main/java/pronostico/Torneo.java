package pronostico;

import java.util.Scanner;

public class Torneo {
    private Partido[] partidos;
    private Equipo[] equipos;
    
    public Torneo() {
        this.partidos = new Partido[4];
        this.equipos = new Equipo[2];
        
        equipos[0] = new Equipo("Equipo 1");
        equipos[1] = new Equipo("Equipo 2");
        
        for (int i = 0; i < partidos.length; i++) {
            partidos[i] = new Partido(equipos[0], equipos[1]);
        }
    }
    
    public void jugarTorneo() {
        Scanner scanner = new Scanner(System.in);
        int puntosTotales = 0;
        
        for (int i = 0; i < partidos.length; i++) {
            System.out.println("Partido " + (i+1) + ":");
            System.out.println(partidos[i].getEquipoLocal().getNombre() + " vs. " + partidos[i].getEquipoVisitante().getNombre());
            
            // Generar resultado aleatorio del partido
            int golesLocal = (int) (Math.random() * 5);
            int golesVisitante = (int) (Math.random() * 5);
            
            System.out.println("Ingrese su pronóstico (V: victoria, D: derrota, E: empate): ");
            String pronostico = scanner.nextLine();
            
            // Verificar pronóstico del usuario y actualizar puntuaciones de equipos
            if (pronostico.equalsIgnoreCase("V") && golesLocal > golesVisitante) {
                puntosTotales += 2;
                partidos[i].getEquipoLocal().ganar();
            } else if (pronostico.equalsIgnoreCase("D") && golesLocal < golesVisitante) {
                puntosTotales += 2;
                partidos[i].getEquipoVisitante().ganar();
            } else if (pronostico.equalsIgnoreCase("E") && golesLocal == golesVisitante) {
                puntosTotales += 1;
                partidos[i].getEquipoLocal().empatar();
                partidos[i].getEquipoVisitante().empatar();
            } else {
                partidos[i].getEquipoLocal().perder();
                partidos[i].getEquipoVisitante().perder();
            }
            
            // Mostrar resultado del partido
            System.out.println("Resultado: " + golesLocal + " - " + golesVisitante);
        }
        
        // Mostrar puntuaciones finales
        System.out.println("Puntuaciones finales:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombre() + ": " + equipos[i].getPuntuacion());
        }
        System.out.println("Puntos totales: " + puntosTotales);
        
        scanner.close();
    }
}