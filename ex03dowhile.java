import java.util.*;
public class ex03dowhile {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.printf("Digite um número:\n");
    int n = leitor.nextInt();    
    
    int fatorial=1;

    do {
        fatorial = fatorial*n;
        n--;
    } while (n > 1);   

    System.out.printf("\nO fatorial é %d\n", fatorial);

    leitor.close();
    } 
}