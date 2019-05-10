import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrizTransposta {
    public static void main (String args[]) throws Exception{
    	//Declaração de variáveis
    	String leitor = "";
    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
    	int matrizOrigem[][] = new int [2][3];
    	int matrizTransposta[][] = new int [3][2];
 
    	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 3; j++) {
    			System.out.println("Digite o valor da linha " + i + "da coluna " + j + ": ");
    			leitor = (new BufferedReader( new InputStreamReader(System.in))).readLine();
    			matrizOrigem[i][j] = Integer.parseInt(leitor);
    			
    		}
    	}
    	
    	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 3; j++) {
    		matrizTransposta[j][i] = matrizOrigem[i][j];
    			
    		}
    		System.out.println("");
    	}
    	
    	// Saida de dados
    	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 3; j++) {
    			System.out.print(matrizOrigem[i][j] + " ");
    		}
    		System.out.println("");
    	}
    	
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 2; j++) {
    			System.out.print(matrizTransposta[i][j] + " ");
    		}
    		System.out.println("");
    	}
    	
    	
}
}
