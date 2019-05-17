import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ordempalavras {

	public static void main(String[] args) throws Exception {
		
		// VARIAVEIS

	String[] vetor = new String[10];
	
		//ENTRADA DE DADOS
	
	for (int i=0; i < 10; i++) {
		
	
		System.out.println("Digite o texto do índice[" + i +"]:");
		vetor [i] = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
	}
	
		// PROCESSAMENTO
	
	for (int i = 0; i < 9; i++) {
	for( int j = i + 1; j < 10; j++) {
	if (vetor[j].compareTo(vetor[i]) < 0 ) {
			String temp = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = temp;
		}
	}
}
	
	
		//SAÍDA DE DADOS
	
	for(int i = 0; i < 10; i++) {
	System.out.println(vetor[i]);
	
		}
	
	}
}
