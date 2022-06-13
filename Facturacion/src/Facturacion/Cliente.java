package Facturacion;
import java.util.List;

public class Cliente extends Persona{

        private List<Factura> facturaList;
        private Direccion direccion;

        public Cliente(String nombre, String apellido, String identificacion){
            super(nombre, apellido, identificacion);
        }

        public List<Factura> getFacturaList() {
            return facturaList;
        }

        public void setFacturaList(List<Factura> facturaList) {
            this.facturaList = facturaList;
        }
        public Direccion getDireccion(){
            return direccion;
        }
        public void setDireccion(Direccion direccion){
            this.direccion = direccion;
        }


    public String toString(){
            return super.getNombre() + " " + super.getApellidos() + " \t\t\t\t RUC./C.I" + super.getIdentificacion() + "\n\t\t\t\t\t\t";
      }

    }
