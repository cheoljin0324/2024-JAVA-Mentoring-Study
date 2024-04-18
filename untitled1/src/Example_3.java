
class Students{
    String stdName = "김철진";
    int stdNum = 202430105;
    int old = 1;

}

public class Example_3 {

    public static void main(String[] args){
        Students students = new Students();

        System.out.println("학생의 이름:"+ students.stdName);
        System.out.println("학생의 학번:"+ students.stdNum);
        System.out.println("학생의 학년:" + students.old);
    }

}
