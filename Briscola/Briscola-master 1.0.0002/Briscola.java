import java.util.*;

public class Briscola {
	public static void main (String[] args) {
		int bris;
		Mazzo partita = new Mazzo();
		System.out.println("\nLa briscola:" + partita.mazzo.top());
		bris = partita.mazzo.pop().getSeme();
		partita.setBriscole(bris);
		for (int i=0; i<39; i++)
			System.out.print(partita.mazzo.pop() + " ");
	}		
}
