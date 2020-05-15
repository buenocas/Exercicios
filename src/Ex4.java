import java.util.Scanner;

public class Ex4 {

	public static void main (String args[]) {
		
		Scanner in = new Scanner (System.in);
		
		String nome ;
		
		double nota1, nota2, media;
		
		int count = 0, numalunos = 5, val;
		
		while(count <= numalunos ) {
			
			
			System.out.println("Nome do Alunx: ");
			
			nome = in.nextLine();
			
			
			do {
			System.out.println("Entre com o grau A: ");
			nota1 = in.nextDouble();
			
			if((nota1 > 0) && (nota1 <= 10)){
				
				val = 0;
				
			}else{
				System.out.println("Nota Inválida");
			
				val = 1;
				
			}
			}while(val != 0);
			
			
			do {
				System.out.println("Entre com o grau B: ");
				nota2 = in.nextDouble();
				
				if((nota2 > 0) && (nota2 <= 10)){
					
					val = 0;
					
				}else{
					System.out.println("Nota Inválida");
				
					val = 1;
					
				}
				}while(val != 0);
			
			media = (nota1 + nota2)/2;
			
			System.out.println("A média do Alunx é " + media);
			
	
	}
		}}
