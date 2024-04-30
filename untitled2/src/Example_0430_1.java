public class Example_0430_1 {
    String title;
    String author;

    public Example_0430_1(String t){
        title = t; author = "작자미상";
    }

    public Example_0430_1(String t, String a){
        title = t; author = a;
    }

    public static void main(String[] args){
         Example_0430_1 littlePrince = new Example_0430_1("어린왕자", "생텍쥐페리");
         Example_0430_1 loveStory = new Example_0430_1("춘향전");
         System.out.println(littlePrince.title + " " + littlePrince.author);
         System.out.println(loveStory.title + " " + loveStory.author);
    }
}
