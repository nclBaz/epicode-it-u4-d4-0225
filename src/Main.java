import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {

		// Animal a = new Animal("Maurizio", 20);
		//a.sayYourName();

		Dog d = new Dog("Rex", 5, true);
		//d.sayYourName();
		d.sayYourName("CIAOOOOOOOOOO");

		Cat c = new Cat("Felix", 2, true);
		//c.sayYourName();

		// Upcasting -> posso usare solo i metodi comuni a tutti gli Animal, ma quando
		// li userò, se c'è un override verrà usato quello
		Animal a2 = new Dog("Giorgio", 2, false);
		a2.sayYourName(); // Qua viene usato l'override del figlio
		// a2.bark() se sfrutto l'upcasting non potrò usare i metodi specifici del cane
		
	}
}