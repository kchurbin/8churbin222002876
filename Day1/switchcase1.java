public class switchcase {
    public static void main(String[] args) {
        int months = 5;

        switch (months) {
            case 1:
                System.out.println("january  ");
                break;
            case 2:
                System.out.println(" february ");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            default:
                System.out.println("Invalid month ");
                break;
        }
    }
}
