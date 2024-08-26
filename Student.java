class Student 
{
	String name;
	int age;
	int rollNumber;
	int[] marks; 
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name = "Yogendra";
		s.rollNumber = 12;


		System.out.println(s.name);
		System.out.println(s.rollNumber);
		System.out.println(s.age);
	}
}
