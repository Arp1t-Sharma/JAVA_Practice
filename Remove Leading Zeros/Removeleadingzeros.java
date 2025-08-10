public class Removeleadingzeros {

    public static void main(String[] args) {
        String input = "000123";
        String result = removeLeadingZeros(input);
        System.out.println(result); // Output: "123"
    }

    public static String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        return sb.toString();
    }
}