public interface BinaerSuchBaumInterface<T>
{

	public void einfuegenKnoten(T knoten);
	
	public boolean finde(T knoten); 

	public void nebenreihenfolge(); 
	
	public void hauptreihenfolge(); 
	
	public void symmetrisch(); 
}
