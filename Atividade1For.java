package atividadederepeticao;

import java.util.Scanner;


public class Atividade1For {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);

		int Num1, Num2;

		System.out.println("Entre com o primeiro valor do intervalo: ");
		Num1 = leia.nextInt();

		System.out.println("Entre com o segundo valor do intervalo: ");
		Num2 = leia.nextInt();

		leia.close();

		if(Num1 > Num2) {
			System.out.println("Intervalo Inválido");
		}
		for (int i = Num1; i <= Num2; i++ ) {
			if(i % 3 ==0 && i % 5 == 0){
				System.out.print(i + " é múltiplo de 3 e 5\n");
			}
		}
	}
}
