import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i<n+1; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
