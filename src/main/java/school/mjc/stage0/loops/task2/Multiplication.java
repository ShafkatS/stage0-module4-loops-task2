package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numbersBeforeLastPrinted = 0;
        while (lastPrinted >= numbersBeforeLastPrinted) {
            System.out.println(numbersBeforeLastPrinted);
            numbersBeforeLastPrinted++;
        }
    }
}
