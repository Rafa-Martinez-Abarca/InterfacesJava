public class Motor {
    private String tipo;
    private int caballos;

    public Motor(String tipo, int caballos){
        this.tipo = tipo;
        this.caballos = caballos;
    }


    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getCaballos(){
        return caballos;
    }

    public void setCaballos(int caballos){
        this.caballos = caballos;
    }

    public String toString(){
        return "Tipo: " + tipo + ", Caballos: " + caballos;
    }
}
