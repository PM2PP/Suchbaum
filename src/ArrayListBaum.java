import java.util.ArrayList;

public class ArrayListBaum<T extends Comparable<T>>
{
	ArrayListKnoten<T> wurzelKnoten;

	public ArrayListBaum()
	{
		wurzelKnoten = null;
	}

	public void add(T value)
	{
		wurzelKnoten = add(value, wurzelKnoten);
	}

	private ArrayListKnoten<T> add(T newValue, ArrayListKnoten<T> knoten)
	{
		if (knoten == null)
			knoten = new ArrayListKnoten<T>(newValue);
		else if (newValue.compareTo(knoten.daten) >= 0)
			knoten.rechterKnoten = add(newValue, knoten.rechterKnoten);
		else
			knoten.linkerKnoten = add(newValue, knoten.linkerKnoten);
		return knoten;
	}

	public ArrayList<T> reihenfolge(ReihenfolgeTyp type)
	{
		if (type == ReihenfolgeTyp.SYMMETRISCH)
			return wurzelKnoten.symmetrisch(wurzelKnoten);
		else if (type == ReihenfolgeTyp.HAUPTREIHENFOLGE)
			return wurzelKnoten.hauptreihenfolge(wurzelKnoten);
		else
			return wurzelKnoten.nebenreihenfolge(wurzelKnoten);
	}

	private ArrayListKnoten<T> finde(T daten, ArrayListKnoten<T> knoten)
	{
		if (knoten == null)
			return knoten;

		int vergleich = daten.compareTo(knoten.daten);
		if (vergleich == 0)
			return knoten;
		return (vergleich > 0) ? finde(daten, knoten.rechterKnoten) : finde(daten, knoten.linkerKnoten);
	}

	public ArrayListKnoten<T> finde(T daten)
	{
		return finde(daten, wurzelKnoten);
	}
}
