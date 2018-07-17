import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SumOfDigitsNumberTest {

        private SumOfDigitsNumber sumOfDigitsNumber;

        @Before
        public void setUp(){
            sumOfDigitsNumber = new SumOfDigitsNumber();
        }

        @Test
        public void checkIfMethodReturnsExpectedSumOfDigitsNumber() {
            int acutalValue = sumOfDigitsNumber.sumTheNumberOfDigitsInVariable(871);
            int expectedValue = 16;
            Assertions.assertEquals(expectedValue, acutalValue);
        }
    }