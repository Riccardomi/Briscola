import java.util.*;

public class Briscola {
	public static void main (String[] args) {
		Giocatore player, ia;
		Mazzo mazzoG = new Mazzo();
		Carta briscola, sPlayer, sIa;
		briscola=mazzoG.mazzo.pop();
		briscola.setBriscola();
		mazzoG.setBriscole(briscola.getSeme());
		player = new Giocatore(mazzoG.pesca(), mazzoG.pesca(), mazzoG.pesca());
		ia = new Giocatore(mazzoG.pesca(), mazzoG.pesca(), mazzoG.pesca());
		//System.out.println(player);
		//System.out.println(ia);
		Scanner sc = new Scanner(System.in);
		boolean turno=true;
		
		do{
			System.out.println("La briscola è: "+briscola);
			System.out.println("Le tue carte: "+player);
			System.out.println(ia);
			if(turno){
				System.out.println("------Che carta scarti?------");
				sPlayer = player.scarta(sc.nextInt());
				sIa = ia.scarta(0);
			}
			else{
				sIa = ia.scarta(0);
				System.out.println("Ha scartato: "+sIa);
				System.out.println("------Che carta scarti?------");
				sPlayer = player.scarta(sc.nextInt());
			}
					
			if(sPlayer.compareTo(sIa) == -1){
				System.out.println("Ha preso il pc");
				ia.presa(sPlayer,sIa);
				turno=false;
			}
			else{
				System.out.println("Hai preso tu compà");
				player.presa(sPlayer,sIa);
				turno=true;
				
			}
			if(turno){
				player.pesca(mazzoG.pesca());
				ia.pesca(mazzoG.pesca());
			}
			else{
				ia.pesca(mazzoG.pesca());
				player.pesca(mazzoG.pesca());
			}
			System.out.println("-----------------------------------------");
		}while(mazzoG.mazzo.size()>1);
		System.out.println("Sei uscito dal ciclo");
		
		
		if(turno){
			System.out.println("------Che carta scarti?------");
			sPlayer = player.scarta(sc.nextInt());
			sIa = ia.scarta(0);
		}
		else{
			sIa = ia.scarta(0);
			System.out.println("Ha scartato: "+sIa);
			System.out.println("------Che carta scarti?------");
			sPlayer = player.scarta(sc.nextInt());
		}
				
		if(sPlayer.compareTo(sIa) == -1){
			System.out.println("Ha preso il pc");
			turno=false;
		}
		else{
			System.out.println("Hai preso tu compà");
			turno=true;
				
		}
		
		if(turno){
			player.pesca(mazzoG.pesca());
			ia.pesca(briscola);
		}
		else{
			player.pesca(briscola);
			ia.pesca(mazzoG.pesca());
		}
		
		//----->Turno finale
		
		for(int i=0; i<3; i++){
			System.out.println("La briscola è: "+briscola);
			System.out.println("Le tue carte: "+player);
			System.out.println(ia);
			
			if(turno){
				System.out.println("------Che carta scarti?------");
				sPlayer = player.scarta(sc.nextInt());
				sIa = ia.scarta(0);
			}
			else{
				sIa = ia.scarta(0);
				System.out.println("Ha scartato: "+sIa);
				System.out.println("------Che carta scarti?------");
				sPlayer = player.scarta(sc.nextInt());
			}
					
			if(sPlayer.compareTo(sIa) == -1){
				System.out.println("Ha preso il pc");
				turno=false;
			}
			else{
				System.out.println("Hai preso tu compà");
				turno=true;
				
			}
		}
			
	}		
}
