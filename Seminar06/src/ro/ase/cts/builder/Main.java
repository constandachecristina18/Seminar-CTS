package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		
		Rezervare r1 = new Rezervare(12345, false, false, false, true, "Rock");
		
		Rezervare r2=new RezervareBuilder().setCodRezervare(15).setAreScaunErgonomic(true).build();
		
		Rezervare r3 = new RezervareBuilder(16).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		RezervareBuilder rb = new RezervareBuilder();
		Rezervare r4 = rb.setCodRezervare(21).setAreBauturaInclusa(true).build();
		
		
		System.out.println(r4.toString());
		
		RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2();
		rezervareBuilderV2.setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true);
		Rezervare r5 = rezervareBuilderV2.setCodRezervare(4).build();
		Rezervare r6 = rezervareBuilderV2.setCodRezervare(5).build();
		
		System.out.println(r5.toString());
		System.out.println(r6.toString());
	}

	
}
