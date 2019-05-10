import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OPORA {

	public static void main(String[] args) throws Exception {
		// VARIAVEIS
		
	String leitor="";
	int [][] operando1 = new int[2][2];
	int [][] operando2 = new int[2][2];
	int [][] resultado = new int[2][2];

	for (int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
			System.out.println("Qual a posição [" + i + "," + j + "] do Operando 1?");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			operando1[i][j] = Integer.parseInt(leitor);
		}
	}
	
	for (int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
			System.out.println("Qual a posição [" + i + "," + j + "] do Operando 1?");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			operando2[i][j] = Integer.parseInt(leitor);
		}
		
	}
	
	//PROCESSAMENTO
	for (int i=0;i<2;i++) {
		for (int j=0;j<2;j++) {
			for (int k=0;k<2;k++) {
				resultado[i][j] = resultado[i][j] + (operando1[i][k] * operando2[k][j]);
			}
		}
	}
		//SAÍDA
		
		for (int i = 0;i<2; i++) {
			for (int j=0;j<2;j++) {
				System.out.print(resultado[i][j] + " ");
	
			}
			System.out.println(" ");
		}

	}
}
