
package bloetin91;

import java.util.Scanner;


public class Numeros {
    int n, ceros, positivos, negativos;
    
    
    public Numeros(){
        
        
    }
    
    public void contador(){
        for(n=0;n<10;n++){
            Scanner dato=new Scanner(System.in);
            System.out.println("Introduce un número");
            n=dato.nextInt();
            if(n<0){
                negativos++;
            }
            else if(n>0){
                positivos++;
            }
            else{
                ceros++;
            }
            
        }
    }
    
    public void resultado(){
        System.out.println("Número negativo: "+negativos+" Números positivos; "+positivos+" Ceros: "+ceros);
    }
    
}
