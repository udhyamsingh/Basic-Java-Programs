public class Addition1Exe
{
	public static void main(String [] args)
	{
		
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[1]);

		Addition1 a=new Addition1();
			a.assign(i1,i2);
		    a.add();
			a.display();
	}
}