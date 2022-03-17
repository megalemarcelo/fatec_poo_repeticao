import java.util.Scanner;  

public class ex04 {  
   public static void main (String args[]){    
        Scanner leitor = new Scanner (System.in);    
        
        int n, n1=0, resto, i=0;    
          
        System.out.printf("\nDigite um número: ");    
        n = leitor.nextInt();    
              
        while (n >= n1) {  
            n1++;  
            resto = n % n1;   
            
            if (resto == 0){  
                i++;  
            }   
        }

        if (i <= 2)   {         
            System.out.printf("%d é um número primo", n);   
        }
        else {  
            System.out.printf("%d não é um número primo", n);  
        }        
    
    leitor.close();
        }      
      }