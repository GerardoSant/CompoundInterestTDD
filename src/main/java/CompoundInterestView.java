import java.util.Scanner;

public class CompoundInterestView {
    private static Scanner inputScanner = new Scanner (System.in);

    /*public static void main(String[] args) {
        start();
    }*/
    public static void start(){
        System.out.print("Tu capital será: "+ CompoundInterest.calculate(getUserInitialCapital(),getUserAnnualAddition(),
                getUserInterestRate(), getUserYearsToGrow()));
    }


    private static int getUserYearsToGrow() {
        return (int) askForUserInput("Años para crecer: ");
    }


    private static double getUserInterestRate() {
        return askForUserInput("Rentabilidad anual: ");
    }

    private static int getUserAnnualAddition() {
        return (int) askForUserInput("Adición anual sobre el capital: ");
    }

    private static double getUserInitialCapital() {
        return (int) askForUserInput("Capital inicial: ");
    }

    private static double askForUserInput(String sysout) {
        System.out.print(sysout);
        return getUserInput(inputScanner);
    }

    private static double getUserInput(Scanner inputScanner) {
        try{
            return inputScanner.nextDouble();
        } catch(Exception e){
            System.out.println("Has insertado un valor que no es un número. Debes insertar un valor númerico.");
            inputScanner.next();
            return getUserInput(inputScanner);
        }
    }


}
