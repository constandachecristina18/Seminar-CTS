package ro.ase.cts.proxy;

import ro.ase.cts.proxy.OperatorRezervari;
import ro.ase.cts.proxy.ProxyOperatorRezervari;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorRezervari operator=new OperatorRezervari();
		operator.realizeazaRezervare("Andrei", 1);
		
		ProxyOperatorRezervari proxy=new ProxyOperatorRezervari(operator, 4);
		proxy.realizeazaRezervare("Ion", 1);
		proxy.realizeazaRezervare("Mihai", 4);
	}

}