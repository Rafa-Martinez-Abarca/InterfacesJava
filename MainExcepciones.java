


public class MainExcepciones {
    public static void main(String[] args) {
          try {
        comprobarEdad(-5);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
     
       System.out.println((resultadoConTryCatch(10, 0)));
       
         
    }
    

                //Try Catch
    public static int resultadoConTryCatch(int num1, int num2){

        int resultado = 0;
    try{
        return resultado = num1 / num2;
       
    }catch(ArithmeticException e){

        //mensaje corto del error
        System.out.println(e.getMessage());

        //tipo de excepción y línea donde ocurrió
        e.printStackTrace();
        return resultado;
    }finally{
        System.out.println("Esto se ejecuta siempre");
    }
}

    public static void comprobarEdad(int edad){
        if (edad < 0) {
            throw new IllegalArgumentException("Edad incorrecta");
        }

        System.out.println("Edad correcta");
    
    }
} 