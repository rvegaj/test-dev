package app;

import operations.Operations;

/**
 * 
 */
/**
 * @author ronald-vega
 *
 */
public class  appdev {
	public static void main (String args[]) {
		Operations o = new Operations();
		o.suma();
		
		//
		int x = 3; int y = 10;
		 System.out.println(" Residuo:"+y % x);
		 o.switchCase();
		 o.errorVariable();
	}
}
