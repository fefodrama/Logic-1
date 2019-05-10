import java.io.BufferedReader;
import java.io.InputStreamReader;


public class trianguloAngulo{
	public static void main(String[] args)throws Exception{
		
	int angulo1, angulo2, angulo3;
	String leitor = "";	
		
	System.out.print("Digite o primeiro angulo: ");	 
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo1 = Integer.parseInt(leitor);
	
	System.out.print("Digite o segundo angulo: ");	
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo2 = Integer.parseInt(leitor);
	
	System.out.print("Digite o terceiro angulo: ");	 
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo3 = Integer.parseInt(leitor);	
		
		
	if (angulo1 == angulo2 && angulo2 == angulo3 && angulo3 == angulo1) {
		System.out.println("Triangulo equilatero ");
		
	}
	else if(angulo1 != angulo2 && angulo1 == angulo3 || angulo2 != angulo1 && angulo2 == angulo3 || angulo1 != angulo3 && angulo1 == angulo2){
		System.out.println("O triangulo e isosceles");
		
	}
	else if (angulo1 != angulo2 && angulo1 != angulo3 && angulo2 != angulo3) {
	System.out.println("Triangulo escaleno");	
		
		
	}
	
	}
	
}
