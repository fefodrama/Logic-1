import java.io.BufferedReader;
import java.io.InputStreamReader;


public class calcfarenheit{
	public static void main(String[] args) throws Exception {
		
	double celsius;
	double farenheit;
	String lerCelsius = "";
	
	System.out.println("Digite o grau em celsius ");
	lerCelsius = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	celsius = Double.parseDouble(lerCelsius);
	
	
	farenheit = (celsius * 1.8) + 32;
	System.out.println("A temperatura em farenheit e: " + farenheit);	
		
		
	}
		
}
