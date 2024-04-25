import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a= scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a==b && b==c){
            int result = 10000+(a*1000);
            System.out.println(result);
        }
        else if((a==b || b==c)|| a==c){
            if(a==b||b==c){
                int result =  a==b ? 1000+(a*100) : 1000+(b*100);
                System.out.println(result);
            }
            else{
                int result = 1000+(c*100);
                System.out.println(result);
            }
        }
        else{
            if(a>=b && a>=c){
                int result = a*100;
                System.out.println(result);
            }
            else if(b>=a && b>=c){
                int result = b*100;
                System.out.println(result);
            }
            else{
                int result = c*100;
                System.out.println(result);
            }
        }

    }
}
