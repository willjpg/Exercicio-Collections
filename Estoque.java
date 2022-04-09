package ExerciciosCollections;

public class Estoque {

	
		private int caixas;
		private int itens;
		private String eletronicos;
		
		
		
		
		public Estoque(int caixas, int itens, String eletronicos) {
			super();
			this.caixas = caixas;
			this.itens = itens;
			this.eletronicos = eletronicos;
		}


		public int getCaixas() {
			return caixas;
		}


		public void setCaixas(int caixas) {
			this.caixas = caixas;
		}


		public int getItens() {
			return itens;
		}


		public void setItens(int itens) {
			this.itens = itens;
		}


		public String getEletronicos() {
			return eletronicos;
		}


		public void setEletronicos(String eletronicos) {
			this.eletronicos = eletronicos;
		}


		@Override
		public String toString() {
			return "Estoque com [itens: " + itens + ", eletronico: " + eletronicos + "]";
		}
		
		
}
