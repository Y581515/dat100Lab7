package dat200Lab7oppg2;

public class Konto {
	private int kontonummer;
	private double saldo;
	
	public Konto(int kontonummer,double saldo) {
		this.kontonummer=kontonummer;
		this.saldo=saldo;
	}
	
	
	public double gettSaldo() {
		return saldo;
	}
	
	public void endring(double n) {
		saldo=saldo+n;
	}
	
	public void skriveUt() {
		System.out.println("kontonummer= "+kontonummer+"\n"
				+ "saldo= "+saldo);		
	}
	

}
