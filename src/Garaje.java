import java.util.ArrayList;

public class Garaje {
   private String nombre;
    private ArrayList<Coche> coches;

    public Garaje(String nombre){
        this.nombre = nombre;
        this.coches = new ArrayList<>();
    }







    public void agregarCoches(Coche coche){


        coches.add(coche);
    }

    public int mostrarCuantosCochesHay(){
        return coches.size();
    }

    public void mostrarTodosLosCoches(){
        

        for (Coche coche : coches) {
            System.out.println(coche);
        }

        
    }

    public Coche buscarCocheConMasCaballos(){
        Coche cocheConMasCaballos = null;

        for (Coche coche : coches) {
            if (cocheConMasCaballos == null || coche.getMotor().getCaballos() > cocheConMasCaballos.getMotor().getCaballos()) {
                cocheConMasCaballos = coche;
            }

        }
        return cocheConMasCaballos;
    }


    public Coche buscarCocheConMenosCaballos(){
        Coche cocheConMenosCaballos = null;

        for (Coche coche : coches) {
            if (cocheConMenosCaballos == null || coche.getMotor().getCaballos() < cocheConMenosCaballos.getMotor().getCaballos()) {
                cocheConMenosCaballos = coche;
            }

        }
        return cocheConMenosCaballos;
    }
}


