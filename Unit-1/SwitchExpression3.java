public class SwitchExpression3 {

    public static void main(String[] args) {

        String month = "apr";

        String m = switch (month) {
            case "nov", "dec", "jan", "feb" -> "Winter";
            case "mar", "apr", "may" -> "Spring";
            case "jun", "jul", "aug" -> "Summer";
            case "sept", "oct" -> "Autumn";
            default -> "Invalid Month";
        };

        System.out.println(m);
    }
}