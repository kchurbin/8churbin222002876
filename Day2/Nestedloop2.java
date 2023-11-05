public class Nestedloop2 {
    public static void main(String[] args) {
        int n = 11;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 11; k++) {
                System.out.print(i * k + "\t");
            }
            System.out.println();
        }
    }
}
