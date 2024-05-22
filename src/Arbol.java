public class Arbol {
    public Nodo raiz;

    public Arbol(){
        this.raiz=null;
    }
    public Arbol(Nodo w){
        this.raiz=w;
    }
    
    public void crearArbol(String datoIzquierdo, String datoDerecho, String datoPadre, String datoizquierdo2, String datoDerecho2, String datoPadre2, String raiz){
        Nodo ramaIzq = new Nodo (datoIzquierdo);
        Nodo ramaDer = new Nodo (datoDerecho);
        Nodo padreIzq= new Nodo (ramaIzq, datoPadre, ramaDer);
    
        ramaIzq= new Nodo (datoizquierdo2);
        ramaDer = new Nodo(datoDerecho2);
        Nodo padreDer = new Nodo(ramaIzq, datoPadre2, ramaDer);
        this.raiz = new Nodo(padreIzq, raiz, padreDer);
        
    }
    public void recorrerPreOrden(Nodo a){
        if(a==null){
            return;
        } else {
            System.out.println(a.getDato()+" ");
            recorrerPreOrden(a.getIzquierdo());
            recorrerPreOrden(a.getIzquierdo());
        }
    }
}
