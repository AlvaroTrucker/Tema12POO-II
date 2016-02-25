package ejerciciosDelTema;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	
	public boolean addCuentaBancaria(CuentaBancaria c){
		return cuentas.add(c);
	}
	
	public boolean eliminarCuentaBancaria(CuentaBancaria c){
		return cuentas.remove(c);
	}
	
	public List<CuentaBancaria> devolverCuentaMayorSaldo(){
		List<CuentaBancaria> listaMayorSaldo = new ArrayList<CuentaBancaria>();
		if(cuentas.size() > 0){
			double saldoMayor = 0;
			CuentaBancaria c = null;
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if(cuentaBancaria.getSaldo() > saldoMayor){
					c = cuentaBancaria;
					saldoMayor = c.getSaldo();
				}
			}
			for (CuentaBancaria cuentaBancaria : listaMayorSaldo) {
				if(c.getSaldo() == cuentaBancaria.getSaldo())
					listaMayorSaldo.add(cuentaBancaria);
			}
		}
		return listaMayorSaldo;
	}
	
	public List<CuentaBancaria> devolverCuentaMenorSaldo(){
		List<CuentaBancaria> listaMenorSaldo = new ArrayList<CuentaBancaria>();
		if(cuentas.size() > 0){
			double saldoMenor = cuentas.get(0).getSaldo();
			CuentaBancaria c = null;
			for (CuentaBancaria cuentaBancaria : cuentas) {
				if(cuentaBancaria.getSaldo() <= saldoMenor){
					saldoMenor = c.getSaldo();
					listaMenorSaldo.clear(); //resetea la lista
					listaMenorSaldo.add(c);
				}
				if(cuentaBancaria.getSaldo() <= saldoMenor)
					listaMenorSaldo.add(cuentaBancaria);
			}
		}
		return listaMenorSaldo;
	}
	
	public List<CuentaBancaria> devolverListadoMorosos(){
		List<CuentaBancaria> listaMorosos = new ArrayList<CuentaBancaria>();
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if(cuentaBancaria.getSaldo() < 0)
				listaMorosos.add(cuentaBancaria);
		}
		return listaMorosos;
	}
	
	private double getSaldoMedio(){
		double saldoMedio = 0;
		for (CuentaBancaria cuentaBancaria : cuentas) {
			saldoMedio += cuentaBancaria.getSaldo();
		}
		return saldoMedio/cuentas.size();
	}

	@Override
	public String toString() {
		return "Nº de cuentas: "+cuentas.size()+", saldo medio: "+getSaldoMedio();
	}
	
	
}
