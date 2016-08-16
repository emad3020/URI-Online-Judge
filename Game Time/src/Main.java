
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int start_time,end_time,sum;
        start_time=input.nextInt();
        end_time=input.nextInt();
        sum=end_time-start_time;
        if(sum<=0)
            sum+=24;
       System.out.println("O JOGO DUROU "+sum+" HORA(S)");
        
    }
    
}
