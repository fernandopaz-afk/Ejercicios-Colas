
package EjercicioCola;


public class ColaEntera {
    
     private int Esquina[];
    private int Frente;
    private int Siguiente;
    public ColaEntera(int N){
        Esquina = new int[N];
        //Posicion inicial de siguuiente
   Siguiente=0;
    //Posicion inicial de Freente
    Frente=-1;
    }
    public boolean colaLlena(){
    if(Siguiente==Esquina.length){
    return true;
    }else{
    return false;
    }
    }
    public void enconlar(int Num)throws ExcepcionColaLlena{
        if(colaVacia()){
        Frente=-1;
        Siguiente=0;
        }
        if(colaLlena()){
        throw new ExcepcionColaLlena();
        }
    Esquina[Siguiente]=Num;
    Siguiente++;
    //Cuando apenas se agregue un elemento 
    if(Siguiente==1){
    Frente=0;
    }
    }
    public boolean colaVacia(){
    if(Frente==Siguiente){
    return true;
    }else if(Frente==-1){
    return true;
    }else{
    return false;
    }
    }
    public int sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
        throw new ExcepcionColaVacia();
        }
    int valor= Esquina[Frente];
    Frente++;
    return valor;
    }
}
