package tp6;

public class MaListe {
	public HashCouple couple;
	public MaListe liste;
	
	public MaListe(){}
	
	public MaListe(HashCouple couple, MaListe liste){
		this.couple=couple;
		this.liste=liste;
	}
	
	public void ajout(HashCouple couple){
		if(liste==null){
			liste= new MaListe();
		}else{
			liste.ajout(couple);
		}
		
	}
	
	public void retire(HashCouple couple){

	}
	
	
}
