import java.io.BufferedReader;
import java.io.InputStreamReader;


	public class cheques{
		
	public static void main (String args[])throws Exception{
		
		double qtdCheques = 0, chequesInseridos = 0, valorCheque, numeroCheque;
		String ler = "";
		BufferedReader leitor = (new BufferedReader(new InputStreamReader(System.in)));
		
		System.out.println("Digite a quantidade de cheques");
		qtdCheques = Double.parseDouble(leitor.readLine());
		
		do {
			System.out.println("Numero do cheque");
			numeroCheque = Double.parseDouble(leitor.readLine());
			
			System.out.println("Valor do cheque");
			valorCheque = Double.parseDouble(leitor.readLine());
			
			chequesInseridos++;
			
			System.out.println("Tem mais cheque? s/n");
			ler = leitor.readLine();
			
		}while (leitor.equals("s"));
		
		
		if (qtdCheques == chequesInseridos) {
			System.out.println("Lote valido");
		}else {
			System.out.println("Lote invalido");
		}
		
		
	}
	
}
