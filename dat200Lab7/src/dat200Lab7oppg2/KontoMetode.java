package dat200Lab7oppg2;

public class KontoMetode {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		Konto Ka=new Konto(1111111111,69);
		Ka.skriveUt();
		Ka.endring(-69);
		System.out.println(Ka.gettSaldo());
		Konto Kb=new Konto(222222222,20);
		Kb.skriveUt();
		Konto Kc=new Konto(333333333,400);
		Kc.skriveUt();
		
		double saldoSum=Ka.gettSaldo()+Kb.gettSaldo()+Kc.gettSaldo();
		System.out.println("\nsaldo summen= "+saldoSum);
	}

}
