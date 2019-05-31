import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TorreHanoi {
	
	public static void main(String[] args)throws Exception {
		//VARIAVEIS
		String leitor = "";
		int N = 0;
		
    	//ENTRADA
    	System.out.println("Digite o número de discos");
    	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
    	N = Integer.parseInt(leitor);
    	
	
   
	
	//PROCESSAMENTO
	
	MoverTorreHanoi(N, "orig", "dest" , "aux");

}
	
	static void MoverTorreHanoi (int N, String orig, String dest, String aux) {
		if (N > 0) {
		MoverTorreHanoi(N -1, orig, dest, aux);
		System.out.println(" disco " + N + " movido de "  + orig + " para " + dest);
		MoverTorreHanoi(N-1, aux, orig, dest);
		
			}
	
		}
	
     }

