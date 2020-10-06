package dat200Lab7;

public class KvadratMetode {

	public static void main(String[] args) {
		int a=4;
		int b=4;
		int c=5;
		Kvadrat Kva=new Kvadrat(a);
		System.out.println("Kv"+a+": " );
		System.out.println(Kva.toString());
		System.out.println(Kva.tegning());
		
		Kvadrat Kvb=new Kvadrat(b);
		System.out.println("Kv"+b+": " );
		System.out.println(Kvb.toString());
		System.out.println(Kvb.tegning());
		
		Kvadrat Kvc=new Kvadrat(c);
		System.out.println("Kv"+c+": " );
		System.out.println(Kvc.toString());
		System.out.println(Kvc.tegning());


		System.out.println(Kvc.sum(Kvb, Kva));
	}
	
	

}
