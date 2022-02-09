import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int [] num = new int[5]; //variavel local ao metodo main
		
		lerDados(num); // argumento --> variavel que será enviada para o método
		
		int maior = maiorValor(num);
		int menor = menorValor(num);
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);

	}

	public static int maiorValor(int[] num) {
		int aux = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>aux) {
				aux = num[i];
			}
		}
		return aux;
	}
	
	public static int menorValor(int[] num) {
		int aux = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<aux) {
				aux = num[i];
			}
		}
		return aux;
	}
	
	public static void lerDados(int[] num) { // parâmetro --> variavel que recebe o valor
		Scanner input = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			System.out.print("Digite um número inteiro: ");
			num[i]=input.nextInt();
		}
		
		input.close();
	}
}
