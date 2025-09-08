package view;
import java.util.Scanner;
import controller.ConverteController;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ConverteController c = new ConverteController();
		
		System.out.print("Insira um número de 0 a 1000: ");
		int n = input.nextInt();
		
		while(n < 0 || n > 1000) {
			System.out.print("Valor inválido!! Insira um número de 0 a 1000: ");
			n = input.nextInt();
		}
		
		c.DecToBin(n);
		
		String bin = c.getBinario();
		System.out.println("Binário de " + n + " é: "+ bin);
	}

}
