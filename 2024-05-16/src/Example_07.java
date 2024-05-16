import java.util.Scanner;

public class Example_07 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i<arr.length; i++){
            System.out.print("값을 입력:");
            arr[i] = scanner.nextInt();
        }

        for(int k : arr){
            if(k>=35)
              System.out.print(k+ " ");
        }
    }
}
