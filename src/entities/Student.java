package entities;

import entities.enums.TipoStudente;
import interfaces.Jumper;
import interfaces.Runner;

import java.util.Objects;
import java.util.Random;

public class Student implements Runner, Jumper {
	// ATTRIBUTI STATICI (attributi di classe, cioè non serve un oggetto per utilizzarli)
	public static int numStudentiCreati = 0;

	// ATTRIBUTI
	private final int id; // Generato dal programma
	private String surname;
	private boolean isFullStack;
	private TipoStudente tipoStudente;  // I possibili valori sono: FRONTEND, BACKEND, FULLSTACK, CYBER
	private String name;

	// COSTRUTTORI

	// I COSTRUTTORE

	public Student() {
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		this.name = "DEFAULT NAME";
		this.surname = "DEFAULT SURNAME";
		this.isFullStack = true;
		this.tipoStudente = TipoStudente.FULLSTACK;
		numStudentiCreati++;
	}

	// II COSTRUTTORE
	public Student(String name, String surname, boolean isFullStack, TipoStudente tipoStudente) {
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		this.name = name;
		this.surname = surname;
		this.isFullStack = isFullStack;
		this.tipoStudente = tipoStudente;
		numStudentiCreati++;
	}

	// METODI STATICI
	public static int getNumStudentiCreati() {
		return numStudentiCreati;
	}

	// GETTERS. quando i miei attributi sono private, non sono più leggibili dall'esterno
	// quindi se volessi dare l'accesso in lettura ad alcuni di questi basterebbe creare
	// dei metodi getter

	public String getName() {
		return name;
	}

	// SETTERS  quando i miei attributi sono private, non sono più sovrascrivibili dall'esterno
	// quindi se volessi dare l'accesso in scrittura ad alcuni di questi basterebbe creare
	// dei metodi setter
	// I Setter consentono inoltre di poter eseguire della logica aggiuntiva, come ad esempio
	// dei controlli che mi validino il valore che viene passato. Se il valore sta bene sovrascriverò
	// l'attributo, altrimenti --> errore
	public void setName(String name) {
		if (name.length() > 3) this.name = name;
		else System.out.println("NOME TROPPO CORTO!");
	}

	public TipoStudente getTipoStudente() {
		return tipoStudente;
	}

	public void setTipoStudente(TipoStudente tipoStudente) {
		this.tipoStudente = tipoStudente;
	}

	public boolean isFullStack() {
		return isFullStack;
	}

	public void setFullStack(boolean fullStack) {
		isFullStack = fullStack;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	// METODI (ovvero le azioni che un oggetto di tipo Studente potrà eseguire)
	public void sayHello() {
		System.out.println("Ciao io sono " + this.name + " " + this.surname + ", il mio id è: " + this.id);
	}

	public void sayHello(String name) {
		System.out.println("Ciao " + name);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass()) return false;
		Student student = (Student) o; // CASTING ESPLICITO da Object a Student
		return id == student.id && isFullStack == student.isFullStack && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullStack=" + isFullStack +
				", tipoStudente=" + tipoStudente +
				'}';
	}

	@Override
	public void run(int km) {
		System.out.println("Ciao sono uno studente di nome " + this.name + " e correrò " + km + " per scappare dalla lezione di Java");
	}

	@Override
	public void jump(int cm) {
		System.out.println("Ciao sono uno studente di nome " + this.name + " e salterò " + cm + " benchmark");
	}
}
