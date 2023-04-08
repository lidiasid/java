package lesson2;

public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append("i: ").append(i).append(" -> ").append((char)i).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}


