public class Example_10 {
    public static void main(String[] args){
        int i = 0;

        while(i<=20){
            if(i==17){
                System.out.println("17이 출력 되었습니다.");
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int n = 0; n<21; n++){
            if(n == 17){
                System.out.println("17이 출력 되었습니다.");
                break;
            }
            System.out.println(n);
        }
    }
}
