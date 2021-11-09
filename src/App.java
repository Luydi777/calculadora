import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, res;
		int cont = 0;
		
		while (cont < 1 || cont > 4){
		
		System.out.println("QUAL OPERACAO VOCE DESEJA:");
			System.out.println("1 - Soma:");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");	                     			
            cont = sc.nextInt();
		
			switch (cont){
			
					case 1:
					System.out.println("Digite o primeiro valor: ");
					n1 = sc.nextDouble();
					System.out.println("Digite o segundo valor: ");
					n2 = sc.nextDouble();
					
					res = n1 + n2;
					System.out.println(res);
					break;
		
			 		case 2:
					System.out.println("Digite o primeiro valor: ");
					n1 = sc.nextDouble();
					System.out.println("Digite o segundo valor: ");
					n2 = sc.nextDouble();
					
					res = n1 - n2;
					System.out.println(res);
					break;
					
					case 3:
									System.out.println("Digite o primeiro valor: ");
					n1 = sc.nextDouble();
					System.out.println("Digite o segundo valor: ");
					n2 = sc.nextDouble();
					
					res = n1 * n2;
					System.out.println(res);		
					break;
					
					case 4:
									System.out.println("Digite o primeiro valor: ");
					n1 = sc.nextDouble();
					System.out.println("Digite o segundo valor: ");
					n2 = sc.nextDouble();
					
					res = n1 / n2;
					System.out.println(res);		
					break;
					
					default:
					System.out.println("Valor incorreto");
					break;
				}		
					
		}					
	}
}