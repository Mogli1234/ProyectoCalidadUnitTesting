/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import Logic.Utilities;
import static org.testng.Assert.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author Josepablo
 */
public class TestNumericString {
       Utilities util = new Utilities();
    public TestNumericString() {
    }
 @Parameters({"cadena"})
    @Test
    public void TestXtractNumberForString(String cadena){
    util.xtractNumberForString(cadena);
    } 
    
}
