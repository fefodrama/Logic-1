import java.io.BufferedReader;
import java.io.InputStreamReader;

public class palindromo {

	public static void main(String[] args) throws Exception {
		
		// VARIAVEIS
		String normal = "";
		String invertida = "";
		
		// ENTRADA DE DADOS
		
		System.out.println("Digite uma palavra");
		normal = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		//PROCESSAMENTO
	for (int i = (normal.length() -1) ; i >= 0; i--) {
		invertida = invertida + normal.charAt(i);
	}
	
		//SAÍDA DE DADOS
	
		if(normal.equals(invertida)){
		  System.out.println("É palíndromo");
		}else
			System.out.println("Não é palíndromo");

	}
}
