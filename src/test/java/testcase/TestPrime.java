package testcase;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import program.CheckPrime;

public class TestPrime {
    
        @Test
        public void testInputIsEven(){
            Assert.assertTrue(CheckPrime.checkIfInputIsAnEvenNumber(24)); // Assertion
        }
	
}
