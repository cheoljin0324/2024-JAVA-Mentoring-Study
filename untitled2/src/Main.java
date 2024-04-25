
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = scanner.next();

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("나이는 "+age+ " 이름은 "+ name);
    }
}