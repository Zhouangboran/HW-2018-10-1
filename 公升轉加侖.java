import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        float v1=asd.nextFloat();
        float v2=v1*0.26418f;
        float v3=Math.round(v2*10.0)/10.0f;
        System.out.println(v3);
    }
}
