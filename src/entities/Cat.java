package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Cat è FIGLIO di Animal
	// Significa che ereditiamo tutti gli attributi ed i metodi dal padre
	// Possiamo però anche aggiungere ulteriori attributi/metodi
	// che però saranno solo proprietà di Cat

	// Lista attributi
	private boolean hasBoots; // Attributo esclusivo dei Cat

	// Lista costruttori

	public Cat(String name, int age, boolean hasBoots) {
		super(name, age);
		this.hasBoots = hasBoots;
	}

	// Lista metodi
	public void meow() { // Metodo esclusivo dei Cat
		System.out.println("MIAO!");
	}

	@Override
	public void getInfo() {
		System.out.println("Il mio nome è: " + this.name);
		System.out.println("La mia età è: " + this.age);
		System.out.println("Ho gli stivali? " + this.hasBoots);
	}

	@Override
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più specifici sono un gatto e mi chiamo " + this.name);
	}


	public boolean isHasBoots() {
		return hasBoots;
	}

	public void setHasBoots(boolean hasBoots) {
		this.hasBoots = hasBoots;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"hasBoots=" + hasBoots +
				"} " + super.toString();
	}

	@Override
	public void jump(int cm) {
		System.out.println("Ciao sono un gatto e ora salterò di " + cm + " cm");
	}
}
