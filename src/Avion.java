public class Avion extends Vehiculos implements Volador {
 private int numeroMotores;
 
 public Avion(String marca, String modelo, int velocidadMaxima, int numeroMotores){
    super(marca, modelo, velocidadMaxima);
    this.numeroMotores = numeroMotores;
}
    public int getNumeroMotores(){
        return numeroMotores;
    }

    @Override
    public void volar() {
        System.out.println(" El avion vuela. ");
    }

    @Override
    public void desplazarse() {
        System.out.println(" Se desplaza por el aire. ");
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de motores. " + numeroMotores;
    }
 
}
