package atividadederepeticao;

import java.util.Scanner;

public class Atividade2For {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int par=0, impar=0 ;
		int digito;



		for (int i = 0; i <=9; i++) {

			System.out.println("Digite o "+ (i+1) + "º Numero ");
			digito=sc.nextInt();

			if(digito % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros ímpares: " + impar);
		sc.close();
	}

}
