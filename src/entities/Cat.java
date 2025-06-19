package entities;

public class Cat extends Animal {
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
}
