package operations;

public class Operations {
	
	public void suma () {
		int x, a = 6, b = 7;
		x = a++ + b ++;
		System.out.print("X:"+x+ " A:"+a+" B:"+ b);		
	}
	public void switchCase() {
		int j = 2;
		 switch ( j ){
		 case 2:

		System.out.println (" el valor es dos ");
		 case 2 + 1:

		System.out.println (" El valor es tres ");
		 break;
		 
		 default:

		System.out.println (" el valor es "+ j);
		 break;
		 }
	}
	
	public void errorVariable () {
		String c = "c";
		 try{
		 int a = Integer.parseInt(c);
		 System.out.println("EL VALOR DE LA VARIABLE ES "+c);
		 }catch(NumberFormatException
		e){

		System.out.println("ERROR");
		 }
	}

}
