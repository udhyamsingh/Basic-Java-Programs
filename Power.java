public class Power
{
	float p,w,t;
	public void assign()
	{
		w=11.0f;
		t=3.0f;
	}
	public float power()
	{
		p=w/t;
		return(p);
	}
	public void display()
	{
		System.out.println(p);
	}
}