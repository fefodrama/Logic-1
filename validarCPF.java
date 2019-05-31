import java.io.BufferedReader;
import java.io.InputStreamReader;

public class validarCPF {

	static int CalcularPrimeiroDigito(String numeroCPF) throws Exception {
		
		//VARIAVEIS
	
		int retorno = 0;
		
		//PROCESSAMENTO
		
		for (int i = 0; i < 9; i++) {
			retorno = retorno + (Integer.parseInt("" + numeroCPF.charAt(i)) * (10 - i));
		}
		retorno = retorno % 11;
		if (retorno < 2) {
			retorno = 0;
		}else {
		retorno = 11 - retorno;
		}
		//RETORNO FUNCAO
		return retorno;
	}
	
	static int CalcularSegundoDigito(String numeroCPF) throws Exception {
		//VARIAVEIS
		
		int retorno = 0;
		
		//PROCESSAMENTO
		
		for (int i = 0; i < 10; i++) {
			retorno = retorno + (Integer.parseInt("" + numeroCPF.charAt(i)) * (11 - i));
		}
		retorno = retorno % 11;
		if (retorno < 2) {
			retorno = 0;
		}else {
			retorno = 11 - retorno;
		}
		
		//RETORNO FUNCAO
		return retorno;
	}
	
	static String leitordecpfdoteclado() throws Exception {
		
		//VARIAVEIS
		String retorno = "";
		
		//ENTRADA
		System.out.print("Digite o CPF");
		retorno = (new BufferedReader(new InputStreamReader(System.in))).readLine();

		//RETORNO
		return retorno;
	}
	
	public static void main (String[] args) throws Exception {
		
		//VARIAVEIS
		String numeroCPF = "";
		int primeirodigito = 0;
		int segundodigito = 0;
		
		//ENTRADA
		numeroCPF = leitordecpfdoteclado();
		
		//PROCESSAMENTO
		primeirodigito = CalcularPrimeiroDigito(numeroCPF);
		segundodigito = CalcularSegundoDigito(numeroCPF + primeirodigito);
		
		//SAÍDA
		System.out.println(" O cpf completo é:" + numeroCPF + "-" + primeirodigito + segundodigito);
	}


}
