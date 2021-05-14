package ro.ase.cts.state;

public class Masa {
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StateLibera();
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu codul "+this.cod+" este rezervata");
			this.stare=new StateRezervata();
		}
		else {
			System.out.println("Masa cu codul "+this.cod+" nu poate fi rezervata");
		}
	}
	
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa cu codul "+this.cod+" a fost ocupata.");
			this.stare=new StateOcupata();
		}
		else {
			System.out.println("Masa nu poate fi ocupata!");
		}
	}
	
	public void ridicaRezervare() {
		if(this.stare instanceof StateRezervata) {
			System.out.println("Masa cu codul "+this.cod+" este ocupata");
			this.stare=new StateOcupata();
		}
		else {
			System.out.println("Nu aveti rezervare!");
		}
	}
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof StateLibera)) {
			System.out.println("Masa cu codul "+this.cod+" a fost eliberata");
			this.stare=new StateLibera();
		}
		else {
			System.out.println("Masa este deja libera!");
		}
	}
}