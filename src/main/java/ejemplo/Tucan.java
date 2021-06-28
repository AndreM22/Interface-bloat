package ejemplo;

public class Tucan implements IAnimal{

	@Override
	public void alimentar() {
		System.out.println("El tucan esta comiendo fruta");
		
	}

	@Override
	public void volar() {
		System.out.println("El tucan vuela en la selva");
		
	}
	

}
