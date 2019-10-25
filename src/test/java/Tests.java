import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }
	
	@Test
    public void testSetting() {
        Rational standard = new Rational(-4,9);
		assertEquals("Wrong setting Numerator", -4, standard.getNumerator());
		assertEquals("Wrong setting denominator", 9, standard.getDenominator());
    }

	@Test
    public void testReduce() {
        Rational standard = new Rational(-3,-9);
        assertEquals("Wrong reduce", "1/3", standard.toString());
    }
	
	@Test
    public void testTransferMinusFromDenominatorToNumerator() {
        Rational standard = new Rational(1,-2);
		assertEquals("Wrong transfer minus to Numerator", -1, standard.getNumerator());
		assertEquals("Wrong transfer minus from denominator", 2, standard.getDenominator());
    }
	
	@Test
    public void testThrowExceptionBySetDenominatorToZero() {
		boolean haveException = false;
		try {
			Rational rZ = new Rational(1,0);
		}catch(ArithmeticException e) {
			haveException = true;
		}finally {
			assertTrue("Wrong Exception division by zero ! when setting zero denominator",		haveException);
		}
    }
	
	@Test
	public void testTwoRationalSum() {
		Rational rOne = new Rational (1,2);
		Rational rTwo = new Rational (3,4);
		assertEquals("Wrong plus function", "5/4", rTwo.plus(rOne).toString());
	}
	
	@Test
	public void testTwoRationalDifference() {
		Rational rOne = new Rational (1,2);
		Rational rTwo = new Rational (3,4);
		assertEquals("Wrong minus function", "1/4", rTwo.minus(rOne).toString());
	}
	
	@Test
	public void testTwoRationalProduct() {
		Rational rOne = new Rational (1,2);
		Rational rTwo = new Rational (1,3);
		assertEquals("Wrong multiply function", "1/6", rTwo.multiply(rOne).toString());
	}

	@Test
	public void testTwoRationalQuotient() {
		Rational rOne = new Rational (5,7);
		Rational rTwo = new Rational (2,3);
		assertEquals("Wrong divide function", "14/15", rTwo.divide(rOne).toString());
	}

	@Test
	public void testTwoRationalThrowExceptionByDivisionZero() {
		Rational rOne = new Rational ();
		Rational rTwo = new Rational (1,2);
		boolean haveException = false;
		try {
			rTwo.divide(rOne);
		}catch(ArithmeticException e) {
			haveException = true;
		}finally {
			assertTrue("Wrong Exception division by zero ! by Division two Rational, one of them is have zero numerator",		haveException);
		}
	}
	
	@Test
	public void testEqualsTrue() {
		Rational rOne = new Rational (4,6);
		Rational rTwo = new Rational (2,3);
		assertTrue("Wrong False result in Equals function", rTwo.equals(rOne));
	}	
	
	@Test
	public void testEqualsFalse() {
		Rational rOne = new Rational (5,7);
		Rational rTwo = new Rational (2,3);
		assertFalse("Wrong True result in Equals function", rTwo.equals(rOne));
	}
	
	@Test
	public void testTrueLessNumeratorsEqualButDenominatorDifference() {
		Rational rOne = new Rational (1,2);
		Rational rTwo = new Rational (1,3);
		assertTrue("Wrong False result in less function, when numerators are same, but denominators are difference", rTwo.less(rOne));
	}
	
	@Test
	public void testFalseLessNumeratorsEqualButDenominatorDifference() {
		Rational rOne = new Rational (1,2);
		Rational rTwo = new Rational (1,3);
		assertFalse("Wrong True result in less function, when numerators are same, but denominators are difference", rOne.less(rTwo));
	}
	
	@Test
	public void testTrueLessDenominatorsEqualButNuminatorDifference() {
		Rational rOne = new Rational (2,3);
		Rational rTwo = new Rational (1,3);
		assertTrue("Wrong False result in less function, when numerators are difference, but denominators are same", rTwo.less(rOne));
	}
	
	@Test
	public void testFalseLessDenominatorsEqualButNuminatorDifference() {
		Rational rOne = new Rational (2,3);
		Rational rTwo = new Rational (1,3);
		assertFalse("Wrong True result in less function, when numerators are difference, but denominators are same", rOne.less(rTwo));
	}
	
	@Test
	public void testTrueLessWithDiffDenominatorsAndNuminators() {
		Rational rOne = new Rational (2,5);
		Rational rTwo = new Rational (1,3);
		assertTrue("Wrong False result in less function, when numerators are difference, and denominators are difference", rTwo.less(rOne));
	}
	
	@Test
	public void testFalseLessWithDiffDenominatorsAndNuminators() {
		Rational rOne = new Rational (2,5);
		Rational rTwo = new Rational (1,3);
		assertFalse("Wrong True result in less function, when numerators are difference, and denominators are difference", rOne.less(rTwo));
	}

	
}
