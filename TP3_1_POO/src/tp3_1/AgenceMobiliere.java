package tp3_1;

public class AgenceMobiliere {
	
	public final int max;
	public int nb=0;
	public Vehicule[] TabV ;
	
	public AgenceMobiliere(int max) {
		this.max = max;
		this.TabV=new Vehicule[max];
	}
	
	void ajoutVehicule(Vehicule v) {
		
		
			if (nb<max) {
				TabV[nb]=v;
				nb++;
		}
			else {
				System.out.println("no place found");
		}
	}
	
	public void selection(int n) {
		for(nb=0; nb<TabV.length;nb++) {
			if((nb==n)&& (TabV[nb]!=null)){
				
				System.out.println(toString());
			}
			else {
				System.out.println("Cette case n'existe pas / vide! ");
			}
		}
		
	}
	
	void selection(String mq) {
		for(nb=0; nb<TabV.length;nb++) {
			if(TabV[nb].getMarque().equals(mq)) {
				TabV[nb].DecrisVehicule();
			}
		}
		
		
	}
	void selection(Double px) {
		for(nb=0; nb<TabV.length;nb++) {
			if(TabV[nb].getPrix()<px) {
				TabV[nb].DecrisVehicule();
				
			}
		}
		
		
	}
	
	void ancienneVoit() {
		Vehicule Va= TabV[0];
		//double i=TabV[0].getAnneeCreation();
		for(int i=1; i<TabV.length;i++) {
			if(TabV[i].getAnneeCreation()<Va.getAnneeCreation()) {
				
				Va=TabV[nb];
			}
		}
		Va.DecrisVehicule();
		
		
	}
	
	
	
	
	
	

}
