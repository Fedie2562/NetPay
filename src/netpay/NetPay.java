/*
 * Ferris D.
 * NetPay.java
 * This program will calculate the net pay for
 * and employee that works 40 hours at 5 per hour and has 2
 * deducted for insurance and must pay 22% for tax.
 */

package netpay;

/**
 * @author fedie2562
 */
public class NetPay {
    public static void main(String[] args) {
        double n = 0;
        double h = 40;
        double w = 5;
        double i = 2;
        double t = 0.22;
        n = (h*w-i)-t*(h*w-i);
        System.out.println("The net pay will be $" + n);
    }
    
}
