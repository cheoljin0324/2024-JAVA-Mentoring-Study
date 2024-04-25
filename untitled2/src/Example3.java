public class Example3 {

    public static void main(String[] args){
        int example = 17;
        if(example<20){
            if(example<15){
                System.out.println(example+"은 15보다 작음");
            }
            else {
                System.out.println(example+"은 20보다 작고 15보다 큼");
            }
        }
        else{
            System.out.println(example+"은 20보다 큼");
        }
    }
}
