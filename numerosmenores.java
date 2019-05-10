import java.io.BufferedReader;
import java.io.InputStreamReader;


public class numerosmenores{
	public static void main(String[] args) throws Exception {
	
	double a;
	double b;
	double c;
	double menor1;
	double menor2 = 0;
	double resultado;
	String leitor = "";
	
	System.out.println("Digite o primeiro valor: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	a = Double.parseDouble(leitor);
	
	System.out.println("Digite o segundo valor: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	b = Double.parseDouble(leitor);
	
	System.out.println("Digite o terceiro valor: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	c = Double.parseDouble(leitor);
	
	if (a <= b && a <= c) {
	menor1 = a;	
		if(b <= c ) {
			menor2 = b;
		}
		else {
			menor2 = c;
		}
	}
	else if (b <= a && b <= c){
	menor1 = b;	
		if (a <= c) {
			menor2 = a;
		}
		else{
			menor2 = c;
		}
	}
	else {
	menor1 = c;
		
		if (b <= a) {
			menor2 = b;
			
			}
		else {
			menor2 = a;
			
			}
		}
			
	}
	
	
	
	resultado = menor1 + menor2;
	System.out.println(resultado);
	
    }
	
}
