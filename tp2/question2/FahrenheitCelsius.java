package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        int fahrenheit = 0;
        float celsius = 0;
        for(int i = 0; i<args.length; i++){
            try{
                fahrenheit = java.lang.Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) + "\u00B0C");
           }catch(NumberFormatException expression){
               
           System.out.println("error : " +expression.getMessage());  
       }
       
     }
    }
     /** 
      *
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
        float celsius = (float)5/9*(f-32);
        return ((int)(celsius*10)/10.0F);
     }

}