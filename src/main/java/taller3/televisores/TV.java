package taller3.televisores;

public class TV {
	private static int numTV;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca (Marca marca) {
		this.marca=marca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal (int canal) {
		this.canal=canal;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio (int precio) {
		this.precio=precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen (int volumen) {
		this.volumen=volumen;
	}
	public Control getControl() {
		return control;
	}
	public void setControl (Control control) {
		this.control=control;
	}
	public static int getnumTV() {
		return numTV;
	}
	public static void setnumTV () {
		numTV++;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void canalUp () {
		if(canal>=1 && canal<120 && estado){
			canal++;}
	}
	public void canalDown () {
		if(canal>1 && canal<=120 && estado){
			canal--;}
	}
	public void volumenUp () {
		if(volumen>=0 && volumen<7 && estado){
		volumen++;}
	}
	public void volumenDown () {
		if(volumen>0 && volumen<=7 && estado){
		volumen--;}
	}
}