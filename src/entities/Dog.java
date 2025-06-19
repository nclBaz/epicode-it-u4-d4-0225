package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {
	// Dog è FIGLIO di Animal
	// Significa che ereditiamo tutti gli attributi ed i metodi dal padre
	// Possiamo però anche aggiungere ulteriori attributi/metodi
	// che però saranno solo proprietà di Dog

	// Lista attributi
	private boolean isACop; // Attributo esclusivo dei Dog

	// Lista costruttori
	public Dog(String name, int age) {
		super(name, age); // Chiamo il costruttore della superclasse
	}

	public Dog(String name, int age, boolean isACop) { // OVERLOAD DI COSTRUTTORE
		this(name, age); // Richiamo il primo costruttore per non ripetere codice
		this.isACop = isACop;
	}

	@Override
	public void getInfo() {
		System.out.println("Il mio nome è: " + this.name);
		System.out.println("La mia età è: " + this.age);
		System.out.println("Sono un poliziotto? " + this.isACop);
	}

	// Lista metodi
	public void bark() { // Metodo esclusivo dei Dog
		System.out.println("BAU!");
	}

	@Override
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più specifici sono un cane e mi chiamo " + this.name);
	}

	public void sayYourName(String saluto) {
		this.sayYourName();
		System.out.println(saluto);
	}

	public boolean isACop() {
		return isACop;
	}

	public void setACop(boolean ACop) {
		isACop = ACop;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"isACop=" + isACop +
				"} " + super.toString();
	}

	@Override
	public void run(int km) {
		System.out.println("Ciao sono un cane e ho corso per " + km + " km");
	}
}
