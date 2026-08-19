import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boing", "77", 879, 2);
        Hidroavion hidroavion = new Hidroavion("Boing", "77", 500, true, 2);
        Barco barco = new Barco("Toyota", "se", 120, 3);
    
    
        
        ArrayList<Volador> voladores = new ArrayList<>();
            voladores.add(avion);
            voladores.add(hidroavion);
        for (Volador volador : voladores) {
            volador.volar();
        }

       

        ArrayList<Navegable> navegables = new ArrayList<>();
         navegables.add(hidroavion);
         navegables.add(barco);
         for (Navegable navegar : navegables) {
            navegar.navegar();
         }

        


         ArrayList<Vehiculos> vehiculos = new ArrayList<>();
         vehiculos.add(hidroavion);
         vehiculos.add(avion);
         vehiculos.add(barco);
         
         for (Vehiculos vehiculo : vehiculos) {
            
            if (vehiculo instanceof Volador volador) {
                
                volador.volar();
                
            }
            
            if(vehiculo instanceof Navegable){
                Navegable navegable = (Navegable) vehiculo;
                navegable.navegar();
            }System.out.println(vehiculo);
         }

         
         
    }

}
