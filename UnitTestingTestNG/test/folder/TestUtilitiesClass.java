package folder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Logic.Utilities;
import java.util.Random;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author MOGLI
 */
public class TestUtilitiesClass {
    Utilities util = new Utilities();
    
    public TestUtilitiesClass() {
    }

    @Parameters({"Number1","Number2"})
    @Test
    public void TestDivider(int Number1, int Number2){
    System.out.println("This is the result "+util.divide(Number1, Number2));
    }
    
    @Parameters({"numberToDivide","nullParameter"})
    @Test
    public void TestDividerTonull(int numberToDivide, int nullParameter){
    System.out.println("This is the result "+util.divide(numberToDivide, nullParameter));
    }
      
}
