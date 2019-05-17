import java.io.BufferedReader;
import java.io.InputStreamReader;

public class binarioDecimal {
	public static void main(String args[])throws Exception{
		BufferedReader ler = (new BufferedReader(new InputStreamReader(System.in)));
		String leitor = "";
		String remover = "";
		System.out.println("Digite a palavra");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		System.out.println("Digite algo para remover");
		remover = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		char primeiraletra = leitor.charAt(0);
		char ultimaletra = leitor.charAt(leitor.length() - 1);
		
		
		System.out.println("primeira letra = " + primeiraletra);
		System.out.println("ultima letra = " + ultimaletra);
		System.out.println("tamanho = " + leitor.length());
		System.out.println("A string em maiusculas é " + leitor.toUpperCase());
		System.out.println("A string minuscula é " + leitor.toLowerCase());
		System.out.println("a string apos a remocao é " + leitor.replaceAll(remover, ""));
				

}
}
