public class Registro<K, V> {
    private K id;
    private V dato;

    public Registro(K id, V dato){
        this.id = id;
        this.dato = dato;
    }

    public K getId(){
        return id;
    }

    public V getDato(){
        return dato;
    }
}
