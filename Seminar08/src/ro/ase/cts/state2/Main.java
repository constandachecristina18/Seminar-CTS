package ro.ase.cts.state2;

import ro.ase.cts.state2.Masa;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa(10);
		masa.ocupaMasa();
		masa.rezervaMasa();
		//masa.setStare(new StareLibera());
		//masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}