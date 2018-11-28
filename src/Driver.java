import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		ArrayListBaum<Integer> ab = new ArrayListBaum<Integer>();

		ab.add(5);
		ab.add(1);
		ab.add(2);
		ab.add(3);
		ab.add(4);
		ab.add(6);
		ab.add(7);
		System.out.println("\nSYMMETRISCH");
		ab.reihenfolge(ReihenfolgeTyp.SYMMETRISCH).forEach(e -> System.out.print(e + ", "));
		System.out.println("\nHAUPTREIHENFOLGE");
		ab.reihenfolge(ReihenfolgeTyp.HAUPTREIHENFOLGE).forEach(e -> System.out.print(e + ", "));
		System.out.println("\nNEBENREIHENFOLGE");
		ab.reihenfolge(ReihenfolgeTyp.NEBENREIHENFOLGE).forEach(e -> System.out.print(e + ", "));
		System.out.println();

//		Scanner input = new Scanner(System.in);
//		System.out.print("welche Daten werden gesucht: ");
//		int valueToFind = input.nextInt();
//		System.out.println((ab.finde(valueToFind) != null) ? "Daten gefunden" : "Daten nicht gefunden");

		LinkedBaum<Integer> lb = new LinkedBaum<Integer>(5);

		lb.einfuegenKnoten(1);
		lb.einfuegenKnoten(2);
		lb.einfuegenKnoten(3);
		lb.einfuegenKnoten(4);
		lb.einfuegenKnoten(6);
		lb.einfuegenKnoten(7);
		
		lb.symmetrisch();
		lb.hauptreihenfolge();
		lb.nebenreihenfolge();
		
		ArrayBaum<Integer> arrayB = new ArrayBaum<Integer>(5); 
		arrayB.einfuegenKnoten(1);
		arrayB.einfuegenKnoten(2);
		arrayB.einfuegenKnoten(3);
		arrayB.einfuegenKnoten(4);
		arrayB.einfuegenKnoten(6);
		arrayB.einfuegenKnoten(7);
		
		arrayB.symmetrisch();
		arrayB.hauptreihenfolge();
		arrayB.nebenreihenfolge();
	}
}
