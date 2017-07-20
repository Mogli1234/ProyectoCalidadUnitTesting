/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author MOGLI
 */
public class UtilitiesNGTest {
    Utilities util = new Utilities();
    Random numberRandom = new Random(100);
    public UtilitiesNGTest() {
    }

    
    /**
     * Test of divide method, of class Utilities.
     */

    @Parameters({"First_number","Second_number"})
    @Test
    public void testDivide(int First_number, int Second_number) {
      util.divide(First_number,Second_number);
    }

    /**
     * Test of xtractNumberForString method, of class Utilities.
     */
    @Test
    public void testXtractNumberForString() {
    }
    
}
