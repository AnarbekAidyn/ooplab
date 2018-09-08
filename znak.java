

import java.util.Scanner;

public class znak {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a > 0){
            System.out.println(1);
        }
        else if(a < 0){
            System.out.println(-1);

        }
        else{
            System.out.println(0);
        }

    }
}
