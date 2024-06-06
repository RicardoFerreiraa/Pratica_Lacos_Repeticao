package atividadederepeticao;

import java.util.Scanner;

public class Atividade1While {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int idade;
		int menos20 = 0, maior50 =0;

		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();

		while(idade >=0) {
			if( idade <21) {
				menos20++;
			}
			if(idade >50) {
				maior50++;
			}
			System.out.println("Digite uma idade: ");
			idade=sc.nextInt();
		}
		System.out.println("Total de pessoas menores de 21: "+ menos20);
		System.out.println("Total de pessoas menores de 21: "+ maior50);
		sc.close();
	}

}
