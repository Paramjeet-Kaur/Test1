
public class RabbitTest {	
	public static void main(String[] args) throws InterruptedException {
		rabbit rabbit = new rabbit(15,0);
		rabbit.getX();
		rabbit.getY();
		if(rabbit.getY()==0)
		{
			Thread.sleep(1);
			
		}
		
		
		boolean runForever = true;

		while (runForever == true) {
			System.out.println("Carrot");
			Thread.sleep(15);
		}
	}

}