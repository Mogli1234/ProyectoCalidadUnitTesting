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
    
    
    
    //metodo para obtener el primer numero de una cadena de texto
    public String xtractNumberForString(String cadena){
        String result = "Dato Nulo";
        try {
           if(cadena.isEmpty()){
            result = "No hay numeros";
            }else{
                for (int i = 0; i < cadena.length(); i++){
                    char letra = cadena.charAt(i);
                    if (isNumeric(letra)){
                        result =letra + "";
                        break;
                    }else{
                        result = "No hay Numeros";
                    }           
                }
            }
            return result; 
        } catch (NullPointerException e) {
            return result;
        }     
    }
    // verifica si el valor del char es numerico        
    private boolean isNumeric(char cadena){
	try {
            Integer.parseInt(cadena+"");
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
    }    
}
