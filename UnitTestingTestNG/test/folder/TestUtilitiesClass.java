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
<<<<<<< HEAD
=======
    
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
>>>>>>> 87d3476d0d9a979b0ea3f25e71f2b06769d74558
}
