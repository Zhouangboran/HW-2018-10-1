import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int h1=asd.nextInt();
        int min1=asd.nextInt();
        int h2=asd.nextInt();
        int min2=asd.nextInt();
        int min=(h2*60+min2)-(h1*60+min1);
        int money;
        if (min<120){
            money=30*(min/30);
        }
        else if (min<240){
            min=min-120;
            money=120+40*(min/30);
        }
        else {
            min=min-240;
           money=120+160+60*(min/30);
        }
        System.out.println(money);
    }
}
