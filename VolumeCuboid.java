public class VolumeCuboid
{
	int v,l,b,h;
	public void assign()
	{
		l=10;
	    b=5;
	    h=15;
	}
	public int volume()
	{
		v=l*b*h;
		return(v);
	}
	public void display()
	{
		System.out.println(v);

	}
}
