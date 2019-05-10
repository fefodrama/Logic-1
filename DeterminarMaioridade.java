import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DeterminarMaioridade {
	public static void main(String[] args) throws Exception{
		
	int idade;
	String lerIdade = "";
	System.out.print("Digite a idade ");
	lerIdade = (new BufferedReader (new InputStreamReader(System.in))).readLine();		
	idade = Integer.parseInt(lerIdade);
			
	if (idade >= 18) {
		System.out.print("Voce é maior de idade");
		
	}
	else {
		System.out.print("Voce e menor de idade");		
		
	}
	
		
  }
	
}
