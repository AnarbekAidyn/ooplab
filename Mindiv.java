
import java.util.Scanner;

public class Mindiv {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 2; i <= a ; i++){
            if(a % i == 0){
                System.out.print(i);
                return;
            }
        }

    }
}
