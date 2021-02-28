/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Khaya
 */
public class CMYK {
    
    public static void main(String[] args){
	final short value = 255;
	
		double c = Double.parseDouble("0.0");
		double m = Double.parseDouble("1.0");
		double y = Double.parseDouble("0.0");
		double k = Double.parseDouble("0.0");
		
		double white = 1 - k;
		int red = (int)Math.round( value * white *(1 - c));
		int green =(int)Math.round(value * white *(1 - m));
		int blue = (int)Math.round(value * white *( 1 - y));
		
		System.out.println("red "+red +"\ngreen "+green+ "\nblue "+blue);

    }
}