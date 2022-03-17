import java.util.*;
public class ex03for {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.printf("Digite um número:\n");
    int n = leitor.nextInt();    
    
    leitor.close();

    int fatorial=1;

    for ( ; n > 1;  n--) {
        fatorial = fatorial*n;
    }

    System.out.printf("\nO fatorial é %d\n", fatorial);
    } 
}