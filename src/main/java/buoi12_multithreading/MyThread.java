/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12_multithreading;

/**
 *
 * @author tiennh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            if (i == 500) {
                System.out.println("Kết thúc");
            }
        }
    }
}
