public enum EstadoPedido {
    
    
    
    PENDIENTE("Pendiente de envio"),
    ENVIADO("Pedido en camino"),
    ENTREGADO("Pedido entregado"),
    CANCELADO("Pedido cancelado");

        private String descripcion;

        EstadoPedido(String descripcion){
            this.descripcion = descripcion;
        }


public String getDescripcion(){
    return descripcion;
}





}
