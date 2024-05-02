import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for(int j = 0; j<i; j++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }

    }
}
