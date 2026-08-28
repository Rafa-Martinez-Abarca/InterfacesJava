public class MainExcepciones {

    public static void main(String[] args) {

        // EDAD
        try {
            edadValida(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        // DIVISIÓN
        System.out.println(resultadoConTryCatch(10, 0));


        // PRECIO
        try {
            precioValido(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // STOCK
        try {
            stockValido(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // SALDO CON ILLEGAL ARGUMENT EXCEPTION
        try {
            saldoInsuficiente(30, 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        // EXCEPCIÓN PERSONALIZADA
        try {
            comprobarSaldoPersonalizado(31, 8);
        } catch (SaldoInsuficiente e) {
            System.out.println(e.getMessage());
        }


        // ENUM
        Pedido pedido = new Pedido(
                20,
                "Pedro",
                EstadoPedido.PENDIENTE
        );

        System.out.println(pedido.getEstado().getDescripcion());

        pedido.setEstadoPedido(EstadoPedido.ENVIADO);

        switch (pedido.getEstado()) {

            case PENDIENTE:
                System.out.println("Pedido pendiente");
                break;

            case ENVIADO:
                System.out.println("Pedido en camino");
                break;

            case ENTREGADO:
                System.out.println("Pedido entregado");
                break;

            case CANCELADO:
                System.out.println("Pedido cancelado");
                break;
        }
    }


    public static int resultadoConTryCatch(int num1, int num2) {

        int resultado = 0;

        try {
            return resultado = num1 / num2;

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();

            return resultado;

        } finally {

            System.out.println("Esto se ejecuta siempre");
        }
    }


    public static void edadValida(int edad) {

        if (edad < 0) {
            throw new IllegalArgumentException("Edad incorrecta");
        }

        System.out.println("Edad válida");
    }


    public static void precioValido(double precio) {

        if (precio < 0) {
            throw new IllegalArgumentException("Precio no válido");
        }

        System.out.println("Precio válido");
    }


    public static void stockValido(int stock) {

        if (stock < 0) {
            throw new IllegalArgumentException(
                    "No puede haber stock negativo"
            );
        }

        System.out.println("Stock válido");
    }


    public static void saldoInsuficiente(
            int cantidadARetirar,
            int saldo) {

        if (cantidadARetirar > saldo) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente"
            );
        }

        int totalSaldo = saldo - cantidadARetirar;

        System.out.println("Aquí tiene su dinero, gracias");
        System.out.println("Saldo restante: " + totalSaldo);
    }


    public static void numeroNegativo(int numero)
            throws Exception {

        if (numero < 0) {
            throw new Exception("Número negativo");
        }

        System.out.println("Número positivo");
    }


    public static void comprobarSaldoPersonalizado(
            int cantidadARetirar,
            int saldo)
            throws SaldoInsuficiente {

        if (cantidadARetirar > saldo) {
            throw new SaldoInsuficiente(
                    "No tienes suficiente saldo"
            );
        }
    }
}

