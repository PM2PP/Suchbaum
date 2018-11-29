/*
 * Implementiert einen Binären Suchbaum mithilfe von verlinkung der Knoten.
 *  
 * @author J.P.Ritter & P.Aguilar Bremer
 * @version Oktober 2018
 */
public class LinkedBaum<T extends Comparable<T>> implements BinaerSuchBaumInterface<T>
{

	private Knoten<T> wurzel;

	public LinkedBaum(T knoten)
	{
		wurzel = new Knoten<T>(knoten);
	}

	public void einfuegenKnoten(T knoten)
	{
		if (wurzel == null)
		{
			wurzel = new Knoten<>(knoten);
		}
		else
		{
			einfuegenHilfe(wurzel, knoten);
		}
	}

	private void einfuegenHilfe(Knoten<T> wurzel, T knoten)
	{
		if (knoten.compareTo(wurzel.getDaten()) <= 0)
		{
			if (wurzel.getLinkerKnoten() == null)
			{
				wurzel.setLinkenKnoten(new Knoten<>(knoten));
			}
			else
			{
				einfuegenHilfe(wurzel.getLinkerKnoten(), knoten);
			}
		}
		else
		{
			if (wurzel.getRechterKnoten() == null)
			{
				wurzel.setRechtenKnoten(new Knoten<>(knoten));
			}
			else
			{
				einfuegenHilfe(wurzel.getRechterKnoten(), knoten);
			}
		}
	}

	public void symmetrisch()
	{
		System.out.print("\nSymmetrische Ausgabe des LinkedBaums: \n- ");
		symmetrischHilfe(wurzel);
		System.out.println("-");
	}

	private void symmetrischHilfe(Knoten<T> wurzel)
	{
		if (wurzel != null)
		{
			symmetrischHilfe(wurzel.getLinkerKnoten());
			System.out.print(wurzel.getDaten() + ", ");
			symmetrischHilfe(wurzel.getRechterKnoten());
		}
	}

	public void hauptreihenfolge()
	{
		System.out.print("\nHauptreihenfolgen Ausgabe des LinkedBaums: \n- ");
		hauptreihenfolgeHilfe(wurzel);
		System.out.println("-");
	}

	private void hauptreihenfolgeHilfe(Knoten<T> wurzel)
	{
		if (wurzel != null)
		{
			System.out.print(wurzel.getDaten() + ", ");
			hauptreihenfolgeHilfe(wurzel.getLinkerKnoten());
			hauptreihenfolgeHilfe(wurzel.getRechterKnoten());
		}
	}

	public void nebenreihenfolge()
	{
		System.out.print("\nNebenreihenfolgen Ausgabe des LinkedBaums: \n- ");
		nebenreihenfolgeHilfe(wurzel);
		System.out.println("-");
	}

	private void nebenreihenfolgeHilfe(Knoten<T> wurzel)
	{
		if (wurzel != null)
		{
			nebenreihenfolgeHilfe(wurzel.getLinkerKnoten());
			nebenreihenfolgeHilfe(wurzel.getRechterKnoten());
			System.out.print(wurzel.getDaten() + ", ");
		}
	}

	// public boolean finde(T knoten)
	// {
	// return findeHilfe(wurzel, knoten);
	// }
	//
	// private boolean findeHilfe(Knoten<T> wurzel, T knoten)
	// {
	// if (wurzel == null)
	// {
	// return false;
	// }
	// else if (knoten.compareTo(wurzel.getDaten()) == 0)
	// {
	// return true;
	// }
	// else if (knoten.compareTo(wurzel.getDaten()) < 0)
	// {
	// return findeHilfe(wurzel.getLinkerKnoten(), knoten);
	// }
	// else
	// {
	// return findeHilfe(wurzel.getRechterKnoten(), knoten);
	// }
	// }
}
