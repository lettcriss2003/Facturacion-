package Facturacion;

public class Descripcion {

    private Integer cantidad;
    private Float precioUnitario;
    private Float valorTotal;


    private Factura factura;
    private Producto producto;

    public Descripcion(Integer cantidad, Factura factura, Producto producto) {
        this.cantidad = cantidad;
        this.factura = factura;
        this.producto = producto;
        //this.tieneIva = Iva;
        this.calcularTotal();
    }
/*
    public void calcularValorTotal(){

        if (getIva() == false) {
            this.precioUnitario = this.producto.getPrecioCompra() * 1.25f;
            this.valorTotal = this.cantidad * this.precioUnitario;

            Float aux = this.valorTotal + 0.12f;
            this.auxTotal = this.valorTotal - aux;
        }
        else if (getIva() == true){
            this.precioUnitario = this.producto.getPrecioCompra() * 1.25;
            this.valorTotal = this.cantidad * this.precioUnitario;
            System.out.println(valorTotal);
        }
    }
*/
public void calcularTotal(){

    this.precioUnitario = this.producto.getPrecioCompra() * 1.25f;
    this.valorTotal = this.cantidad * this.precioUnitario;
}

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
/*
    public Float getIva(){
        return tieneIva;
    }

    public void setIva(Float tieneIva) {
        this.tieneIva = tieneIva;
    }
*/
    public String toString(){
        return "|" + this.cantidad + " |\t\t\t\t\t|" + producto+" \t\t\t\t|" + precioUnitario + "|\t\t\t\t\t|" + valorTotal + "|\n";
    }
}

