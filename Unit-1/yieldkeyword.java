import java.util.Scanner;

public class yieldkeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TrafficLight = sc.nextLine();
        String d = switch (TrafficLight) {
            case "Green" -> {
                System.out.println("Green");
                yield "go";
            }
            case "yellow" -> {
                System.out.println("yellow");
                yield "wait";
            }
            case "red" -> {
                System.out.println("red");
                yield "stop";
            }
            default -> "invalid";
        };
        System.out.println(d);
    }
}
