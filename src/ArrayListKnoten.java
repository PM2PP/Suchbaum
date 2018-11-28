import java.util.ArrayList;

public class ArrayListKnoten<T extends Comparable<T>>
{
	T daten;
	ArrayListKnoten<T> linkerKnoten, rechterKnoten;

	public ArrayListKnoten()
	{
		this(null);
	}

	public ArrayListKnoten(T t)
	{
		daten = t;
		linkerKnoten = null;
		rechterKnoten = null;
	}

	public ArrayList<T> hauptreihenfolge(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.add(knoten.daten);
		liste.addAll(hauptreihenfolge(knoten.linkerKnoten));
		liste.addAll(hauptreihenfolge(knoten.rechterKnoten));
		return liste;
	}

	public ArrayList<T> nebenreihenfolge(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.addAll(nebenreihenfolge(knoten.linkerKnoten));
		liste.addAll(nebenreihenfolge(knoten.rechterKnoten));
		liste.add(knoten.daten);
		return liste;
	}

	public ArrayList<T> symmetrisch(ArrayListKnoten<T> knoten)
	{
		ArrayList<T> liste = new ArrayList<T>();
		if (knoten == null)
			return liste;
		liste.addAll(symmetrisch(knoten.linkerKnoten));
		liste.add(knoten.daten);
		liste.addAll(symmetrisch(knoten.rechterKnoten));
		return liste;
	}
}
