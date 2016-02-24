package ejerciciosDelTema;

import java.time.LocalDate;

public class CuentaBancaria {
	//atributos
	private String numeroCuenta = generarNumeroCuenta();
	private double saldo = 0;
	private double interes = 2.5;
	private LocalDate fechaCreacion = LocalDate.now();
	private static int numeroDeCuentasBancarias = 0;
	
	public CuentaBancaria(){
		
	}
	
	public CuentaBancaria(double saldo, double interes){
		this.saldo = saldo;
		this.interes = interes;
		numeroDeCuentasBancarias++;
	}
	
	private String generarNumeroCuenta(){
		String numeroCuenta = "";
		final String ENTIDAD = "1234";
		final String OFICINA = "5678";
		String digitosCuenta = "";
		for (int i = 0; i < 10; i++) {
			digitosCuenta+=(int) (Math.random()*10);
		}
		String digitoControl = digitosCuenta+"-"+ENTIDAD+"-"+OFICINA;
		return ENTIDAD+"-"+OFICINA+"-"+digitoControl+"-"+digitosCuenta;
	}
	
	private String generarDigitoControl(String digitos, String entidad, String oficina){
		String entidadOficina = "00"+entidad+oficina;
		int[] multiplicador = {1,2,4,8,5,10,9,7,3,6};
		int suma1 = 0, suma2 = 0;
		for (int i = 0; i < 10; i++) {
			suma1 += multiplicador[i]*Character.getNumericValue(entidadOficina.charAt(i));
			suma2 += multiplicador[i]*Character.getNumericValue(digitos.charAt(i));
		}
		int resto1 = suma2 % 11;
		int primerDigito = 11-resto1;
		if(primerDigito == 11)
			primerDigito = 0;
		if(primerDigito == 10)
			primerDigito = 1;
		
		int resto2 = suma2 % 11;
		int segundoDigito = 11-resto2;
		if(segundoDigito == 11)
			segundoDigito = 0;
		if(segundoDigito == 10)
			segundoDigito = 1;
		String digitoControl= ""+primerDigito+segundoDigito;
		
		return digitoControl;
	}
	
	

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public boolean retirarEfectivo(int cantidad){
		if(this.saldo >= cantidad){
			this.saldo -= cantidad;
			return true;
		}
		else return false;
	}
	
	public void ingresarEfectivo(int cantidad){
		this.saldo += cantidad;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}
	
	/*public static void main(String[] args) {
		CuentaBancaria c = new CuentaBancaria();
		System.out.println(c);
	}*/
}
