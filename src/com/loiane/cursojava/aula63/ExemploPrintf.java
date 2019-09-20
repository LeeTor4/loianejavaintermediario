package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
          
          
          String format = String.format("R$ %,.2f", 0.3f);
          String format1 = String.format("R$ %,.02f", 152541f);
         
          String format2 = String.format("%s % 15d%015d% ,.02f", "AA", 15,5, 502.55f);
          
          System.out.println(format);
          System.out.println(format1);
          System.out.println(format2);
          

	}

}
