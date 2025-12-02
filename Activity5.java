public class Activity5 {
/*
set range int i to 1 <= 50
return sum value
 */
    public static void main(String[] args) {
        int result = getSum(); 
        System.out.println("SUM = " + result);
    }
//method for computing the sum
    public static int getSum() {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        return sum;   //retuning sum
    }// getSum method ends
} //class ends
