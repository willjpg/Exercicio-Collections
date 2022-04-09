package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class PolimorfismoCollection {
	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		System.out.println("Número de caixas no estoque: ");
		int caixas = leia.nextInt();
		
		for(int i=0; i<caixas; i++) {
			System.out.println("Quantos itens há na "+(i+1)+ "º caixa ?");
			int itens = leia.nextInt();
			System.out.println();
			leia.nextLine();
			System.out.println("É uma Caixa com: ");
			String eletronico =leia.nextLine();
			
			
			estoque.add(new Estoque(caixas,itens, eletronico));
			

		}
		for(Estoque i: estoque){
			
			System.out.println(i);
			
		}
		leia.close();
		
		

	}

}
