package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
     
      calculator.StringCalculator stringCalculator;
     //Test case to check string returns 0 on empty string
       @Test
        public void TestAddWithEmptyStringReturnsZero()
        {
            string numbers = string.Empty;
            int result = stringCalculator.Add(numbers);
            Assert.AreEqual(0,
                            result);
        }
   //test case to check String returns addition of only one number present in string
        @Test
        public void TestAddWithSingleNumberInStringReturnsTheNumber()
        {
            string numbers = "1";
            int result = stringCalculator.Add(numbers);
            Assert.AreEqual(1,
                            result);
        }

    //Test case to check String returns addition of two numbers 
       @TestCase("1,2,3,4,5,6,7,8,9,10")
        public void TestAddWithMultipleNumbersInStringReturnsTheTotal(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(55,
                            result);
        }
    //Test case to check that add method returns total if the string contains new lines and coma seperated values
       @TestCase("1,2,3,4,5\n6,7,8\n9,10")
        public void TestAddWithMultipleNumbersInStringSplitWithNewLinesAndCommasReturnsTheTotal(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(55,
                            result);
        }

        @TestCase("1,2,3,4,\n6,7,\n9,10")
        public void TestAddWithMultipleNumbersInStringReturnZeroForEmptyNumbers(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(42,
                            result);
        }
     //Test to check using different delimeter
        @TestCase("//;\n1;2")
        public void TestAddWithMultipleNumbersInStringUsingDifferentDelimeter(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(3,
                            result);
        }
     //test case to check method returns exception on negative numbers
        @TestCase("//;\n1;-2")
        [ExpectedException(typeof (ArgumentException))]
        public void TestAddWithNegativeNumbersWillThrowException(string inputNumbers)
        {
            int result = stringCalculator.Add(inputNumbers);
            Assert.AreEqual(3,
                            result);
        }
    //test case to check if no is greater that 1000 then number is ignored
       @Test
       public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
        Assert.assertEquals(3+1000+6, StringCalculator8.add("3,1000,1001,6,1234"));
}
}
