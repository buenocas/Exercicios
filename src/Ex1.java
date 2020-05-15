
public class Ex1 {

	public static void main (String args []) {
	
		int i, maxvalor = 500, somaimpar =0;
		
		for(i=0; i<= maxvalor; i+= 3) {			
			somaimpar = somaimpar + i;			
		}
		
		System.out.println("A soma dos números são: " + somaimpar);
		
	}
}
