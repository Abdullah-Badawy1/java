public class DivisibleByNine {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;

        int sum = 0;
        int count = 0;

        System.out.println("Numbers divisible by 9 between 100 and 200:");
        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println("\nSum of numbers divisible by 9: " + sum);
        System.out.println("Count of numbers divisible by 9: " + count);
    }
}

