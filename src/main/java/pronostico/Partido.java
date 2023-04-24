package pronostico;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean jugado;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.jugado = false;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void jugarPartido(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.jugado = true;
    }
    public void jugarPartidoAleatorio() {
        // Generar un resultado aleatorio para el partido
        int golesLocal = (int) (Math.random() * 5);
        int golesVisitante = (int) (Math.random() * 5);

        // Mostrar el resultado al usuario
        System.out.println("Resultado: " + equipoLocal.getNombre() + " " + golesLocal + " - " +
                golesVisitante + " " + equipoVisitante.getNombre());

        // Jugar el partido con el resultado generado
        jugarPartido(golesLocal, golesVisitante);
    }
}