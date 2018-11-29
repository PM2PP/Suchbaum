/*
 * @author J.P.Ritter & P.Aguilar Bremer
 * @version Oktober 2018
 */

public class Driver
{
	public static void main(String[] args)
	{
		ArrayListBaum<Integer> ab = new ArrayListBaum<Integer>();

		ab.einfuegenKnoten(5);
		ab.einfuegenKnoten(1);
		ab.einfuegenKnoten(2);
		ab.einfuegenKnoten(3);
		ab.einfuegenKnoten(4);
		ab.einfuegenKnoten(6);
		ab.einfuegenKnoten(7);
		
		ab.symmetrisch();
		ab.hauptreihenfolge();
		ab.nebenreihenfolge();
		
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
