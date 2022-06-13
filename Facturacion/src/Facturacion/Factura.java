package Facturacion;

import java.util.LinkedList;
import java.util.List;

public class Factura {

    private String fecha;
    private String numero;
    private Float subTotal;
    private Float total;
    private Float valorIva;
    private float descuento;
    private float porcentaje = 30;


    private Empleado empleado;
    private Cliente cliente;
    private Empresa empresa;

    private List<Descripcion> descripcionList;

    public Factura() {
        descripcionList = new LinkedList<>();
    }

    public void calcularIVA() {
        this.valorIva = this.subTotal * this.empresa.getPorcentajeIVA() / 100;
    }

    public void calcularSubTotal() {
        this.subTotal = 0f;
        for (Descripcion descripcion : descripcionList) {
            this.subTotal += descripcion.getValorTotal();
        }
    }

    public void descuento(Integer porcentaje) {
        descuento = this.subTotal * porcentaje / 100;
        this.subTotal = this.subTotal - descuento;
    }

    public void calcularTotal() {
        this.total = this.subTotal + this.valorIva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public Float getTotal() {
        return total;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Descripcion> getDescripcionList() {
        return descripcionList;
    }

    public void setDescripcionList(List<Descripcion> descripcionList) {
        this.descripcionList = descripcionList;
    }

    @Override
    public String toString() {
        return "\t\t\t\t\t\t Factura \n ===========================================\n"
                + this.empresa.getNombre() + "\n" + this.empleado + "Susana Isabela Rodriguez Castro" + "\t\t\t\t\t\t\t\t|| RUC "
                + empresa.getRuc() + "\n\t\t\t\t\t\t\t || NOVI COMPU " + empresa.getAutorizacion() + "\n" +
                this.cliente + "Fecha emision: 25/05/2004 " + "\n ================================================================"
                + "=========================================================================================================\n"
                + ("Cantidad       |          Ref         |         Sub        |         Total Uni\n") +
                ("\n=================================================================================\n")
                + descripcionList + "\n\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t || IVA 12%: " + valorIva +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|| Descuento: " + this.descuento
                + "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t || TOTAL:   " + this.total;
    }
}




