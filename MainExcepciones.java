


public class MainExcepciones {
    public static void main(String[] args ) throws Exception {
          try {
        comprobarEdad(-5);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
     
       //System.out.println((resultadoConTryCatch(10, 0)));
       
       try {
        precioValido(-1);
        
       } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
       }

       try {
        stockValido(-1);
       } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
       }

       try {
        saldoInsuficiente(30, 01);
       } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
         
       }

       
        numeroNegativo(-2);
       
         
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


    public static void precioValido(double precio){
        if (precio < 0 ) {
         throw new IllegalArgumentException("Precio no válido");
        }

        System.out.println("Precio Válido");
    }

    public static void stockValido(int stock){
        if (stock < 0) {
            throw new IllegalArgumentException("No puede haber stock negativo");
        }

        System.out.println("Stock válido");
    }

    public static void saldoInsuficiente(int cantidadARetirar, int saldo){
        int totalSaldo = saldo - cantidadARetirar;
        if (cantidadARetirar > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
            
        }

        System.out.println("Aquí tiene su dinero, gracias");
        System.out.println(totalSaldo);
    }

    public static void numeroNegativo(int numero) throws Exception{
        if(numero < 0 ){
            throw new Exception("Numero negativo");
        }
        System.out.println("numero positivo");
    }


}