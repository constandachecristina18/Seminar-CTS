package ro.ase.cts.models;

public interface Observabil {
	void adaugaObserver(Observer observer);
	void stergeObserver(Observer observer);
	void trimiteMesaj(String mesaj);
}
