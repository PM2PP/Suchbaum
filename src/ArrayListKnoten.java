/*
 * Implementiert einen Knoten zur erstellung 
 * eines Binären Suchbaums mithilfe einer ArrayList
 *  
 * @author J.P.Ritter & P.Aguilar Bremer
 * @version Oktober 2018
 */

public class ArrayListKnoten<T extends Comparable<T>>
{
	T daten;
	ArrayListKnoten<T> linkerKnoten, rechterKnoten;

	public ArrayListKnoten(T t)
	{
		daten = t;
		linkerKnoten = null;
		rechterKnoten = null;
	}
}
