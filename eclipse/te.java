public class Test {

	static void Menu(){
		
		System.out.println("1.Pour inserer une Music");
		System.out.println("2.Enregistre une Vente");
		System.out.println("3.Affiche la liste des musics ");
		System.out.println("4.Pour quitter");
		switch(){
			case 1:
				break;
			case 2:
				Music musi= null;
				Music.afficher_Toutes_Musics();
				System.out.println("1 pour continuer la vente");
			    System.out.println("0 Pour arreter le processus de vente");
			    switch(Inseretion.Inseretion.saisir_Entier("")){
			    case 1:
			    	musi=(Music) Music.getBd_music().elementAt(Inseretion.Inseretion.saisir_Entier("Choisissez le numero de la Music(index)  que vous voulez acheter"));
			    	new Ventes(new Client(Inseretion.Inseretion.saisir_ChaineCaracteres("Entrez le nom du Client"),
			    					Inseretion.Inseretion.saisir_ChaineCaracteres("Entrez le Prenom du Client"),
			    					Inseretion.Inseretion.saisir_ChaineCaracteres("Entrez le Adresse du Client"),
			    					Inseretion.Inseretion.saisir_ChaineCaracteres("Entrez le numero telephone du Client")),
			    					Inseretion.Inseretion.saisir_ChaineCaracteres("Entrez le prix de la Music"),musi);
					break;
				case 0:
					System.out.println("votre vente a ete suspendu");
					break;
				}
			break;
			case 3:
				Music.afficher_Toutes_Musics();
				break;
			case 4:
				System.exit(0)
				break;
		}
		}
	static void AppelMenu(){
		while(true)
			Menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppelMenu();
	}
	}