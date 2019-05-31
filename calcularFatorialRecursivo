import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fatorial {
	static int calcularFatorial (int numero) {
		int retorno = 1;
		if (numero == 1) {
			retorno = 1;
		}else {
			retorno = retorno * numero * calcularFatorial(numero -1);
		}	
	return retorno;	
	}
	
    public static void main(String[] args)throws Exception{
    	
    	//VARIAVEIS
    	
    	int numero = 0;
    	int fatorial = 0;
    	String leitor = "";
    	
    	
    	//ENTRADA
    	System.out.println("Digite um número");
    	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
    	numero = Integer.parseInt(leitor);
    	
    	//PROCESSAMENTO
    	
    	fatorial = calcularFatorial(numero);
    	
    	//SAÍDA
    	
    	System.out.println(numero + "!" + fatorial);
    	
	}
}
