import java.io.BufferedReader;
import java.io.InputStreamReader;




		public class multi {

		    public static void main (String args[])throws Exception{

		    	//Declaração de variáveis

		    	String leitor = "";

		    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
		    	int operando1[][] = new int [2][2];
		    	int operando2[][] = new int [2][2];
		    	int resultado[][] = new int [2][2];
		    	
		    	//Entrada de dados
		    	for (int i = 0; i < 2; i++) {
		    		for (int j = 0; j < 2; j++) {
			    		System.out.println("Digite a posicao [" + i + "," + j + "] do primeiro operando ");
			    		operando1[i][j] = Integer.parseInt(ler.readLine());
			    		
		    		}
		    	}
		    	
		    	for (int i = 0; i < 2; i++) {
		    		for (int j = 0; j < 2; j++) {
			    		System.out.println("Digite a posicao [" + i + "," + j + "] do primeiro operando ");
			    		operando2[i][j] = Integer.parseInt(ler.readLine());
			    		
		    		}
		    	}
		    	
		    	
		    	//Processamento
		    	for(int i = 0; i < 2; i++) {
		    		for (int j = 0; j < 2; j ++) {
		    			for (int k = 0; k < 2; k++) {
		    				resultado[i][j] = resultado[i][j] + (operando1[i][k] * operando2[k][j]);
		    			}
		    		}
		    	}
		 		    	
		    	
		    	//Saida de dados
		    	
		    	for(int i = 0; i < 2; i++) {
		    		for (int j = 0; j < 2; j ++) {
		    			System.out.print(resultado[i][j] + " ");
		    		}
		    		System.out.println("");
		    	}
		    
		    	    	

		}

		}
		
		


