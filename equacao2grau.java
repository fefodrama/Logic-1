import java.io.BufferedReader;
import java.io.InputStreamReader;

public class equacao2grau{
	public static void main(String args[])throws Exception {
	double a, b, c, x;
	double x1, x2;
	String leitor = "";
	
	//Ler as variaveis
	System.out.println("Digite o valor de A: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	a = Double.parseDouble(leitor);
	
	System.out.println("Digite o valor de B: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	b = Double.parseDouble(leitor);
	
	System.out.println("Digite o valor de C: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	c = Double.parseDouble(leitor);
		
	System.out.println("Equacao = " + a + "x2-" + b + "x +" + c + " = 0");
	
	double delta = (b * b) - 4 * a * c;
	
	if (delta < 0) {
		
		System.out.println("Delta negativo, não existem raízes reais.");
		
	}
	else if(delta == 0) {
		System.out.println("Delta = 0, entao temos 2 raízes iguais: ");
		
		x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
		x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
		System.out.println("x' = " + x1);
		System.out.println("x'' = " + x2);
	}
	else {
		System.out.println("Delta positivo, as raízes são diferentes: ");
		
		x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
		x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
		
		
		System.out.println("x' = " + x1);
		System.out.println("x'' = " + x2);
				
		}
	
		
	}
	
}
