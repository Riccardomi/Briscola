import java.util.*;

public class Briscola {
	public static void main (String[] args) {
		int bris;
		Carta prima, seconda;
		Mazzo partita = new Mazzo();
		System.out.println("La briscola:" + partita.mazzo.top());
		bris = partita.mazzo.pop().getSeme();
		partita.setBriscole(bris);
		System.out.println("Prova compare di Mina");
		prima = partita.mazzo.pop();
		seconda = partita.mazzo.pop();
		System.out.println("Fra " + prima + " e "+ seconda);
		if (prima.compareTo(seconda) < 0)
			System.out.println("Prende "+ seconda);
		else System.out.println("Prende "+ prima);

	}		
}
