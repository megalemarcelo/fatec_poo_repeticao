import java.util.*;
public class ex03while {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.printf("Digite um número:\n");
    int n = leitor.nextInt();    
    
    int fatorial=1;

    while (n > 1) {
        fatorial = fatorial*n;
        n--;      
    }

    System.out.printf("\nO fatorial é %d\n", fatorial);

    leitor.close();
    } 
}