public class CompoundInterest {

    public static int calculate(double initialCapital, int annualAddition, double interestRate, int yearsToGrow){
        double capital=initialCapital;
        return capital<0 ? -1 :(int) getFinalCapital(annualAddition, interestRate, yearsToGrow, capital);

    }

    private static double getFinalCapital(int annualAddition, double interestRate, int yearsToGrow, double capital) {
        while(yearsToGrow-->0){
            capital += getOneYearIncrease(capital, annualAddition, interestRate);
        }
        return capital;
    }

    private static double getOneYearIncrease(double capital, int annualAddition, double interestRate) {
        return getYearInterests(capital, interestRate) + annualAddition;

    }

    private static double getYearInterests(double capital, double interestRate) {
        return capital*interestRate/100;
    }

}
