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
    @DataProvider(name = "Divider")
     public static Object[] createData() {
    return new Object[]{
       int i =2;
    };
  }
    
    @Test(dataProvider = "Divider")
    public void TestDivider(int Number1, int Number2){
    util.divide(Number1, Number2);
    }
      
}
