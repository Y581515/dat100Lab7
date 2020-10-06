package dat200Lab7;
import static java.lang.Math.round;

import java.lang.Math;

public class Kvadrat {
	
	private int sidelengde;
	
	public Kvadrat(int sidelengde) {
		this.sidelengde=sidelengde;	
	}
	
//	public void settL(int sidelengde) {
//		this.sidelengde=sidelengde;		
//	}
	
	public int areal() {	
		return (int) Math.pow(sidelengde,2);
	}

	public  boolean sum(Kvadrat x, Kvadrat y) {
		boolean sant=false;
		if(areal() == x.areal()+y.areal()) {
			sant=true;
		}
			
		return sant;
	}

	public int omkrets() {
		return sidelengde*4;
	}
	
	private static double round1(double n){
		return (double)(round(n*100))/100;
	}
	
	public double diagonal() {
		return round1((double) Math.sqrt(areal()+areal()));
	}
	
	public String tegning() {
		String k="";
		for (int j=0;j<sidelengde;j++) {
			for (int i=0;i<sidelengde;i++) {
				k+="* ";		
			}k+="\n";
		}
		return k;
	}
	
	public String toString() {
		return "sidelengde= "+sidelengde+"\nomkretsen= "+omkrets()+"\nareal= "+
		areal()+"\nDiagonalen= "+diagonal();
	}
	
	
	
	
	
	
	
	
	
	
	
}
