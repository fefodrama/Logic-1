import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tabelaValor {
    public static void main (String args[]) throws Exception{
    	//Declaração de variáveis
    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
    	String leitor = "";
    	double vetor[] = new double[100];
    	int codigo = 0;
    	double valor = 0;
    
    	
    	do {
    		System.out.println("Digite o codigo");
    		codigo = Integer.parseInt(ler.readLine());
    		System.out.println("Digite o valor");
    		valor = Double.parseDouble(ler.readLine());
    		vetor[codigo] = valor;
    		    		
    	System.out.println("Quer continuar? s/n");
    	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
    	}while (leitor.equals("s"));
    	
    	for (int i = 0; i < 100; i++) {
    		if (vetor[i] > 0) {
    			System.out.println(i + " => " + vetor[i]);
    		}
    	}
} 
}
