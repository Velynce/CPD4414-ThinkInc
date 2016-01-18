/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.thinkinc;

/**
 *
 * @author ventr_000
 */
public class CPD4414Assignment1ThinkInc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String stringPower(String str, int integer){
        StringBuilder returnString = new StringBuilder();
        if(integer < 1) {
            //If integer is 0 or less, return null
            return null;
        } else {
            //If integer is 1 or more, append str to returnString times the value of integer
            for (int i=0; i < integer; i++) {
                returnString.append(str);
            }
        }
       //Convert returnString to a string and return.
      return returnString.toString();
    }
}
