import java.io.BufferedReader;
import java.io.InputStreamReader;


public class fatorial{
    public static void main(String[] args)throws Exception{
        int fatorial;
        int numero = 1;
        String lerFatorial = "";
        System.out.print("Digite o numero que deseja saber a fatorial: "); 
        lerFatorial = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        fatorial = Integer.parseInt(lerFatorial);

       for (int i = 1; i <= fatorial; i++){


            numero*=i;
            
       }
       System.out.println("O fatorial é " + numero );

    }
}