public class leetcode1 {

    public static void main(String[] args) {

        leetcode1 obj = new leetcode1();

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = obj.strStr(haystack, needle);

        System.out.println("Index: " + result);
    }

    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }

        return -1;
    }
}
