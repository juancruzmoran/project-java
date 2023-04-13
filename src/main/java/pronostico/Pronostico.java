package pronostico;

import java.util.Scanner;

public class Pronostico {
		public static void main(String[] args) {
			Scanner teclado=new Scanner(System.in);
			System.out.println("digite el nombre del equipo que cree que va a ganar?");
			String equipoUno=teclado.nextLine();
			System.out.println("digite el nombre del segundo equipo");
			String equipoDos=teclado.nextLine();
			int puntajeUno = 0, puntajeDos= 0;
			int partido = 0;
			while(partido < 3) {
				int golesUno = (int)(Math.random()*5);
				int golesDos = (int)(Math.random()*5);
				if(golesUno > golesDos) {
					puntajeUno = puntajeUno + 1;
				} else if(golesDos > golesUno) {
					puntajeDos = puntajeDos + 1;
				} else if(golesUno> 0 && golesUno == golesDos) {
					puntajeUno++;
					puntajeDos++;
				} else {
					System.out.println("Sin resultados");
					continue;
				}
				partido++;
				System.out.println("Resultados del partido: " + partido);
				System.out.println(equipoUno + ": " + golesUno + "-" +golesDos + " " +equipoDos + "");
				if(puntajeUno == 2 || puntajeDos == 2) {
					break;
				}
			}
			
			System.out.println("Se jugaron " + partido + " partidos.");
			System.out.println("El equipo de " + equipoUno + " consiguió " + puntajeUno + " puntos");
			System.out.println("El equipo de " + equipoDos + " consiguió " + puntajeDos + " puntos");
			if(puntajeUno > puntajeDos) {
				System.out.println("Felicitaciones tu equipo ganó!!");
			} else if (puntajeDos == puntajeUno) {
				System.out.println("Lo sentimos, ambos equipos han empatado .. No se obtendrán puntos.");
			} else {
				System.out.println("Lo sentimos, tu equipo perdió ..");
			}
		}
}
