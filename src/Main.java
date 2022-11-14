public class Main {
    public static void main(String[] args) {

        //видеоурок
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight =  weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }



        //task 1-3
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;
        System.out.println(threeNumbers[2] + "," + threeNumbers[1] + "," + threeNumbers[0]);
        double[] threeNumbersWithDot = {1.57, 7.654, 9.986};
        System.out.println(threeNumbersWithDot[2] + "," + threeNumbersWithDot[1] + "," + threeNumbersWithDot[0]);
        int[] randomNumbers = {12, 37283, 1223};
        System.out.println(randomNumbers[2] + "," + randomNumbers[1] + "," + randomNumbers[0]);

        //task 4
        int[] newNumbers = new int[3];
        newNumbers[0] = 55;
        newNumbers[1] = 32;
        newNumbers[2] = 34;
        for (int u = 0; u < newNumbers.length; u++);{
            if (newNumbers[0] % 2 == 0){
                System.out.println(newNumbers[0]);
            }else {
                newNumbers[0] = newNumbers[0] + 1;
                System.out.println(newNumbers[0]);
            }
            if (newNumbers[1] % 2 == 0){
                System.out.println(newNumbers[1]);
            }else {
                newNumbers[1] = newNumbers[1] + 1;
                System.out.println(newNumbers[1]);
            }
            if (newNumbers[2] % 2 == 0){
                System.out.println(newNumbers[2]);
            }else {
                newNumbers[2] = newNumbers[2] + 1;
                System.out.println(newNumbers[2]);
            }
        }
    }
}