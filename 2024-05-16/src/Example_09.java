public class Example_09 {
    public static void main(String[] args){
        int[][] a = {{1,2}, {3,4,5}};

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
        for(int m[]:a){
            for(int n:m){
                System.out.println(n);
            }
        }
    }
}
