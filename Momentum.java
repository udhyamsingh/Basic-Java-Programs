public class power
{
	float p,w,t;
	public void assign(float w,float t)
	{
		this.w=w;
		this.t=t;
	}
	public float power()
	{
		p=w/t;
		return (p);
	}
	public void display()
	{
		System.out.println(p);
	}
}