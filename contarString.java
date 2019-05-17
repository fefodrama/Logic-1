  import java.io.BufferedReader;
import java.io.InputStreamReader;

public class binarioDecimal {
	public static void main(String args[])throws Exception{
		BufferedReader ler = (new BufferedReader(new InputStreamReader(System.in)));
		String leitor = "";
		String remover = "";
		String contar = "";
		int posicao = -1;
		int quantidade = -1;
		System.out.println("Digite a palavra");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		System.out.println("Digite algo para remover");
		remover = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		System.out.println("Digite algo para ser contado:");
		contar = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		char primeiraletra = leitor.charAt(0);
		char ultimaletra = leitor.charAt(leitor.length() - 1);
		
		
		do {
			posicao = leitor.indexOf(contar, posicao + 1);
			quantidade++;
		}while(posicao > -1);
		
		System.out.println("primeira letra = " + primeiraletra);
		System.out.println("ultima letra = " + ultimaletra);
		System.out.println("tamanho = " + leitor.length());
		System.out.println("A string em maiusculas é " + leitor.toUpperCase());
		System.out.println("A string minuscula é " + leitor.toLowerCase());
		System.out.println("a string apos a remocao é " + leitor.replaceAll(remover, ""));
		System.out.println("a quantidade de vezes que aparece na string e:" + quantidade);		

}
}
