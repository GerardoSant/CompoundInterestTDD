import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class CompoundInterest_ {
    private int initialCapital;
    private int annualAddition;
    private double interestRate;
    private int yearsToGrow;
    private int finalcapital;

    public CompoundInterest_(int initialCapital, int annualAddition, double interestRate, int yearsToGrow, int finalcapital) {
        this.initialCapital = initialCapital;
        this.annualAddition = annualAddition;
        this.interestRate = interestRate;
        this.yearsToGrow = yearsToGrow;
        this.finalcapital = finalcapital;
    }

    @Test
    public void execute(){
        assertThat(CompoundInterest.calculate(initialCapital,annualAddition,interestRate,yearsToGrow))
                .isEqualTo(finalcapital);
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {0,0,0,0,0},
                {-100,0,10,5,-1},
                {100,0,0,0,100},
                {100,0,0,1,100},
                {100,0,10,1,110},
                {100,100,10,1,210},
                {100,100,0,0,100},
                {100,100,10,0,100},
                {100,0,10,0,100},
                {100,100,10,2,331},
                {100,100,10,5,771},
                {100,1000,10,5,6266},
                {100,1000,15,10,20708},
                {1000,1000,15,10,24349},
        };
    }


}

