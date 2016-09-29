import java.util.Stack;

public class Parcours {
	public static void main(String args[]){
		Labyrinthe l = new Labyrinthe();
		Stack<Cellule> pile = new Stack<Cellule>();
	
		pile.push(new Cellule(0,1));
		l.poserMarque(0, 1);
		Cellule c = new Cellule(1,1);
		l.poserMarqueRetour(c.x,c.y);
		while(!pile.empty()){
			pile.pop();
			if(c.equals(new Cellule(l.n(), l.n()-1))){
				System.out.println("Sortie trouvée!");
			}else{
				if(!l.estMarque(c.x+1, c.y) && !l.estMur(c.x+1, c.y)){
						l.poserMarque(c.x+1,  c.y);
					c=new Cellule(c.x+1, c.y);
					pile.push(c);
				}
				else if(!l.estMarque(c.x, c.y+1) && !l.estMur(c.x, c.y+1)){
					if(l.estMarque(c.x, c.y+1)){
						l.poserMarqueRetour(c.x,  c.y+1);
						c=new Cellule(c.x, c.y+1);
						pile.push(c);
					}
					else{
						l.poserMarque(c.x,  c.y+1);
						c=new Cellule(c.x, c.y+1);
						pile.push(c);
					}
				}
				else if(!l.estMur(c.x, c.y-1)){
					if(l.estMarque(c.x, c.y-1)){
						l.poserMarqueRetour(c.x,  c.y-1);
						c=new Cellule(c.x, c.y-1);
						pile.push(c);
					}else{
						l.poserMarque(c.x,  c.y-1);
						c=new Cellule(c.x, c.y-1);
						pile.push(c);
					}
				}
				else if(!l.estMur(c.x-1, c.y)){
					if(l.estMarque(c.x-1, c.y)){
						l.poserMarqueRetour(c.x-1,  c.y);
						c=new Cellule(c.x-1, c.y);
						pile.push(c);
					}else{
						l.poserMarque(c.x-1,  c.y);
						c=new Cellule(c.x-1, c.y);
						pile.push(c);
					}
				}
				
			}
			try {
				Thread.sleep(20) ;
				}
				catch(InterruptedException e){}
		}
		System.out.println("Il n'y a pas de chemin reliant l'entrée a la sortie");
	}
}
