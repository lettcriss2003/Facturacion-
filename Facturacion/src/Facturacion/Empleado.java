package Facturacion;
import java.util.List;


public class Empleado {

    private List<Factura> facturaList;

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }
}
