
package EjercicioCola;


public class ColaGen <T>{
     
     private T Esquina[];
    private int Frente;
    private int Siguiente;
    public ColaGen(int N){
        Esquina =(T[])new Object[N];
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
    public void enconlar(T Num)throws ExcepcionColaLlena{
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
    public T sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
        throw new ExcepcionColaVacia();
        }
    T valor= Esquina[Frente];
    Frente++;
    return valor;
    }
}
