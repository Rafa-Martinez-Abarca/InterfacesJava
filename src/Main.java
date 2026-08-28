import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    

    
    public static void main(String[] args) {
        
            Pedido pedido = new Pedido(20, "Pedro", EstadoPedido.PENDIENTE);

            System.out.println(pedido.getEstado().getDescripcion());

            
            

        

    

    ///////////////////////////////////////////////////////////////////////
        Motor motor = new Motor("Gasolina", 150);
        Motor motor1 = new Motor("Diesel", 90);
        Coche coche1 = new Coche("Seat", "Ibiza", motor);
        Coche coche2 = new Coche("Seat", "Ibiza", motor);
        Coche coche3 = new Coche("BMV", "S3", motor);
        Coche coche4 = new Coche("Seat ", "Leon", motor);

       coche1.setMotor(motor1);

       coche1.getMotor().setCaballos(300);
       

        Garaje garaje = new Garaje("Garaje el retiro");

        garaje.agregarCoches(coche1);
        garaje.agregarCoches(coche2);
        garaje.agregarCoches(coche1);

        //garaje.mostrarTodosLosCoches();

       //System.out.println(coche1.equals(coche3));

       
       

        //System.out.println(coche1.equals(coche2));


        HashSet<Coche> coches = new HashSet<>();

        coches.add(new Coche("Seat", "Toledo", motor1));
        coches.add(new Coche("Seat", "Toledo", motor1));
        coches.add(coche3);
        coches.add(coche4);

        //System.out.println(coches.size());




        HashMap<Integer, Coche> listaDecoches = new HashMap<>();

        listaDecoches.put(1, coche1);
        listaDecoches.put(2, coche2);
        listaDecoches.put(3, coche3);
       
        //Comprobar que existe la clave
        //System.out.println( listaDecoches.containsKey(2));
        //Obtener el valor asociado a una clave
        //System.out.println(listaDecoches.get(99));
        //borrar una entrada con la clave
        //listaDecoches.remove(3);
        //System.out.println(listaDecoches.get(3));
        //Cantida de entradas
        //System.out.println(listaDecoches.size());

        //// Recorrer HashMap
        for (Coche coche : listaDecoches.values()) {
            //System.out.println(coche);
        }

        //Recorre clave
        for (Integer clave : listaDecoches.keySet()) {
            //System.out.println(clave);
            //System.out.println(listaDecoches.get(clave));
        }

        //Rcorrer clave valor
        for (Map.Entry<Integer, Coche> entrada : listaDecoches.entrySet()) {
            //System.out.println(entrada.getKey());//clave
            //System.out.println(entrada.getValue());//valor
        }


       




        ArrayList<Vehiculos> vehiculos = new ArrayList<>();

            vehiculos.add(new Avion("Boeing", "737", 850, 2));
            vehiculos.add(new Barco("Yamaha", "X1", 80, 3));
            vehiculos.add(new Hidroavion("Cessna", "A1", 300, true, 1));
            vehiculos.add(new Hidroavion("Ces", "A1", 500, true, 2));
      
      
    }

    
    
    
    
