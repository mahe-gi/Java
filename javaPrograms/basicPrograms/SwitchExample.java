package basicPrograms;

class SwitchExample 
{
	public static void main(String[] args) 
	{
		int a = 1;
		switch (a)
		{
			case 1:System.out.println("Hello");
			break;
			case 2:System.out.println("Hii");
			break;
			case 3:System.out.println("Number");
			break;
			case 4:System.out.println("Coffee");
			break;
			case 5:System.out.println("Blocked");
			break;
			default : System.out.println("Enter valid input");
		}
	}
}