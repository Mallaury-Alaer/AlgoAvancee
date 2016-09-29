package tp4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ExoSet {
	public static void main(String args[]){
		Set<Integer> ens1 = new HashSet<Integer>();
		Set<Integer> ens2 = new HashSet<Integer>();
		
		Random r = new Random();
		
		for(int i = 0; i<3;i++){
			ens1.add(r.nextInt(10));
			ens2.add(r.nextInt(10));
		}
		
		
		afficher(ens1);
		afficher(ens2);
		afficher(inter(ens1,ens2));
		afficher(union(ens1, ens2));
		System.out.print(isIn(ens1,ens2));
	}
		
	public static void afficher(Set<Integer> ens){
		Iterator<Integer> i = ens.iterator();
		System.out.print("["+ens.size()+"] { ");
		while(i.hasNext()){
			System.out.print(i.next());
			if(i.hasNext()){
				System.out.print(", ");
			}
		}
		System.out.println(" } \n");
	}
	
	public static Set<Integer> inter(Set<Integer> set1, Set<Integer> set2){
		Iterator<Integer> it1 = set1.iterator();
		Set<Integer> res = new HashSet<Integer>();
		int n;
		while(it1.hasNext()){
			n=it1.next();
			if(set2.contains(n)){
				res.add(n);
			}
		}
		return res;
		
	}
	
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> res = new HashSet<Integer>();
		Iterator<Integer> it1 = set1.iterator();
		Iterator<Integer> it2 = set2.iterator();
		
		while(it1.hasNext() || it2.hasNext()){
			if(it1.hasNext()){
				res.add(it1.next());
			}
			if(it2.hasNext()){
				res.add(it2.next());
			}
		}
		return res;
		
	}
	
	public static boolean isIn(Set<Integer> set1, Set<Integer> set2){
		Iterator<Integer> it = set1.iterator();
		boolean res = false;
		while(it.hasNext()){
			if(set2.contains(it.next())){
				res=true;
			}else{
				return false;
			}
		}
		
		return res;
	}

	
	
		
}
