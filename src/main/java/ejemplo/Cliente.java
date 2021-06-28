package ejemplo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		List<IAnimal> animales = new LinkedList<IAnimal>();

		animales.add(new Cerdo());
		animales.add(new Conejo());
		animales.add(new Oso());
		animales.add(new Panda());
		animales.add(new Pez());
		animales.add(new PuercoEspin());
		animales.add(new Tortuga());
		animales.add(new Vaca());

		animales.add(new Perico());
		animales.add(new Tucan());
		animales.add(new Paloma());
		//////////////////////////////////////////////////////////
		for (IAnimal animal : animales) {
			animal.alimentar();
		}
		System.out.println("*******************************");
		///////////////////////////////////////////////////////////
		for (IAnimal animal : animales) {
			animal.volar();
		}
	}

}
