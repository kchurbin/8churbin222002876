public class breakstatement1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            if (i == 1) {
                System.out.println("we are happy for you!");
                break;
            }
        }
    }
}
