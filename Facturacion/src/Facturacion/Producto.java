package Facturacion;

import java.util.List;

public class Producto {

    private String nombre;
    private Float PrecioCompra;
    private Integer stock;

    private List<Descripcion> descripcionList;

    public Producto(String nombre, Float PrecioCompra, Integer stock) {
        this.nombre = nombre;
        this.PrecioCompra = PrecioCompra;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(Float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<Descripcion> getDescripcionList() {
        return descripcionList;
    }

    public void setDescripcionList(List<Descripcion> descripcionList) {
        this.descripcionList = descripcionList;
    }

    public String toString (){
        return this.nombre+ "        "+ this.getPrecioCompra();
    }
}