/////////////////////////////////////////////////////////////////////////////////////
                
                               //HASHMAP
     public static Coche cocheConMasCaballos1(HashMap<Integer, Coche> listaDecoches){
            Coche cocheConMasCaballos  = null;
            for (Coche coche : listaDecoches.values()) {
                if(cocheConMasCaballos == null || cocheConMasCaballos.getMotor().getCaballos() < coche.getMotor().getCaballos()){
                    cocheConMasCaballos  = coche;
                }
            }
            return cocheConMasCaballos;
        }

        //Mismo metodo pero con Entry
    public static Coche cocheConMasCaballos2(HashMap<Integer, Coche> listaDecoches) {

        Coche cocheConMasCaballos = null;

            for (Map.Entry<Integer, Coche> entrada : listaDecoches.entrySet()) {

            Coche cocheActual = entrada.getValue();

            if (cocheConMasCaballos == null ||
            cocheActual.getMotor().getCaballos() >
            cocheConMasCaballos.getMotor().getCaballos()) {

            cocheConMasCaballos = cocheActual;
            }
        }

    return cocheConMasCaballos;
    }


    public static Integer obtenerClaveCocheConMasCaballos(HashMap<Integer, Coche> listaDeCoches){
        Integer claveCocheConMasCaballos = null;
        Coche cocheCandidato = null;
        for (Map.Entry<Integer, Coche> entrada : listaDeCoches.entrySet()) {
            Coche cocheActual = entrada.getValue();
            if (cocheCandidato == null || cocheCandidato.getMotor().getCaballos() < cocheActual.getMotor().getCaballos()) {
                claveCocheConMasCaballos = entrada.getKey();
                cocheCandidato = cocheActual;
            }
        }
        return  claveCocheConMasCaballos;
    }


    public static Coche obtenerCocheConMenosCaballos(HashMap<Integer, Coche> listaDeCoches){
        Coche cocheConMenosCaballos = null;

        for (Coche coche : listaDeCoches.values()) {
            if (cocheConMenosCaballos == null || cocheConMenosCaballos.getMotor().getCaballos() > coche.getMotor().getCaballos()) {
                cocheConMenosCaballos = coche;
            }
        } return cocheConMenosCaballos;
    }

    public static Integer obtenerCocheConMenosCaballosPorClave(HashMap<Integer, Coche> listaDeCoches){
        Integer cocheConMenosCaballos = null;
        Coche cocheCandidato =  null;
        for (Map.Entry<Integer, Coche> entrada : listaDeCoches.entrySet()) {
            Coche cocheActual = entrada.getValue();
            if (cocheCandidato == null || cocheCandidato.getMotor().getCaballos() > cocheActual.getMotor().getCaballos()) {
                cocheConMenosCaballos = entrada.getKey();
                cocheCandidato = cocheActual;
            }
        }
        return cocheConMenosCaballos;
    }

    public static int obtenerCochesQueTengaMasDeCienCaballos(HashMap<Integer, Coche> listaDeCoches){
        int cuantosCochesTieneMasDeCienCaballos = 0;
        

        for (Coche coche : listaDeCoches.values()) {
            if (coche.getMotor().getCaballos() > 100) {
            cuantosCochesTieneMasDeCienCaballos++;
            }
        }
      return cuantosCochesTieneMasDeCienCaballos;

    }

    public static int obtenerSumaTotalDeTodosLosCaballos(HashMap<Integer, Coche> listaDeCoches){
        int sumaTotal = 0;

        for (Coche coche : listaDeCoches.values()) {
            sumaTotal += coche.getMotor().getCaballos();
        }
        return sumaTotal;
    }

    public static double obtenerLaMediaDeCaballosDeTodosLosCoches(HashMap<Integer, Coche> listaDeCoches){
        double sumaTotal = 0;
        for (Coche coche : listaDeCoches.values()) {
            sumaTotal += coche.getMotor().getCaballos();
        }

        if(listaDeCoches.isEmpty()){
            return 0;
        }

        return sumaTotal / listaDeCoches.size();
    }

    public static ArrayList<Coche> obtenerLosCochesConMasCaballosQuelaMedia(HashMap<Integer, Coche> listaDeCocches){
        ArrayList<Coche> coche = new ArrayList<>();
        double sumaTotal = 0;

       if (listaDeCocches.isEmpty()) {
            return coche;
        }
        for (Coche coche2 : listaDeCocches.values()) {
            sumaTotal += coche2.getMotor().getCaballos();
        }
    

        double media = sumaTotal / listaDeCocches.size();

        for (Coche coche2 : listaDeCocches.values()) {
           if (coche2.getMotor().getCaballos() > media) {
            coche.add(coche2);
           } 
        }
      
        return coche;
        
    }

    ///////////////////////////////////////////////////////////////////////

                       // ARRAYLIST
   public static int contarVoladores(ArrayList<Vehiculos> vehiculos) {
    int contador = 0;
    for (Vehiculos vehiculo : vehiculos) {
        if (vehiculo instanceof Volador) {
            contador++;
        }
    }
    return contador;
}

    public static int contarNavegadores(ArrayList<Vehiculos> vehiculos){
        int contador = 0;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Navegable) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarNavegadoresYVoladores(ArrayList<Vehiculos> vehiculos){
        int contador = 0;

        for (Vehiculos vehiculo : vehiculos) {
            
        
        if (vehiculo instanceof Volador && vehiculo instanceof Navegable) {
            contador++;
        }
    }
        return contador;
}

    public static Vehiculos buscarPrimerVolador(ArrayList<Vehiculos> vehiculos){
        Vehiculos vehiculoVolador = null;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador) {
                
                return vehiculoVolador = vehiculo;
            }
        }
        return vehiculoVolador;
    }

     public static Vehiculos buscarUltimoVolador(ArrayList<Vehiculos> vehiculos){
        Vehiculos vehiculoVolador = null;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador) {
                
                 vehiculoVolador = vehiculo;
            }
        }
        return vehiculoVolador;
    }

    public static Vehiculos buscarVoladorMasRapido(ArrayList<Vehiculos> vehiculos) {
    
        Vehiculos vehiculoMasRapido = null;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador  && (vehiculoMasRapido == null || vehiculoMasRapido.getVelocidadMaxima() < vehiculo.getVelocidadMaxima())) {

                vehiculoMasRapido = vehiculo;
            }
        }
        return vehiculoMasRapido;
}

    public static Vehiculos buscarVoladorMasLento(ArrayList<Vehiculos> vehiculos) {
    
        Vehiculos vehiculoMasLento = null;
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador  && (vehiculoMasLento == null || vehiculoMasLento.getVelocidadMaxima() > vehiculo.getVelocidadMaxima())) {

                vehiculoMasLento = vehiculo;
            }
        }
        return vehiculoMasLento;
}


    public static Vehiculos buscarNavegableMasRapido(ArrayList<Vehiculos> vehiculos){
        Vehiculos navegadorMasRapido = null;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Navegable && (navegadorMasRapido == null || navegadorMasRapido.getVelocidadMaxima() < vehiculo.getVelocidadMaxima())) {
                navegadorMasRapido = vehiculo;
            }
        } return navegadorMasRapido;
}

