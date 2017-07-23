/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author MOGLI
 */
public class Utilities {
    
    //this is mine
    public int divide(int num1, int num2){
        int result = num1/num2;
            return result;
    }
    
    
    
    //This is you function pablo 
    public int xtractNumberForString(String cadena){
        int result = 0;
        for (int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == '1' || 
                letra == '2' ||
                letra == '3' ||
                letra == '4' ||
                letra == '5' ||
                letra == '6' ||
                letra == '7' ||
                letra == '8' ||
                letra == '9' ||
                letra == '0'){
            result = Integer.parseInt(""+ letra);   
            break;
            }
        }
        System.out.println(result);
        return result;
    }
}
