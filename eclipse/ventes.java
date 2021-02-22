
public class Ventes {

	private Client cl;
	private String prix;
	private Music mus ;
	
	private static ArrayList<Inscription> db_Ventes;
	public Ventes(Client cl,String prix,Music mus){
		this.cl=cl;
		this.prix=prix;
		this.mus=mus;
		
		if(db_Ventes==null)
			db_Ventes=new ArrayList<Ventes>();
		db_Ventes.add(this);
			
	}
}