package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		   
		  Kort[] kortsamling = samling.getAllekort();
		  
	        for (int i = 1; i < kortsamling.length; i++) {
	            int j = i;
	            while ( j > 0 && (kortsamling[j-1].compareTo(kortsamling[j]) > 0 ) ) {  
	            	Kort k = kortsamling[j];
	            	kortsamling[j] = kortsamling[j-1]; 
	            	kortsamling[j-1] = k;
	            	j--;
	            }  
	            
	        }  
	        samling.fjernAlle();
	        
	        for (int i = 0; i < kortsamling.length; i++) {
	        	samling.leggTil(kortsamling[i]);
	        }
	        
	    } 
		
		
	
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Random random = new Random();
		
        for (int i = samling.getSamling().length - 1; i > 0; i--) {
          int j = random.nextInt(i);

          Kort temp = samling.getSamling()[i];
          samling.getSamling()[i]= samling.getSamling()[j];
          samling.getSamling()[j]= temp;

        }

	}
	
}
