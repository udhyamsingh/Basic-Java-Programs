public class VolumeCube
{
	int v,i;
	public void assign()
	{
		i=3;
	}
	public int volume()
	{
		v=i*i*i;
		return(v);
	}
	public void display()
	{
		System.out.println(v);
	}
}