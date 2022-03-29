package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
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
		if (estado == true && this.volumen <= 7 && this.volumen >= 0) {
			this.volumen = volumen;
		}
	}
	public void volumenUp() {
		if (estado == true && volumen != 7) {
			--volumen;
		}
	}
	public void volumenDown() {
		if(estado == true && volumen != 0) {
			--volumen;
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(estado ==true && canal <=120 && canal >= 1) {
			this.canal = canal;
		}
	}
	public void canalUp() {
		if(estado == true && canal != 120) {
			++canal;
		}
	}
	public void canalDown() {
		if(estado == true && canal != 1) {
			--canal;
		}
	}
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	

}
