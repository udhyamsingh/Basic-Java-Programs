public class Area
{
	float a,pi,r;
	public void assign()
	{
		pi=3.14f;
		r=9.0f;

	}
	public float area()
	{
		a=pi*r*r;
		return(a);
	}
	public void display()
	{
		System.out.println(a);
	}

		
}