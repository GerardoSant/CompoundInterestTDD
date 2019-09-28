public class HowMuchMoneyCanIMake {

    public static int calculate(double initialCapital, int annualAddition, double interestRate, int yearsToGrow){
        double capital=initialCapital;
        return capital>=0 ? (int) getFinalCapital(annualAddition, interestRate, yearsToGrow, capital) : -1;

    }

    private static double getFinalCapital(int annualAddition, double interestRate, int yearsToGrow, double capital) {
        while(yearsToGrow-->0){
            capital = getOneYearIncrease(capital, annualAddition, interestRate);
        }
        return capital;
    }

    private static double getOneYearIncrease(double initialCapital, int annualAddition, double interestRate) {
        return (initialCapital*interestRate/100)+ initialCapital + annualAddition;

    }

    public static void main(String[] args) {
        System.out.println(calculate(3500,1000,10,10));
    }
}
