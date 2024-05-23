import java.util.Scanner;

class CoffeCal{
    int money = 0;
    public void GetMoney(){
        System.out.print("금액 지불:");
        Scanner scanner = new Scanner(System.in);
        this.money=scanner.nextInt();
        this.money = money;
    }

    public String OppMoney(){
        if(this.money > 4000) return "금액 "+ this.money+ "를 받아 잔돈"+ (this.money-4000)+ "원 을 거슬렀습니다.";
        else if(this.money < 4000) return "금액이 "+ (4000-this.money)+"만큼 모자랍니다.";
        else return "결제 완료";
    }
}

public class Practice_02 {
    public static void main(String[] args){

        CoffeCal coffecal = new CoffeCal();

        coffecal.GetMoney();
        System.out.println(coffecal.OppMoney());
    }
}
