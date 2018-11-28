
public class Knoten<T extends Comparable<T>>
{

		private T daten;
		private Knoten<T> linkerKnoten;
		private Knoten<T> rechterKnoten;
 
		public Knoten(T t)
		{
			daten = t;
			linkerKnoten = null;
			rechterKnoten = null;
		}

		public Knoten(T t, Knoten<T> lk, Knoten<T> rk)
		{
			daten = t;
			linkerKnoten = lk;
			rechterKnoten = rk;
		}

		public T getDaten()
		{
			return daten;
		}

		public Knoten<T> getLinkerKnoten()
		{
			return linkerKnoten;
		}

		public Knoten<T> getRechterKnoten()
		{
			return rechterKnoten;
		}

		public void setDaten(T t)
		{
			daten = t;
		}

		public void setLinkenKnoten(Knoten<T> lk)
		{
			linkerKnoten = lk;
		}

		public void setRechtenKnoten(Knoten<T> rk)
		{
			rechterKnoten = rk;
		}

}
