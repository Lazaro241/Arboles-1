public class Nodo{
    private String dato;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(String dato){
        this.dato=dato;
        this.izquierdo=null;
        this.derecho=null;
    }
    public Nodo (Nodo izq, String dato, Nodo der){
        this.izquierdo=izq;
        this.derecho=der;
        this.dato=dato;
    }

    public void setIzquierdo(Nodo izq){
        this.izquierdo=izq;
    }
    public void setDerecho(Nodo der){
        this.derecho=der;
    }
    public void setDato(String d){
        this.dato=d;
    }

    public Nodo getIzquierdo(){
        return this.izquierdo;
    }
    public Nodo getDerecho(){
        return this.derecho;
    }
    public String getDato(){
        return this.dato;
    }


}