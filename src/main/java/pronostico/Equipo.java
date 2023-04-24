package pronostico;

public class Equipo {
    private String nombre;
    private int puntuacion;
    private int golesMarcados;
    private int golesEncajados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
        this.golesMarcados = 0;
        this.golesEncajados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void ganar() {
        puntuacion += 2;
    }

    public void empatar() {
        puntuacion += 1;
    }

    public void perder() {
        // no hace nada, ya que al perder no se suman puntos
    }

    public void marcarGol(int goles) {
        golesMarcados += goles;
    }

    public void encajarGol(int goles) {
        golesEncajados += goles;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public int getGolesEncajados() {
        return golesEncajados;
    }
}
