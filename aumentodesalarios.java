import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aumentodesalarios{
	public static void main (String[] args)throws Exception {
		String cargo;
				String leitor = "";	
				double atual, novo;
					
			System.out.println("Digite o seu cargo: \n gerente\n supervisor\n funcionario");	
				
				cargo = (new BufferedReader(new InputStreamReader(System.in))).readLine();
				
				
				System.out.println("Digite o seu salario atual");
				leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
				atual = Double.parseDouble(leitor);
				
				switch(cargo) {
				
				case "gerente":
					novo =  atual * 1.10;
					System.out.println("Cargo de Gerente");
					System.out.println("Aumento de 10%");
					System.out.println("Novo salario: " + novo);
					break;
					
				case "supervisor":
					novo = atual * 1.15;
					System.out.println("Cargo de supervisor");
					System.out.println("Aumento de 15%");
					System.out.println("Novo salario: " + novo);
					break;
					
				case "funcionario":
					novo = atual * 1.20;
					System.out.println("Cargo de funcionario");
					System.out.println("Aumento de 20%");
					System.out.println("Novo salario: " + novo);
					break;
		
		
		}				
		
	}
	
}
