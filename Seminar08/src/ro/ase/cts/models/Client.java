package ro.ase.cts.models;

public class Client implements Observer{
	private String nume;
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+this.nume+" a primit mesajul "+mesaj);
	}

}