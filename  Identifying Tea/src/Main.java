
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
     int t ,count=0;
     int [] test=new int[5];
     Scanner input=new Scanner(System.in);
     t=input.nextInt();
     if(t>=1&&t<=4){
     for(int i=0;i<test.length;i++ ){
         test[i]=input.nextInt();
         if(t==test[i])
             count++;
     }
        System.err.println(count);
    }
    }
    
}
