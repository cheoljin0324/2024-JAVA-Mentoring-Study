public class Practice_02 {
    public static void main(String args[]){
        int val1 = 4;
        int val2 = 0;
        int val3 = 5;
        int val4 = 0;

        for(int i = 1; i<=10; i++){
            val2 = i;
            for(int j = 1; j<=10; j++){
                val4 = j;
                if((val1*val2)+(val3*val4) == 60){
                    System.out.println("x:" + val2 + " y:" + val4);
                }
            }
        }
    }
}
