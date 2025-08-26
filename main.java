package TiendaCafePOO;



class Main {
    public static void main(String[] args) {
        Cafe cafeCaturra = new Cafe("Café Caturra", "Nariño", 30000, 10);
        Cafe cafeGesha = new Cafe("Café Gesha", "Antioquia", 40000, 8);
        Cafe cafeBourbon = new Cafe("Bourbon Rosado", "Huila", 50000, 12);

        System.out.println("Información de los cafés:");
        cafeCaturra.mostrarInformacion();
        System.out.println("Precio total: " + cafeCaturra.calcularPrecioTotal() + " COP\n");

        cafeGesha.mostrarInformacion();
        System.out.println("Precio total: " + cafeGesha.calcularPrecioTotal() + " COP\n");

        cafeBourbon.mostrarInformacion();
        System.out.println("Precio total: " + cafeBourbon.calcularPrecioTotal() + " COP\n");

        System.out.println("Actualizando cantidad de Café Caturra");
        cafeCaturra.actualizarCantidad(7.5);
        cafeCaturra.mostrarInformacion();
        System.out.println("Precio total actualizado: $" + cafeCaturra.calcularPrecioTotal() + " COP");
        
        System.out.println("Aplicando descuento del 10% al Café Gesha");
        cafeGesha.aplicarDescuento(10);
        cafeGesha.mostrarInformacion();


    }
}
