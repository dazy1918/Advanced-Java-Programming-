public class IntegerToRoman {
    public IntegerToRoman() {
    }

    public static String intToRoman(int var0) {
        int[] var1 = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] var2 = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder var3 = new StringBuilder();

        for (int var4 = 0; var4 < var1.length; ++var4) {
            while (var0 >= var1[var4]) {
                var0 -= var1[var4];
                var3.append(var2[var4]);
            }
        }

        return var3.toString();
    }

    public static void main(String[] var0) {
        short var1 = 3749;
        byte var2 = 58;
        short var3 = 1994;
        System.out.println(var1 + " -> " + intToRoman(var1));
        System.out.println(var2 + " -> " + intToRoman(var2));
        System.out.println(var3 + " -> " + intToRoman(var3));
    }
}
