
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt(),num;
        for(int i=0;i<t;i++){
            num=input.nextInt();
            if(num==0)
                System.out.println("NULL");
            if(num%2==1&&num>0)
                System.out.println("ODD POSITIVE");
            if(num%2==-1&&num<0)
                System.out.println("ODD NEGATIVE");
            if(num%2==0&&num>0)
                System.out.println("EVEN POSITIVE");
            if(num%2==0&&num<0)
                System.out.println("EVEN NEGATIVE");
        }
    }
    
}
