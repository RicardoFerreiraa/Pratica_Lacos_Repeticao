package atividadederepeticao;

import java.util.Scanner;

public class Atividade1DoWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int Numero, soma =0;


		do {
			System.out.println("Digite um numero: ");
			Numero =sc.nextInt();

			if(Numero >0) {
				soma += Numero;
			}
		}while( Numero !=0);

		System.out.println("A soma dos numeros positivos é: "+soma);
		sc.close();
	}

}
