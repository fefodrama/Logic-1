import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vetorMaior {
    public static void main (String args[]) throws Exception{
    	//Declaração de variáveis
    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
    	int vetorOrigem[] = new int[10];
    	int vetorDestino[] = new int[10];
    	int numero = 0;
    	int posicao = 0;
    	    
    	for (int i = 0; i < 10; i++) {
    		System.out.println("Digite o valor da posicao" + i);
    		vetorOrigem[i] = Integer.parseInt(ler.readLine());
    	}
    	
    	System.out.println("Digite o numero: ");
    	numero = Integer.parseInt(ler.readLine());
    	
    	// Processamento
    	
    	for (int i = 0; i < 10; i++) {
    		if(vetorOrigem[i] > numero){
    		vetorDestino[posicao] = vetorOrigem[i];
    		posicao++;
    		}
    	}
    	
    	for (int i = 0; i < posicao; i++) {

    		System.out.println(vetorDestino[i] + ", ");
    }
} 
}
