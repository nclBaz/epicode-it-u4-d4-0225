import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;
import entities.enums.TipoStudente;
import interfaces.Jumper;
import interfaces.Runner;

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

		Student aldo = new Student("Aldo", "Baglio", true, TipoStudente.FULLSTACK);


		// ----------------------------------------- POLIMORFISMO --------------------------------------------
		Animal[] animals = {d, c, new Cat("Tom", 1, true), new Dog("Lassie", 10, false)};
		// Array polimorfico, ovvero un array misto di cani e gatti...posso farlo perché entrambi sono Animal

		for (int i = 0; i < animals.length; i++) {
			Animal currentAnimal = animals[i];
			currentAnimal.sayYourName();
			currentAnimal.getInfo();
			// Se utilizzo un array polimorfico probabilmente è per utilizzare con un ciclo i metodi che essi hanno in comune

			// Se volessi usare metodi SPECIFICI di un animale tipo Cat o Dog, posso farlo tramite il CASTING ESPLICITO
			if (currentAnimal instanceof Dog) {
				Dog currentDog = (Dog) currentAnimal; // CAST ESPLICITO da Animal a Dog, lo posso fare senza problemi perché prima ho verificato con
				// instanceof che effettivamente quell'elemento sia un Dog
				currentDog.bark();
			} else { // Per esclusione se non è un Dog sarà un Cat
				Cat currentCat = (Cat) currentAnimal;
				currentCat.meow();
			}
		}

		// Altro array polimorfico, stavolta con interfaccia
		Runner[] runners = {d, aldo};

		for (int i = 0; i < runners.length; i++) {
			runners[i].run(10);
		}

		Jumper[] jumpers = {aldo, c};
		for (int i = 0; i < jumpers.length; i++) {
			jumpers[i].jump(100);
		}

		printAnimal(c);
		printAnimal(d);

	}

	public static void printAnimal(Animal animal) { // Come parametro posso passare SIA CANI CHE GATTI
		// Sempre grazie al polimorfismo possiamo creare dei metodi che accettino parametri più generici per rendere questi metodi compatibili con più
		// tipi possibile aumentandone la versatilità
		animal.getInfo();

	}

	public static void printAnimal(Dog dog) { // Come parametro posso passare SOLO CANI
		dog.bark();
	}
}