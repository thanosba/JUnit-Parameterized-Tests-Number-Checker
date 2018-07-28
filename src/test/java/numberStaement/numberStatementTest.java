//Created by thanos-macbookpro

package numberStaement;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class numberStatementTest {
    private Integer inputNumber;
    private Integer inputNumber2;
    private Integer inputNumber3;
    private Boolean expectedResult;
    private numberStatement numberStatementChecker;

    @Before
    public void initialize() {
        numberStatementChecker = new numberStatement();
    }

    public numberStatementTest(Integer inputNumber, Integer inputNumber2, Integer inputNumber3, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.inputNumber2 = inputNumber2;
        this.inputNumber3 = inputNumber3;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 10,0,11, true },
                { 100,0,500, true },
                { 8,0,6000, true },
        });
    }

    @Test
    public void testState() {
        System.out.println("Parameterized Numbers are : " + inputNumber + " " + inputNumber2 + " " + inputNumber3);
        assertEquals(expectedResult, numberStatementChecker.between(inputNumber, inputNumber2, inputNumber3));
    }
}
