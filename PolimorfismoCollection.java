package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class PolimorfismoCollection {
	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		System.out.println("N�mero de caixas no estoque: ");
		int caixas = leia.nextInt();
		
		for(int i=0; i<caixas; i++) {
			System.out.println("Quantos itens h� na "+(i+1)+ "� caixa ?");
			int itens = leia.nextInt();
			System.out.println();
			leia.nextLine();
			System.out.println("� uma Caixa com: ");
			String eletronico =leia.nextLine();
			
			
			estoque.add(new Estoque(caixas,itens, eletronico));
			

		}
		for(Estoque i: estoque){
			
			System.out.println(i);
			
		}
		leia.close();
		
		

	}

}
