public class Hidroavion extends Vehiculos implements Navegable, Volador {
    private boolean puedeAterrizarEnAgua;
    private int numeroMotores;

    public Hidroavion(String marca, String modelo, int velocidadMaxima, boolean puedeAterrizarEnAgua, int numeroMotores){
        super(marca, modelo, velocidadMaxima);
        this.puedeAterrizarEnAgua = puedeAterrizarEnAgua;
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores(){
        return numeroMotores;
    }

    public boolean getPuedeAterrizarEnAgua(){
        return puedeAterrizarEnAgua;
    }

    @Override
    public void navegar() {
        System.out.println(" El Hidrio Avión navega. ");
    }

    @Override
    public void desplazarse() {
        System.out.println(" Se puede desplazar por agua y por aire. ");
    }
    @Override
    public void volar() {
        System.out.println( " El hidroavion vuela. ");
    }

    @Override
    public String toString() {
        return super.toString() + " Puede desplazarse por agua? " + puedeAterrizarEnAgua + " El numero de motores es. " + numeroMotores;
    }
}
