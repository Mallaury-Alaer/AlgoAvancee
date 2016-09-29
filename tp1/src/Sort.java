import java.util.Random;

/**
 * SDD Seance TP 1 :
 *
 * @author <a href="mailto:Frederic.Guyomarch@univ-lille1.fr">Frédéric Guyomarch</a>
 * IUT-A, Universite de Lille, Sciences et TEchnologies
 */
public class Sort {
	

    public static int [] generateRdmIntArray(int n, int min, int max){
    	int[] tab= new int[n];
    	for(int i=0; i<n; i++){
    		tab[i]=min + new Random().nextInt(max-min);
    	}
		return tab;
    }
    
    public static void insertSort(int [] tab) {
    	int tailleTri=1;
    	while(tailleTri != tab.length){
    		tailleTri++;
    	}
    }
    
    public static int indiceMin(int[] tab, int iBeg, int iEnd){
    	int min=iBeg;
    	for(int i= iBeg; i<iEnd; i++){
    		if(tab[min]>tab[i]){
    			min=i;
    		}
    	}
    	return min;
    }

    public static void selectSort(int [] tab){
    	int iMin;
    	for(int i=0; i<tab.length;i++){
    		iMin=indiceMin(tab, i, tab.length);
    		swap(tab, i, iMin);
    	}
    }

    public static void printArray(int [] tab){
    	for(int i=0; i<tab.length; i++){
    		System.out.println(tab[i] + " | ");
    	}
    }

    public static void swap(int [] tab, int idx, int idx2){
    	int tmp=tab[idx];
    	tab[idx]=tab[idx2];
    	tab[idx2]=tmp;
    }

    public static void bubbleSort(int [] tab){
    	boolean tri=false;
    	while(!tri){
    		tri=true;
    		for(int i=0; i<tab.length-1; i++){
    			if(tab[i]>tab[i+1]){
    				swap(tab, i, i+1);
    				tri=false;
    			}
    		}
    	}
    }


}

