package TiendaCafePOO;


class Cafe {
	private String nombre;
	private String region;
	private double precioPorKilo;
	private double cantidadEnKilos;

	
	public Cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos) {
		this.nombre = nombre;
		this.region = region;
		this.precioPorKilo = precioPorKilo;
		this.cantidadEnKilos = cantidadEnKilos;
	}

	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Región: " + region);
		System.out.println("Precio por kilo: " + precioPorKilo + " COP");
		System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
	}

	
	public double calcularPrecioTotal() {
		return precioPorKilo * cantidadEnKilos;
	}

	
	public void actualizarCantidad(double nuevaCantidad) {
		this.cantidadEnKilos = nuevaCantidad;
	}
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento inválido.");
            return;
        }
        double descuento = (porcentaje / 100) * this.precioPorKilo;
        this.precioPorKilo -= descuento;
        System.out.println("Descuento aplicado. Nuevo precio por kilo: " + this.precioPorKilo + " COP");
    }
}


