
public class ArrayBaum<T extends Comparable<T>> implements BinaerSuchBaumInterface<T>
{

	private Object[] baum;

	public ArrayBaum(T knoten)
	{
		baum = new Object[10];
		baum[1] = knoten;
	}

	@Override
	public void einfuegenKnoten(T knoten)
	{
		einfuegeHilfe(1, knoten);

	}

	@SuppressWarnings("unchecked")
	private void einfuegeHilfe(int index, T knoten)
	{
		if (((Comparable<T>) baum[index]).compareTo(knoten) < 0)
		{
			if (index * 2 + 1 > baum.length)
			{
				Object[] newArray = new Object[baum.length * 2];
				for (int i = 0; i < baum.length; i++)
				{
					newArray[i] = baum[i];
				}
				baum = newArray;
			}

			if (baum[index * 2 + 1] == null)
			{
				baum[index * 2 + 1] = knoten;
			}
			else
			{
				einfuegeHilfe(index * 2 + 1, knoten);
			}
		}
		else
		{
			if (index * 2 > baum.length)
			{
				Object[] newArray = new Object[baum.length * 2];
				for (int i = 0; i < baum.length; i++)
				{
					newArray[i] = baum[i];
				}
				baum = newArray;
			}

			if (baum[index * 2] == null)
			{
				baum[index * 2] = knoten;
			}
			else
			{
				einfuegeHilfe(index * 2, knoten);
			}
		}
	}

	@Override
	public boolean finde(T knoten)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void nebenreihenfolge()
	{
		System.out.print("\nNebenreihenfolgen Ausgabe des ArrayBaums: \n- ");
		nebenAusgabeHilfe(1);
		System.out.println("-");
	}

	private void nebenAusgabeHilfe(int index)
	{
		if (index * 2 < baum.length && baum[index * 2] != null)
		{
			nebenAusgabeHilfe(index * 2);

		}
		if (index * 2 + 1 < baum.length && baum[index * 2 + 1] != null)
		{
			nebenAusgabeHilfe(index * 2 + 1);
		}
		System.out.print(baum[index] + ", ");
	}

	@Override
	public void hauptreihenfolge()
	{
		System.out.print("\nHauptreihenfolgen Ausgabe des ArrayBaums: \n- ");
		hauptAusgabeHilfe(1);
		System.out.println("-");
	}

	private void hauptAusgabeHilfe(int index)
	{
		System.out.print(baum[index] + ", ");

		if (index * 2 < baum.length && baum[index * 2] != null)
		{
			hauptAusgabeHilfe(index * 2);

		}
		if (index * 2 + 1 < baum.length && baum[index * 2 + 1] != null)
		{
			hauptAusgabeHilfe(index * 2 + 1);
		}
	}

	@Override
	public void symmetrisch()
	{
		System.out.print("\nSymmetrsiche Ausgabe des ArrayBaums: \n- ");
		symmAusgabeHilfe(1);
		System.out.println("-");
	}

	private void symmAusgabeHilfe(int index)
	{
		if (index * 2 < baum.length && baum[index * 2] != null)
		{
			symmAusgabeHilfe(index * 2);
		}
		System.out.print(baum[index] + " ");
		if (index * 2 + 1 < baum.length && baum[index * 2 + 1] != null)
		{
			symmAusgabeHilfe(index * 2 + 1);
		}
	}

}
