package com.sda.thobho.zdautpol1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }


    //add 0,0 -> 0
    //add 1, 11 -> 12
    //add 2147483647, 1 -> -2147483648 (! to jest poprawne zachowanie "na teraz")

    @Test
    public void shouldAddZeros(){
        //arrange
        int first = 0;
        int second = 0;
        int expectedResult = 0;

        //act
        int actualResult = calculator.add(first, second);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldAddTwoNumbers(){

    }


    //CTRL + SPACE -> autocomplete
    //ALT + ENTER -> problem solving hint











    //divide 2 / 2 -> 1
    //divide 3 / 2 -> 1
    //divide 10 / 0 -> null, wykorzystaj metodę assertNull()
    //divide 0 / 12 -> 0
    //divide 1/2 -> 0
    //divide 100 / 50 -> 2






}
