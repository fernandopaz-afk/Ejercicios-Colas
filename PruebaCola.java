
package EjercicioCola;
import java.util.*;

public class PruebaCola {
    public static void main(String args[]){
        int num=0;
        int b,c;
         Scanner a = new Scanner(System.in);
         
        System.out.println("Cuantos numeros desea apilar");
         b=a.nextInt();
        
    ColaEntera cl = new ColaEntera(b);
    try{
        for(int i=0;i<b;i++){
    System.out.println("Que numero desea agregar ? ");    
    c=a.nextInt();
    cl.enconlar(c);
    
        }
    
    for(int i=0;i<b;i++){
    int p=1;
    
     num=cl.sacar();
     p++;
    System.out.println("SALIO el numero "+num+" en la posicion "+p);
   
    }
    //Sacar un numero 
   
    
    
    
     }catch(ExcepcionColaLlena Err){
     System.out.println(Err.getMessage());
     }catch(ExcepcionColaVacia Err){
     System.out.println(Err.getMessage());
     }
   
    } 
}
