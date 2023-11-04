public class whileloop1 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("The sum of numbers from 1 up to 10 is: " + sum);
    }
}
