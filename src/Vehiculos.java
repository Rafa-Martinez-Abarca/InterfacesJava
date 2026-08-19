public abstract class Vehiculos{
    String marca;
    String modelo;
    int velocidadMaxima;
    
    public Vehiculos(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }


    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public abstract void desplazarse();
    
    @Override
    public String toString(){
        return "Marca: " + marca + " Modelo; " + modelo + " Velocidad: ";
    }

}
