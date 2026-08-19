public class Barco extends Vehiculos implements Navegable{
    int numeroCamarotes;

    public Barco(String marca, String modelo, int velocidadMaxima, int numeroCamarotes){
        super(marca, modelo, velocidadMaxima);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes(){
        return numeroCamarotes;
    }

    @Override
    public void desplazarse() {
        System.out.println(" Se desplaza por el mar. ");
    }

    @Override
    public void navegar() {
        System.out.println("El barco navega. ");
    }

    @Override
    public String toString() {
        return super.toString() + " El numero de camarotes es. " + numeroCamarotes;
    }
}
