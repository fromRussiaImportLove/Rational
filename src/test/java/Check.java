import java.io.*;

public class Check {

   public static void main(String args[]){
      /* Создание двух объектов с помощью конструктора. */
      Rational rOne = new Rational(2,3);
      Rational rTwo = new Rational(5,7);
	  Rational rThree = new Rational(5,8);
	  Rational rFour = new Rational(6,7);
	  Rational rOneOne = new Rational(2,3);
	  //rTwo.setDenominator(0);
	  boolean haveException = false;
	  try {
		Rational rZ = new Rational(2,2);
	  }catch(ArithmeticException e) {
	  	System.out.println("error:"+ e);
		haveException = true;
	  }finally{
		System.out.println("error:"+ haveException);
	  }
	  Rational rSum = rOne.plus(rTwo);
	  Rational rMin = rOne.minus(rTwo);
	  //Rational rZZ = rOne.divide(rZ);
	  Rational rMul = rOne.multiply(rTwo);
	  Rational rDiv = rOne.divide(rTwo);

      System.out.println("rOne:" + rOne);
	  System.out.println("rTwo:" + rTwo);
	  System.out.println("sum:" + rOne.plus(rTwo));
	  System.out.println("min:" + rMin);
	  System.out.println("mul:" + rMul);
	  System.out.println("div:" + rDiv);
	  System.out.println("eq_rOne_rTwo:" + rOne.equals(rTwo));
	  System.out.println("eq_rOne_rOneOne:" + rOne.equals(rOneOne));
	  System.out.println("rOne less or eq rTwo:" + rOne.lessOrEqual(rTwo));
	  System.out.println("rTwo less rOne:" + rTwo.less(rOne));
	  System.out.println("rTwo less rThree:" + rTwo.less(rThree));
	  System.out.println("rTwo less rFour:" + rTwo.less(rFour));
	  System.out.println("eq_rOne_string:" + rOne.equals("2/3"));
	  System.out.println("eq_rOne_float:" + rOne.equals(2/3));
	  
	  
   }
   
   
}
	
	/*
	@Test
    public void testThrowExceptionBySetDenominatorToZero() {
        Rational standard = new Rational();
        standard.setNumerator(5);
		standard.setDenominator(0);
		assertEquals("Wrong Exception division by zero !", 1, standard.getDenominator());
    }
}

*/