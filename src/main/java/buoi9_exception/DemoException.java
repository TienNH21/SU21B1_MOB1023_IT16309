/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi9_exception;

/**
 *
 * @author tiennh
 */
public class DemoException {
    public static void main(String[] args) {
        String[] arr = new String[] { "1", null, "2", "abc", "4" };
        FormatNumber format = new FormatNumber();
        for (int i = 0; i < 6; i++) {
            try {
                format.parse(arr[i]);
            } catch (NumberFormatException e) {
                // do something
            }
        }
    }
}
