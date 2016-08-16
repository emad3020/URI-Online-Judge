import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int BN,hund=0,fift=0,twen=0,ten=0,five=0,two=0,one=0;
        BN=input.nextInt();
        while(BN>=100)
        {
            BN-=100;
            hund++;
        }
        while(BN>=50)
        {
            BN-=50;
            fift++;
        }
        while(BN>=20)
        {
            BN-=20;
            twen++;
        }
        while(BN>=10)
        {
            BN-=10;
            ten++;
        }
        while(BN>=5)
        {
            BN-=5;
            five++;
        }
        while(BN>=2)
        {
            BN-=2;
            two++;
        }
        while(BN>=1)
        {
            BN-=1;
            one++;
        }
        System.out.println(hund+" nota(s) de R$ 100,00");
        System.out.println(fift+" nota(s) de R$ 50,00");
        System.out.println(twen+" nota(s) de R$ 20,00");
        System.out.println(ten+" nota(s) de R$ 10,00");
        System.out.println(five+" nota(s) de R$ 5,00");
        System.out.println(two+" nota(s) de R$ 2,00");
        System.out.println(one+" nota(s) de R$ 1,00");
    

    }
    
    
}
