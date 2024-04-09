import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        String s = "ujjwal sharma is my name";
        StringTokenizer tokenizer = new StringTokenizer(s, "\\s"); // delimeter = "whitespace"

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
