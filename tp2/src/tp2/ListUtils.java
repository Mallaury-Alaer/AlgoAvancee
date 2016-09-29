package tp2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListUtils {
	Iterator i;


	public List<Integer> genereRdmIntList(){
		int t=1 + new Random().nextInt(30);
		List<Integer> liste = new ArrayList<Integer>();
		for(int i=0; i<t; i++){
			liste.add(i, 1+new Random().nextInt(100));
		}
		return liste;
	}
	
	
	public void affiche(List<Integer> l ){
		i = l.iterator();
		while(i.hasNext()){
			System.out.print(i.next());	
			if(i.hasNext()){
				System.out.print(" -> ");
			}
		}
		System.out.print("\n");
	}
	
	public void afficheInverse(List<Integer>l){
		ListIterator<Integer> li = l.listIterator(l.size());
		while(li.hasPrevious()){
			System.out.print(li.previous());
			if(li.hasPrevious()){
				System.out.print(" -> ");
			}
		}
		System.out.print("\n");
	}
	
	public int somme(List<Integer> l){
		int somme=0;
		i = l.iterator();
		while(i.hasNext()){
			somme = somme +(int)i.next();
		}
		return somme;
	}
	
	public int moyenne(List<Integer>l){
		return somme(l)/l.size();
	}
	
	public int max(List<Integer> l){
		int max=0;
		for(int i=0; i<l.size();i++){
			if(l.get(i)>max){
				max=l.get(i);
			}
		}
		return max;
	}
	
	public int min(List<Integer> l){
		int min=max(l);
		for(int i=0; i<l.size();i++){
			if(l.get(i)<min){
				min=l.get(i);
			}
		}
		return min;
	}
	
	public List<Integer> positions(List<Integer> l, int n){
		List<Integer> positions = new ArrayList<Integer>();
		Iterator<Integer>it= l.iterator();
		int i=0;
		while(it.hasNext()){
			if(it.next()==n){
				positions.add(i);
			}
			i++;
		}
		return positions;
	}
	
	public List<Integer> paire(List<Integer> l){
		List<Integer> paire = new ArrayList<Integer>();
		Iterator<Integer>it= l.iterator();
		while(it.hasNext()){
			int n = it.next();
			if(n%2==0){
				paire.add(n);
			}
		}
		return paire;
	}
	
	public boolean estTrie(List<Integer> l){
		for(int i=0; i<l.size()-1; i++){
			if(l.get(i)>l.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public List<Integer> trie(List<Integer> l){
		List<Integer> trie= new ArrayList<Integer>();
		while(l.size()>0){
			trie.add(min(l));
			l.remove(l.indexOf(min(l)));
		}
		return trie;
	}
}
