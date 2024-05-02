public class Example_06 {
    public static void main(String[] args){
        while(true){
            int num = (int)(Math.random()*999)+1;
            System.out.println(num);
            if(num==17){
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
