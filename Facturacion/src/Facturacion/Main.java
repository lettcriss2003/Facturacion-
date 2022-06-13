package Facturacion;

public class Main {

    public static void main(String[] args) {

        Factura factura = new Factura();
        System.out.println("==========================================RAQUELITA============================================="+"\n");
        Empresa empresa = new Empresa("123", "=========================================Micromercado=============================================", "12561", 12 );
        System.out.println("=================================================================================================================");
        factura.setEmpresa(empresa);
        Cliente cliente = new Cliente("Carlos Rigoberto", "0703190025","Romero Casas" );
        System.out.println("Nombres y Apellidos: ");
        System.out.println(cliente);
        Direccion direccion = new Direccion("Calle Segundo Cueva Celi", "  y Segundo Puertas");
        System.out.println("Direccion: ");
        empresa.setDireccion(direccion);
        System.out.println(direccion);
        Direccion numeroCasa = new Direccion("93 - 48");
        System.out.println("Numero de Casa: ");
        empresa.setDireccion(numeroCasa);
        System.out.println(numeroCasa);
        Direccion referencia = new Direccion("La Pileta");
        empresa.setDireccion(referencia);
        System.out.println("Referencia: ");
        System.out.println(referencia);
        Direccion telefonoFijo = new Direccion("072721672");
        empresa.setDireccion(telefonoFijo);
        System.out.println("Telefono Fijo: ");
        System.out.println(telefonoFijo);
        Direccion telefonoMovil = new Direccion("0987326454");
        empresa.setDireccion(telefonoMovil);
        System.out.println("Telefono celular: ");
        System.out.println(telefonoMovil);
        Producto termo = new Producto("Termo", 10f, 12);
        Producto cuaderno = new Producto("Cuaderno", 2f, 10);
        Producto celular = new Producto("Celular", 5000f, 3);
        Producto chocolate = new Producto("Chocolate", 2f, 50);
        Descripcion descripcion = new Descripcion(3,factura,termo);
        factura.getDescripcionList().add(new Descripcion(3, factura, termo));
        Descripcion descripcion1 = new Descripcion(5,factura,cuaderno);
        factura.getDescripcionList().add(new Descripcion(5, factura, cuaderno));
        Descripcion descripcion2 = new Descripcion(1,factura,celular);
        factura.getDescripcionList().add(new Descripcion(1, factura, celular));
        Descripcion descripcion3 = new Descripcion(3,factura,chocolate);
        factura.getDescripcionList().add(new Descripcion(6, factura, chocolate));
        factura.calcularSubTotal();
        factura.calcularIVA();
        factura.descuento(30);
        factura.calcularTotal();
        System.out.println(factura);
        System.out.println(" Producto sin iva:");
        System.out.println(descripcion);


    }

}

