
/*
 * Implementiert einen Binären Suchbaum mithilfe einer ArrayList
 *  
 * @author J.P.Ritter & P.Aguilar Bremer
 * @version Oktober 2018
 */

import java.util.ArrayList;

public class ArrayListBaum<T extends Comparable<T>> implements BinaerSuchBaumInterface<T>
{
	ArrayListKnoten<T> wurzelKnoten;

	public ArrayListBaum()
	{
		wurzelKnoten = null;
	}

	public void einfuegenKnoten(T knoten)
	{
		wurzelKnoten = einfuegenHilfe(knoten, wurzelKnoten);
	}

	private ArrayListKnoten<T> einfuegenHilfe(T knoten, ArrayListKnoten<T> wurzel)
	{
		if (wurzel == null)
			wurzel = new ArrayListKnoten<T>(knoten);
		else if (knoten.compareTo(wurzel.daten) >= 0)
			wurzel.rechterKnoten = einfuegenHilfe(knoten, wurzel.rechterKnoten);
		else
			wurzel.linkerKnoten = einfuegenHilfe(knoten, wurzel.linkerKnoten);
		return wurzel;
	}

	@Override
	public void nebenreihenfolge()
	{
		System.out.print("\nNebenreihenfolgen Ausgabe des ArrayList Baums: \n- ");
		nebenreihenfolgeHilfe(wurzelKnoten);
		nebenreihenfolgeHilfe(wurzelKnoten).forEach(e -> System.out.print(e + ", "));
		System.out.println("-");
	}
	
	public ArrayList<T> nebenreihenfolgeHilfe(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.addAll(nebenreihenfolgeHilfe(knoten.linkerKnoten));
		liste.addAll(nebenreihenfolgeHilfe(knoten.rechterKnoten));
		liste.add(knoten.daten);
		return liste;
	}

	@Override
	public void hauptreihenfolge()
	{
		System.out.print("\nHauptreihenfolgen Ausgabe des ArrayList Baums: \n- ");
		hauptreihenfolgeHilfe(wurzelKnoten);
		hauptreihenfolgeHilfe(wurzelKnoten).forEach(e -> System.out.print(e + ", "));
		System.out.println("-");
	}

	private ArrayList<T> hauptreihenfolgeHilfe(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.add(knoten.daten);
		liste.addAll(hauptreihenfolgeHilfe(knoten.linkerKnoten));
		liste.addAll(hauptreihenfolgeHilfe(knoten.rechterKnoten));
		return liste;
	}

	@Override
	public void symmetrisch()
	{
		System.out.print("\nSymmetrische Reihenfolgen Ausgabe des ArrayList Baums: \n- ");
		symmetrischHilfe(wurzelKnoten);
		symmetrischHilfe(wurzelKnoten).forEach(e -> System.out.print(e + ", "));
		System.out.println("-");
	}
	
	private ArrayList<T> symmetrischHilfe(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.addAll(symmetrischHilfe(knoten.linkerKnoten));
		liste.add(knoten.daten);
		liste.addAll(symmetrischHilfe(knoten.rechterKnoten));
		return liste;
	}

//	private ArrayListKnoten<T> finde(T daten, ArrayListKnoten<T> knoten)
//	{
//		if (knoten == null)
//			return knoten;
//
//		int vergleich = daten.compareTo(knoten.daten);
//		if (vergleich == 0)
//			return knoten;
//		return (vergleich > 0) ? finde(daten, knoten.rechterKnoten) : finde(daten, knoten.linkerKnoten);
//	}
//
//	public ArrayListKnoten<T> finde(T daten)
//	{
//		return finde(daten, wurzelKnoten);
//	}
}
