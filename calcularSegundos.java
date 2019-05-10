import java.io.BufferedReader;
import java.io.InputStreamReader;


public class calcularSegundos{
	public static void main(String[] args) throws Exception {
		
	double segundos;
	String lerSegundos = "";
	
	System.out.println("Digite os segundos");
	lerSegundos = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	segundos = Double.parseDouble(lerSegundos);
	

	System.out.println(segundos + " segundos sao: " + segundos / 60 + " minutos, " + segundos / 3600 + " horas, " + segundos / 86400 + " dias" );
		
		
		
	}
	
}
