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
    @Parameters({"numberToDivide","nullParameter"})
    @Test
    public void TestDividerTonull(int numberToDivide, int nullParameter){
    System.out.println("This is the result "+util.divide(numberToDivide, nullParameter));
    }
    
    @Parameters({"numberToDivideWithCero"})
    @Test
    public void TestDividerPrintCero(int numberToDivide){
    System.out.println("This pass when you use cero to divede they return "+util.divide(numberToDivide,0));
    }
}
