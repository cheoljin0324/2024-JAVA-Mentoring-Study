public class Practice_03 {
    public static void main(String args[]){
        int cnt = 0;
        for(int i = 1; i<=20; i++){
            if(i%2!=0 && i%3!=0) cnt += i;
        }
        System.out.println(cnt);
    }
}
