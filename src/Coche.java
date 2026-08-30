import java.util.Objects;

public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;

    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo  = modelo;
        this.motor = motor;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Motor getMotor(){
        return motor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Override
    public String toString() {
        
        return "Marca: " +  marca + ", Modelo " + modelo + ", Motor: " + motor;
    }
    // Comprar objetos.
    @Override

    public boolean equals(Object obj){
        //Objeto es diferente a tipo coche
        if(!(obj instanceof Coche coche)){
            return false;
        }
        //Comparamos marca y modelo con la marca y el modelo del objeto que le estamos pasando.
        if (this.getMarca().equals(coche.getMarca()) && this.getModelo().equals(coche.getModelo())) {
                return true;
            }

        return false;
    }


    @Override

    public int hashCode(){
        return Objects.hash(marca, modelo);
    }
}
