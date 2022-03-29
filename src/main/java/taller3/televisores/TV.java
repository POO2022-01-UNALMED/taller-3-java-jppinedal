package taller3.televisores;



public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	public static int numTV;


	public TV(Marca marca, boolean estado ) {
		this.marca = marca;
		this.canal = 1;
        this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
		numTV++;
	}

	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
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
		if (estado == true && volumen<=7 && volumen >=0)
			this.volumen = volumen;
	}

	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (estado == true && canal<=120 && canal >0)
			this.canal = canal;
	}

	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}

	public boolean getEstado() {
		return estado;
	}

	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}

	public void canalUp() {
		if (estado == true && canal<120)
			canal++;
	}
	public void canalDown() {
		if (estado == true && canal>1)
			canal--;
	}

	public void volumenUp() {
		if (estado == true && volumen < 7)
			volumen++;
	}
	public void volumenDown() {
		if (estado == true && volumen > 1)
			volumen--;
	}

}
