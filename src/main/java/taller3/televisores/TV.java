package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private int volumen;
	private boolean estado;
	private Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.precio = 500;
		this.volumen = 1;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getContro() {
		return control;	
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		if(estado == true && volumen <= 7 && volumen >= 0) {
			this.volumen = volumen;
		}
	}
	
	public int volumenUp() {
		if (estado == true && volumen >= 1 && volumen < 7) {
			volumen++;
		}
		return volumen;
	}
	
	public int volumenDown() {
		if(estado == true && volumen > 1 && volumen <= 7) {
			volumen--;
		}
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if(estado == true && canal <=120 && canal >= 1) {
			this.canal = canal;
		}
	}
	
	public int canalUp() {
		if(estado == true && canal < 120 && canal >= 1) {
			canal++;
		}
		return canal;
	}
	
	public int canalDown() {
		if(estado == true && canal>1 && canal <=120) {
			canal--;
		}
		return canal;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	

}
