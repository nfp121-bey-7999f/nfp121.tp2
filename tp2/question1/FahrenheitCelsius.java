package question1;

/**
 * c'est une  methode prend un ou plusieurs nombres et les transformes du  fehrenheit en celsius
 * 
 * @author (Arda Topjian )
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
   
     * premierement : on initialise  fahreneit  et celsius en  0  
     
     * @param args
     *  deuxiemement :l'utilisation de la boucle  "for" parcours tous les array et  prend chaque valeur 
     *  et  la transforme en int 
     * puis on fait appel  a la methode fahrenheitEnCelsius  dans la variable celsius 
     * et finalement l'affichage 
     * 
     */
	public static void main(String[] args) {
		int fahrenheit = 0;
		float celsius = 0;
		   for(int i = 0; i<args.length; i++){
            //This method returns the integer value represented by the argument in decimal.
            fahrenheit = java.lang.Integer.parseInt(args[i]);
            celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) + "\u00B0C"); 
        }                                                                 

    }

		
	

	/**
	
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	
		public static float fahrenheitEnCelsius(int f) {
        float cel = (float)5/9*(f-32);
        return ((int)(cel*10)/10.0F);
	}

}