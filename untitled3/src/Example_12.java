public class Example_12 {
    public static void main(String[] args){
        for(int i = 1; i<31; i++){
            if(i%3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
