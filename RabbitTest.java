
public class RabbitTest {	
	public static void main(String[] args) throws InterruptedException {
		rabbit rabbit = new rabbit(15,0);
		rabbit.getX();
		rabbit.getY();
		boolean runForever = true;
		while (runForever == true) 
		{
			System.out.println("Carrot");
		if(rabbit.getY()==0)
		{
			Thread.sleep(1);
			
		}
		if(rabbit.getX()==0)
		{
			Thread.sleep(1);
		}
		
	

		}
	}

}