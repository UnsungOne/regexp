public class SumOfDigitsNumber {
    public static void main(String[] args) {

        int numberToBeChecked = 871;
        System.out.println(sumTheNumberOfDigitsInVariable(numberToBeChecked));
    }

    public static int sumTheNumberOfDigitsInVariable(int numberToBeChecked) {

        int sum = 0;

        while (numberToBeChecked > 0) {
            sum = sum + numberToBeChecked % 10;
            numberToBeChecked = numberToBeChecked / 10;
        }
        return sum;
    }

}