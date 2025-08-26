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
}


