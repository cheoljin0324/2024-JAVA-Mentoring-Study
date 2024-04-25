import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x>0 && y>0){
            System.out.println("1사분면");
        }
        else if(x<0 && y<0){
            System.out.println("2사분면");
        }
        else if(x>0 && y<0){
            System.out.println("3사분면");
        }
        else if(x<0 && y>0){
            System.out.println("4사분면");
        }
        else{
            System.out.println("다른 문제란다.");
        }
    }
}
