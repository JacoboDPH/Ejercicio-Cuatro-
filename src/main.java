import java.lang.Math;

import javax.print.attribute.standard.RequestingUserName;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dadoAJugadorUno =  (int) (Math.random()*6)+1;
		int dadoBJugadorUno =  (int) (Math.random()*6)+1;
		int dadoAJugadorDos =  (int) (Math.random()*6)+1;
		int dadoBJugadorDos =  (int) (Math.random()*6)+1;
		
		System.out.println("El jugador uno juega con el siguiente resultado \n Dado 1 : " + dadoAJugadorUno + "\n Dado 2 : " + dadoBJugadorUno + "\n El jugador dos juega con los siguientes resultados \n Dado 1 : " + dadoAJugadorDos + "\n Dado 2 : " + dadoBJugadorDos);
		
		int player1 = (dadoAJugadorUno  + dadoBJugadorUno);
		int player2 = (dadoAJugadorDos + dadoBJugadorDos);
		
		int tiradaAlta = (int) Math.max(player1,player2);
		
		System.out.println("La tirada más alta fue : " + tiradaAlta);
		
		int media = (dadoAJugadorUno + dadoBJugadorUno + dadoAJugadorDos + dadoBJugadorDos) / 4;
		
		System.out.println("De los cuatro dados la media es :"+media);
		
	
		if (player1 > player2 && player1!=player2) {
			
			System.out.println("Gana el jugador 1");
			
		}
		
		else if (player1 < player2 && player1!=player2) {
			
			System.out.println("Gana el jugador 2");
			
		}

		else if (player1 == player2) {
			
			System.out.println("Empate");
			
		}
		
	}

	
}
