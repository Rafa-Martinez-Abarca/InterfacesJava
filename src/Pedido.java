public class Pedido {
    private int id;
    private String cliente;
    private EstadoPedido estado;

    public Pedido(int id, String cliente, EstadoPedido estado){
        this.id = id;
        this.cliente = cliente;
        this.estado = estado;
    }



    public int getId(){
        return id;
    }


    public String getCliente(){
        return cliente;
    }

    public EstadoPedido getEstado(){
        return estado;
    }


    public void setEstadoPedido(EstadoPedido estado){
        this.estado = estado;
    }
}
