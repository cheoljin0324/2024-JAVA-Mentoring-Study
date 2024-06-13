import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int userMoney=0;
        int selection=0;

        while(selection!=4){
            System.out.println("--------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            selection=scanner.nextInt();

            if(selection==1) {
                int saveM = 0;
                System.out.print("예금액>");
                saveM = scanner.nextInt();
                userMoney += saveM;
            }
            else if(selection==2){
                int outM = 0;
                System.out.print("출금액>");
                outM=scanner.nextInt();
                if(userMoney<outM){
                    System.out.println("잔고 부족");
                    System.out.println("부족 금액 : "+(outM-userMoney));
                }
                else{
                    userMoney -= outM;
                }
            }
            else if(selection==3){
                System.out.println("잔고> "+ userMoney);
            }
        }
        System.out.println("프로그램 종료");
    }
}
