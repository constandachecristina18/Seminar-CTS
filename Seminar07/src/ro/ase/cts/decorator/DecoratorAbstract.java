package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract {
	private Card card;
	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}
	
	public Card getCard() {
		return card;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		// TODO Auto-generated method stub
		card.realizeazaPlataOnline(suma);
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		// TODO Auto-generated method stub
		card.realizeazaPlataNormala(suma);
	}
	
   public abstract void platesteContactLess(int suma);
}