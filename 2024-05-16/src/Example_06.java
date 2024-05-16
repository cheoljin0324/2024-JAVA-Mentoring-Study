import java.util.Scanner;

public class Example_06 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i< arr.length; i++){
            System.out.print("값 입력:");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
           if(arr[i]>=35)
            System.out.print(arr[i]+ " ");
        }

    }
}
