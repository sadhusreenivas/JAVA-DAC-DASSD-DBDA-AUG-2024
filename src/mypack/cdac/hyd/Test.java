package mypack.cdac.hyd;

import mypack.dassd.*;
import mypack.dac.DAC;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DASSD dassd = new DASSD(18);
		System.out.println(dassd);
		
		DAC dac = new DAC(84);
		System.out.println(dac);
		
		mypack.dbda.DBDA dbda = new mypack.dbda.DBDA(40);
		
		System.out.println(dbda);
		
		
		

	}

}
