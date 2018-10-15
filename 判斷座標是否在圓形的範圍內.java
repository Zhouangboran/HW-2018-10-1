import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int X=asd.nextInt();
        int Y=asd.nextInt();
        if (X*X+Y*Y<=100*100){
            System.out.println("inside");
        }
        else {
            System.out.println("outside");
        }

    }
}
