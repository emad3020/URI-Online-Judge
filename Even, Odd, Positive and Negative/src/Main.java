
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int t,positive_cout=0,negative_count=0,even_count=0,odd_count=0;
        for(int i=0;i<5;i++){
            t=input.nextInt();
            if(t%2==0)
                even_count++;
            if(t%2==1||t%2==-1)
                odd_count++;
            if(t>0)
                positive_cout++;
            if(t<0)
                negative_count++;
            
        }
        System.out.println(even_count+" valor(es) par(es)\n" +
odd_count+" valor(es) impar(es)\n" +
positive_cout+" valor(es) positivo(s)\n" +
negative_count+" valor(es) negativo(s)");
    }
    
}
