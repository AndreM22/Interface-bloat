package ejemplo;

public class Perico implements IAnimal{

	@Override
	public void alimentar() {
		System.out.println("El perico est� comiendo galletas");
		
	}

	@Override
	public void volar() {
		System.out.println("El perico vuela en la jungla");
		
	}
	
	
}
