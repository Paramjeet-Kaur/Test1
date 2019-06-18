import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Enter the regular price of a phone: ");
		Scanner keyboard = new Scanner(System.in);
		double price = keyboard.nextDouble();
		for(int i=1;i<=3;i++)
		{
			if(i<3)
			{
				System.out.println("phone "+i+" "+price);
			}
			else 
			{
				System.out.println("phone " + i +" "+(price)/2);
			}
		}
		
	}

}
