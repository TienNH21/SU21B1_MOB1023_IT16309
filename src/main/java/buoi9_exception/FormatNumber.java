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
public class FormatNumber {
    public int parse(String input) throws NumberFormatException
    {
        try {
            int kq = Integer.parseInt(input);

            System.out.println("Kết quả: " + kq);
            return kq;
        } catch(NumberFormatException exception) {
            exception.printStackTrace();
            
            throw exception;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("-----------------------------");
        }
        
        return 0;
    }
}
