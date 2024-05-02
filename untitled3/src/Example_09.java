public class Example_09 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        do{
            sum += i;
            System.out.println(i);
            i++;
        }while(i<=10);

        System.out.println(sum);
    }
}
