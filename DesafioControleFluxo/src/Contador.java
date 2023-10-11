import java.util.Scanner;

/** <h2>Controle de Fluxo</h2>
 * <p>Classe para criação de controle de fluxo, onde recebe dois números inteiros como parâmetros e retorna a quantidade de interações (for) dos números incrementados.</p>
 * @author Elaine Ferreira
 * @version 1.0
 * @since 2023/10/11
*/

public class Contador {

	/** <h4>Método que recebe os parâmetros via terminal</h4>
	 * @param parametroUm recebe o primeiro número
	 * @param parametroDois recebe o segundo número
	 * 
	 * <p>Checagem de exceções</p>
	 * <p>try: chama o método contendo a lógica de contagem</p>
	 * <p>catch: lança o retorno da exceção</p>
	 */
  	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
      System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}
	/** Método que valida se parametroUm é MAIOR que parametroDois e lança a exceção
	 * @throws ParametrosInvalidosException
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if(parametroUm > parametroDois){
      throw new ParametrosInvalidosException();
    }
		
		/** Realiza o for para imprimir os números com base na variável contagem */
		int contagem = parametroDois - parametroUm;
    for(int i = 0; i < contagem; i++) {
      System.out.println("Imprimindo o número " + (i+1));
    }  
	}
}
