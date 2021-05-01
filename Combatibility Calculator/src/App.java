import compatibility.compatibility;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("First name?");
        String name1 = scan.nextLine();
    System.out.println("Second name?");
        String name2 = scan.nextLine();

        System.out.println(combatCalc(name1, name2));
    }
}
