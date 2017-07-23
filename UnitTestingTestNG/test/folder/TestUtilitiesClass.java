package folder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Logic.Utilities;
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
    util.divide(Number1, Number2);
    }
    
@Parameters({"cadena"})
    @Test
    public void TestXtractNumberForString(String cadena){
    util.xtractNumberForString(cadena);
    }    
}
