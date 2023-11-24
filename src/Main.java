public class Main {
    public static void main(String[] args) {
        Autonomo autonomo = new Autonomo();
        autonomo.setCode("1");
        autonomo.setDni("1234567N");
        autonomo.setApellidos("ApellidoAutonomo");
        autonomo.setNombre("Sr. Autónomo");
        autonomo.setEmail("autonomo@gmail.com");
        autonomo.setPoblacion("Avila");
        autonomo.setProvincia("Avila");
        autonomo.setDireccionPostal("Plaza El Grande");
        autonomo.setTelefono("600 000 000");

        Sociedad sociedad = new Sociedad();
        sociedad.setCode("1");
        sociedad.setCif("98765432W");
        sociedad.setEmail("autonomo@gmail.com");
        sociedad.setPoblacion("Avila");
        sociedad.setProvincia("Avila");
        sociedad.setDireccionPostal("Plaza El Grande");
        sociedad.setTelefono("600 000 000");

        Producto producto1 = new Producto();
        producto1.setCodigo("1");
        producto1.setNombre("Producto1");
        producto1.setMarca("Marca1");
        producto1.setModelo("Modelo1");
        producto1.setPrecio("100€");
        producto1.setTipoIVA("21%");

        Producto producto2 = new Producto();
        producto2.setCodigo("2");
        producto2.setNombre("Producto1");
        producto2.setMarca("Marca1");
        producto2.setModelo("Modelo1");
        producto2.setPrecio("100€");
        producto2.setTipoIVA("21%");

        Servicio servicio1 = new Servicio();
        servicio1.setCodigo("3");
        servicio1.setNombre("Servicio3");
        servicio1.setPrecio("100€");
        servicio1.setTipoIVA("21%");
        servicio1.setHorasTrabajadas("5");

        Servicio servicio2 = new Servicio();
        servicio2.setCodigo("4");
        servicio2.setNombre("Servicio4");
        servicio2.setPrecio("15€");
        servicio2.setTipoIVA("21%");
        servicio2.setHorasTrabajadas("2");

        Factura facturas = new Factura();
        facturas.setCodigo("F-1");
        facturas.setDate("10/10/2023");
        facturas.setBaseImponible("123€");
        facturas.setTotal("250€");
        facturas.setCliente(autonomo);
        facturas.addItem(producto1);
        facturas.addItem(servicio1);

        Factura facturas2 = new Factura();
        facturas2.setCodigo("F-2");
        facturas2.setDate("10/12/2023");
        facturas2.setBaseImponible("23€");
        facturas2.setTotal("25€");
        facturas2.setCliente(sociedad);
        facturas2.addItem(producto2);
        facturas2.addItem(servicio2);

        imprimirFactura(facturas);
    }

    public static void imprimirFactura(Factura factura) {
        System.out.println("Código:" + factura.getCodigo() + " Fecha: " + factura.getDate());
        System.out.println("Cliente:" + factura.getCliente().getCode() + " Nombre: " + factura.getCliente().getNombre() + " Direccion: " + factura.getCliente().getDireccionPostal() + " Poblacion: " + factura.getCliente().getProvincia());
        for (Item item : factura.getItemList()) {
            System.out.println("Código:" + item.getCodigo() + " Nombre:" + item.getNombre() + " Tipo Iva:" + item.getTipoIVA());
        }
    }
}
