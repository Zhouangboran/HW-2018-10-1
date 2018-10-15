import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int m=asd.nextInt();
        if (m>=3&&m<=5){
            System.out.println("Spring");
        }
        else if (m>=6&&m<=8){
            System.out.println("Summer");
        }
        else if (m>=9&&m<=11){
            System.out.println("Autumn");
        }
        else {
            System.out.println("Winter");
        }
    }
}
