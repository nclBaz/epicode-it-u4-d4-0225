package entities;

public abstract class Animal {
	// La classe animal sarà la SUPERCLASSE
	// In questa classe andrò ad inserire tutte le caratteristiche comuni a tutti gli animali

	// Lista attributi
	protected String name;
	protected int age;

	// Lista costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Lista metodi
	// Nelle classi ASTRATTE posso inserire sia metodi CONCRETI che ASTRATTI

	// Metodi ASTRATTI
	// I metodi ASTRATTI sono metodi 'vuoti', che servono per obbligare i figli
	// ad avere quel metodo
	// Ogni figlio potrà implementare quel metodo come gli pare facendo un Override
	// Questo mi garantirà con certezza che ogni figlio avrà un metodo fatto così
	public abstract void getInfo();

	// Metodi CONCRETI
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
