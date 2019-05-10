import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matrizFILA {

	public static void main(String[] args) throws Exception {
		
		// VARIAVEIS
	String leitor="";
	int fila[] = new int [5];
	int opcao = 0;
	
		//ENTRADA DE DADOS
	do {
		System.out.println("1 - NOVO ELEMENTO / 2 - MOSTRAR FILA / 3 - SAIR");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		opcao = Integer.parseInt(leitor);
		
		switch (opcao) {
		case 1: 
			System.out.println("Qual o número do elemento?");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			for (int i = 3; i >= 0; i--) {
				fila[i+1] = fila[i];
			}
			
			fila[0] = Integer.parseInt(leitor);
			
			break;
			
		//SAÍDA DE DADOS
		case 2: 
			for (int i = 0; i < 5; i++) {
				System.out.print(fila[i] + " ");
			}
	
			System.out.println("");
		
			break;
	}
	
	}while (opcao < 3);
	
	
	
	}
		
	
	}
