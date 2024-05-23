import java.util.Scanner;

class Sum{
    int result = 0;
    public int sumVariable(int n, int m){
        for(int i = n; i<=m; i++){
            result += i;
        }
        return result;
    }
}


public class Practice_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sum sum = new Sum();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(sum.sumVariable(num1, num2));
    }
}
