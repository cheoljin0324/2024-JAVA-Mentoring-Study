import java.util.Scanner;

public class Practice_05 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = scanner.nextInt();
        }

        int onNull = 0;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if(i!=j && arr[i] == arr[j]) {
                    onNull = 1;
                    System.out.println(i + " ");
                }
            }
        }

        if(onNull == 0){
            System.out.println("일치하는 값이 존재하지 않습니다.");
        }
    }
}
