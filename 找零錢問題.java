import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int n=asd.nextInt();
        int a1=asd.nextInt();
        int a2=asd.nextInt();
        int a3=asd.nextInt();
        int r=a1*15+a2*20+a3*30;
        int t=n-r;
        if (n<=0){
            System.out.println("0");
        }
        else {
            int v1=t/50;
            t=t%50;
            int v2=t/5;
            int v3=t%1;
            System.out.println(v3);
            System.out.println(v2);
            System.out.println(v1);
        }

    }
}
