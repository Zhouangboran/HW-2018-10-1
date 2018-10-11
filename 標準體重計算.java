import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd =new Scanner(System.in);
        int height=asd.nextInt();
        int sex=asd.nextInt();
        float w;
        if (sex ==1){
            w=(height-80)*0.7f;
        }
        else {
            w=(height-70)*0.6f;
        }
        float v1=Math.round(w*10.0)/10.0f;
        System.out.println(v1);


    }
}
