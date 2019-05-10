import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aula4{
	public static void main(String args[]) throws Exception{
		//variaveis
		double pinga;
		double cerveja;
		double pastel;
		double carneSol;
		double refri;
		double garçom;
		double conta;
		String leitor = "";
		
		//ler quantidade
		System.out.println("Digite a quantidade de pinga: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		pinga = Double.parseDouble(leitor);
		
		System.out.println("Digite a quantidade de cerveja: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cerveja = Double.parseDouble(leitor);
		
		System.out.println("Digite a quantidade de pastel: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		pastel = Double.parseDouble(leitor);
		
		System.out.println("Digite a quantidade de carneSol: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		carneSol = Double.parseDouble(leitor);
		
		System.out.println("Digite a quantidade de refri: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		refri = Double.parseDouble(leitor);
		
		conta = (pinga * 3) + (cerveja * 8) + (pastel * 15) + (carneSol * 50) + (refri * 2);
		garçom = (conta * 10) / 100;
		
		System.out.println("preço da conta = " + conta);
		System.out.println("taxa do garçom = " + garçom);
		
	}
}
