package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		//declarar vari�veis
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		String nomeDoUsuario;
		
		//ler o telclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu Nome?");
		nomeDoUsuario = leitor.nextLine();
		//criando as vari�veis para o c�lculo
		System.out.println(nomeDoUsuario + ", digite seu peso: ");//concatena��o
		pesoDoUsuario = leitor.nextInt();
		
		System.out.println("\nDigite sua altura: ");
		alturaDoUsuario = leitor.nextDouble();

		leitor.close();
		
		imc = pesoDoUsuario / (alturaDoUsuario*alturaDoUsuario);

		System.out.println("\n" + nomeDoUsuario + ", seu IMC �: " + imc + ".");
		
		System.out.println(imc);
		//determinar a classifica��o do imc
		if (imc < 18.5) {
			System.out.println("Voc� est� ABAIXO DO PESO");
					
		}else if(imc >= 18.5 && imc < 25 ) {
			System.out.println("PESO NORMAL");
		}else if(imc >= 25 && imc < 30 ) {
			System.out.println("SOBREPESO");
		}else if(imc >= 30 && imc < 35 ) {
			System.out.println("OBESIDADE GRAU I");
		}else if(imc >= 35 && imc < 40 ) {
			System.out.println("OBESIDADE GRAU II");
		}else if(imc >= 40 ) {
			System.out.println("OBESIDADE GRAU III OU M�RBIDA");
		}
	}		
}