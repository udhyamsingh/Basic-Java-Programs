public class Circumference
{
	float pi,r,c;
	public void assign()
	{
		pi=3.14f;
		r=3.0f;
	}
	public float circumference()
	{
		c=2*pi*r;
		return(c);
	}
	public void display()
	{
		System.out.println(c);
	}
}