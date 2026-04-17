public class SwitchExpression2 {
    public static void main(String[] args) {
        String day = "monday";
        String d = switch (day) {
            case "monday", "friday", "thursday", "tuesday", "wednesday" -> "weekdays";
            case "sunday", "saturday" -> "weekend";
            default -> "invalid";
        };
        System.out.println(d);
    }
}
