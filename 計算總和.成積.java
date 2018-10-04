import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int v1=asd.nextInt();
        int v2=asd.nextInt();
        int v3=v1+v2;
        int v4=v1*v2;
        int v5=v1-v2;
        int v6=v1/v2;
        int v7=v1%v2;
        System.out.println(v1+"+"+v2+"="+v3);
        System.out.println(v1+"*"+v2+"="+v4);
        System.out.println(v1+"-"+v2+"="+v5);
        System.out.println(v1+"/"+v2+"="+v6+"..."+v7);

    }
}
