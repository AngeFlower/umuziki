public class Music {
	
	private String Nom_chanteur,titre_Music;
	private static Vector bd_music;

	public Music(String titre_Music, String No_chant){
		this.Nom_chanteur = No_chant;
		this.titre_Music= titre_Music;
		if(Music.bd_music==null)
			Music.bd_music=new Vector();

		Music.bd_music.addElement(this);
	}

	public static void afficher_Toutes_Musics(){
		
		if(Music.bd_music==null || Music.bd_music.size()==0)
			System.out.println("Pas de Music enregistrée");
		else {
			System.out.println("Liste des Musics déjà enregistrées");
		  	for(int i=0;i<Music.bd_music.size();i++)
		  		System.out.println((i+1)+"-"+(Music)Music.bd_music.elementAt(i));
		}
		}
	public String toString(){
	  return "Music ["+titre_Music+" "+Nom_chanteur+"]";
  }
  public static Vector getBd_music() {
		return bd_music;
	}
	}