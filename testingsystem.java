

import java.util.Scanner;

public class testingsystem {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x < 0){
            System.out.println(109 + ((x*y) % 109));
            return;
        }
        System.out.println((x*y) % 109);

    }
}
