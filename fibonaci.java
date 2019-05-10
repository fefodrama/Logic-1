import java.io.BufferedReader;
import java.io.InputStreamReader;


public class fibonaci {
	public static void main(String[] args) throws Exception{
		
		int numeroAnterior = 0;
		int proximoNumero = 1;
		int numeroMaximo = 10;

		System.out.println("Sequencia Fibonacci de " + numeroMaximo + " numeros");
		
		for (int i = 1; i <= numeroMaximo; ++i) {
			System.out.print(numeroAnterior + " ");
			
			int soma = numeroAnterior + proximoNumero;
			numeroAnterior = proximoNumero;
			proximoNumero = soma;
			
		}
						
		
	}

}
