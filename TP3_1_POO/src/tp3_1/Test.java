package tp3_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule v = new Vehicule("Clio", "Classique", 20.000, 2000);
		Vehicule w = new Vehicule("Mercedes", "Fantome", 60.000, 2008);
		Vehicule x = new Vehicule("Kia", "Picanto", 35.000, 2012);
		AgenceMobiliere ag = new AgenceMobiliere(3);
		
		
	/*	v.DecrisVehicule();
		w.DecrisVehicule();
		x.DecrisVehicule();
		*/
		ag.ajoutVehicule(v);
		ag.ajoutVehicule(w);
		ag.ajoutVehicule(x);
		System.out.println();
		ag.selection("Mercedes");
		System.out.println();
		ag.selection(40.000);
		System.out.println("*****");
		ag.ancienneVoit();
		
		
		
	
		
	}

}
