
/* Breno Amaral Santos */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C02177U {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String codigo = "", valor, cod1 = "";
		int opcao, cont = 0;
		do {
			System.out.println("Bens patrimoniais: ");
			System.out.println("1 - Inclusão de bem");
			System.out.println("2 - Exclusão de bem");
			System.out.println("3 - Atualização de bem");
			System.out.println("4 - Pesquisar bem");
			System.out.println("5 - Listagem dos bens");
			System.out.println("9 - Encerrar programa");
			opcao = teclado.nextInt();
			List<bens> dinamicLista = new ArrayList<bens>();
			if (opcao == 1 || opcao == 3) {
				System.out.println("Insira o codigo: ");
				codigo = teclado.nextLine();
				System.out.println("Insira a data base: ");
			}
			switch (opcao) {
				case 1:
					for (bens P : dinamicLista) {
						cod1 = P.getCodigo();
						if (codigo.equals(cod1)) {
							System.out.println("Bem ja cadastrado");
							break;
						}
					}
					System.out.println("Insira o valor(Em R$): ");
					valor = teclado.nextLine();
					System.out.println("Bem cadastrado");
					break;
				case 2:
					System.out.println("Insira o código do bem para ser removido: ");
					codigo = teclado.nextLine();
					for (bens P : dinamicLista) {
						cod1 = P.getCodigo();
						if (codigo.equals(cod1)) {
							P.imprimeBem();
							dinamicLista.remove(P);
							System.out.println("Bem excluído");
							break;
						} else {
							System.out.println("Bem não encontrado");
						}
					}
					break;
				case 3:
					System.out.println("Insira o codigo: ");
					codigo = teclado.nextLine();
					for (bens P : dinamicLista) {
						cod1 = P.getCodigo();
						if (codigo.equals(cod1)) {
							System.out.println("Insira o valor: ");
							valor = teclado.nextLine();
							P.setValor(valor);
							System.out.println("Bem atualizado");
						} else {
							System.out.println("Bem não encontrado");
						}
					}
					break;
				case 4:
					System.out.println("Insira o codigo: ");
					codigo = teclado.nextLine();
					for (bens P : dinamicLista) {
						cod1 = P.getCodigo();
						if (codigo.equals(cod1)) {
							System.out.println("Bem encontrado");
							P.imprimeBem();
						} else {
							System.out.println("Bem não encontrado");
						}
					}
					break;
				case 5:
					for (bens P : dinamicLista) {
						cont++;
						System.out.println("----------------------");
						P.imprimeBem();
						System.out.println("----------------------");
					}
					System.out.println("Quantidade de bens listados: " + cont);
					break;
				case 9:
					System.out.println("Fim do Programa");
					break;
				default:
					break;
			}
			teclado.close();
		} while (true);

	}

	public class bens {
		public String codigo, valor, dataBase;

		public bens(String codigo, String valor, String dataBase) {
			this.codigo = codigo;
			this.valor = valor;
			this.dataBase = dataBase;
		}

		public void imprimeBem() {
			System.out.println("Código: " + codigo);
			System.out.println("Valor: " + valor);
			System.out.println("dataBase: " + dataBase);
		}

		public String getCodigo() {
			return this.codigo;
		}

		public String getValor() {
			return this.codigo;
		}

		public String getDataBase() {
			return this.dataBase;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

		public void setDataBase(String dataBase) {
			this.dataBase = dataBase;
		}
	}
}