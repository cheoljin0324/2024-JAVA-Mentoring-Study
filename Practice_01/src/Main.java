import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int max,min;
        int[] arr = new int[amount];
        for(int i = 0; i<amount; i++){
            arr[i] = scanner.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int k:arr){
            if(k>max) max = k;
            if(k<min) min = k;
        }

        System.out.print(min + " " + max);
    }
}