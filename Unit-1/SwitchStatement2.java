public class SwitchStatement2 {
    public static void main(String[] args) {
        String day = "monday";
        int d = switch (day) {
            case "monday", "friday", "sunday" -> 6;
            case "tuesday" -> 7;
            case "wednesday" -> 9;
            case "thursday", "saturday" -> 8;
            default -> -1;
        };
        System.out.println(d);
    }
}
