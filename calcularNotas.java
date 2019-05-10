import java.io.BufferedReader;
import java.io.InputStreamReader;


public class calcularNotas{
	public static void main(String[] args) throws Exception {
	
		double nota1, nota2, nota3, nota4, media;
		String lerNota1 = "";
		String lerNota2 = "";
		String lerNota3 = "";
		String lerNota4 = "";
		
	
		
		System.out.print("Digite a primeira nota: ");
		lerNota1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota1 = Double.parseDouble(lerNota1);
		
		System.out.print("Digite a segunda nota: ");
		lerNota2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota2 = Double.parseDouble(lerNota2);

		System.out.print("Digite a terceira nota: ");
		lerNota3 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota3 = Double.parseDouble(lerNota3);

		System.out.print("Digite a quarta nota: ");
		lerNota4 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota4 = Double.parseDouble(lerNota4);

		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media das notas e: " + media);
		
	}
	
}