public static Vehiculos buscarNavegableMasLento(ArrayList<Vehiculos> vehiculos){
        Vehiculos navegadorMasLento = null;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Navegable && (navegadorMasLento == null || navegadorMasLento.getVelocidadMaxima() > vehiculo.getVelocidadMaxima())) {
                navegadorMasLento = vehiculo;
            }
        } return navegadorMasLento;
}

    public static Vehiculos buscarVehiculoNavegableYVoladorMasRapido(ArrayList<Vehiculos> vehiculos){
        Vehiculos vehiculoMasRapido = null;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Navegable && vehiculo instanceof Volador && (vehiculoMasRapido == null || vehiculoMasRapido.getVelocidadMaxima() < vehiculo.getVelocidadMaxima())) {
                vehiculoMasRapido = vehiculo;
            }
        } return vehiculoMasRapido;
    }

    public static ArrayList<Vehiculos> obtenerVoladores(ArrayList<Vehiculos> vehiculos){
        ArrayList<Vehiculos> listaDeVehiculosVoladores = new ArrayList<>();
        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador) {
                listaDeVehiculosVoladores.add(vehiculo);
            }
        }return listaDeVehiculosVoladores;
    }

    public static ArrayList<Vehiculos> obtenerNavegablesYVoladores(ArrayList<Vehiculos> vehiculos){
        ArrayList<Vehiculos> vehiculosVoladoresYNAvegadores = new ArrayList<>();

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador && vehiculo instanceof Navegable) {
                vehiculosVoladoresYNAvegadores.add(vehiculo);
            }

        } return vehiculosVoladoresYNAvegadores;
    }

    public static ArrayList<Vehiculos> obtenerNavegables(ArrayList<Vehiculos> vehiculos){

        ArrayList<Vehiculos> vehiculosNavegadores = new ArrayList<>();

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Navegable) {
                vehiculosNavegadores.add(vehiculo);
            }
        }
       

        return vehiculosNavegadores;
    }

    public static ArrayList<Vehiculos> obtenerVehiculosRapidos(ArrayList<Vehiculos> vehiculos){
        ArrayList<Vehiculos> vehiculosConVelocidadMasDeCuatrocientos = new ArrayList<>();
        int velocidad = 400;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo.getVelocidadMaxima() > velocidad) {
                vehiculosConVelocidadMasDeCuatrocientos.add(vehiculo);
            }
        }
        return vehiculosConVelocidadMasDeCuatrocientos;
    }

    public static ArrayList<Vehiculos> obtenerVehiculosRapidosVoladores(ArrayList<Vehiculos> vehiculos){
        ArrayList<Vehiculos> vehiculosVoladoresMasDeCuatrocientos = new ArrayList<>();
        int velocidad = 400;

        for (Vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Volador && vehiculo.getVelocidadMaxima() > velocidad) {
                vehiculosVoladoresMasDeCuatrocientos.add(vehiculo);
            }
        }

            return vehiculosVoladoresMasDeCuatrocientos;
    }


   
}
