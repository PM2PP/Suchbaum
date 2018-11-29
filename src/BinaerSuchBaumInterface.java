/*
 * Eine Schnittstelle zur modllierung eines Binären Suchbaumes.
 *  
 * @author J.P.Ritter & P.Aguilar Bremer
 * @version Oktober 2018
 */

public interface BinaerSuchBaumInterface<T>
{
	// fügt einen Knoten in den Suchbaum ein
	public void einfuegenKnoten(T knoten);

	// gibt die den Binären Suchbaum in der Nebenreihehnfolge aus
	public void nebenreihenfolge();

	// gibt den Binären Suchbaum in der Hauptreihenfolge aus
	public void hauptreihenfolge();

	// gibt den Binären Suchbaum in der Symmetrischen Reihenfolge aus
	public void symmetrisch();
}
