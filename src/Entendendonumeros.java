import java.util.Scanner;

public class Entendendonumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma, subtracao, divisao, multiplicacao;

		System.out.println("Calculadora");
		System.out.println("Digite um valor:");

		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = leitor.nextInt();

		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;

		System.out.println("A soma da opera��o � " + soma);
		System.out.println("A subtra��o da opera��o � " + subtracao);
		System.out.println("A multiplca��o da opera��o � " + multiplicacao);
		System.out.println("A divis�o dos valores � " + divisao);

	}

}
