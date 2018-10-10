package com.devops.project.devopsProject;

import org.junit.*;



public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOne() {
		Assert.assertEquals( "Error", "ONE", numberWords.toWords(1) ) ;
	}	
	@Test
	public void numberTwo() {
			Assert.assertEquals( "Error", "TWO", numberWords.toWords(2 ) ) ;
	}
	@Test
	public void numberThree() {
		Assert.assertEquals( "Error", "THREE", numberWords.toWords(3) ) ;
	}
	@Test
	public void numberFour() {
			Assert.assertEquals( "Error", "FOUR", numberWords.toWords(4) ) ;
	}
	@Test
	public void numberFive() {
		Assert.assertEquals( "Error", "FIVE", numberWords.toWords(5) ) ;
	}
	@Test
	public void numberSix() {
		Assert.assertEquals( "Error", "SIX", numberWords.toWords(6) ) ;
	}
	@Test
	public void numberSeven() {
		Assert.assertEquals( "Error", "SEVEN", numberWords.toWords(7) ) ;
	}
	@Test
	public void numberEight() {
		Assert.assertEquals( "Error", "EIGHT", numberWords.toWords(8) ) ;
	}
	@Test
	public void numberNine() {
		Assert.assertEquals( "Error", "NINE", numberWords.toWords(9 ) ) ;
	}
	@Test
	public void numberTen() {
		Assert.assertEquals( "Error", "TEN", numberWords.toWords(10 ) ) ;
	}
	@Test
	public void numberEleven() {
		Assert.assertEquals( "Error", "ELEVEN", numberWords.toWords(11) ) ;
	}
	@Test
	public void numberTweleve() {
		Assert.assertEquals( "Error", "TWELVE", numberWords.toWords(12) ) ;
	}
	public void numberThirteen() {
		Assert.assertEquals( "Error", "THIRTEEN", numberWords.toWords(13) ) ;
	}
	@Test
	public void numberFourteen() {
		Assert.assertEquals( "Error", "FOURTEEN", numberWords.toWords(14) ) ;
	}
	@Test
	public void numberFifteen() {
		Assert.assertEquals( "Error", "FIFTEEN", numberWords.toWords(15) ) ;
	}
	@Test
	public void numberSixteen() {
		Assert.assertEquals( "Error", "SIXTEEN", numberWords.toWords(16) ) ;
		
	}
	@Test
	public void numberOneSeventeen() {
		Assert.assertEquals( "Error", "SEVENTEEN", numberWords.toWords(17 ) ) ;

	}
	@Test
	public void numberEighteen() {
		Assert.assertEquals( "Error", "EIGHTEEN", numberWords.toWords(18) ) ;

	}
	@Test
	public void numberNineteen() {
		Assert.assertEquals( "Error", "NINETEEN", numberWords.toWords(19) ) ;

	}
	@Test
	public void numberTwenty() {
		Assert.assertEquals( "Error", "TWENTY", numberWords.toWords(20) ) ;
				}
	@Test
	public void numberThirty() {
		Assert.assertEquals( "Error", "THIRTY", numberWords.toWords(30 ) ) ;
		
			
	
	}
	@Test
	public void numberFourty() {
		Assert.assertEquals( "Error", "FOURTY", numberWords.toWords(40 ) ) ;
		
	}
	@Test
	public void numberFifty() {
		Assert.assertEquals( "Error", "FIFTY", numberWords.toWords(50 ) ) ;
	}
	@Test
	public void numberSixty() {
		Assert.assertEquals( "Error", "SIXTY", numberWords.toWords(60 ) ) ;
	}
	@Test
	public void numberSeventy() {
		Assert.assertEquals( "Error", "SEVENTY", numberWords.toWords(70 ) ) ;
	}
	@Test
	public void numberEighty() {
		Assert.assertEquals( "Error", "EIGHTY", numberWords.toWords(80) ) ;
	}
	@Test
	public void numberNinety() {
		Assert.assertEquals( "Error", "NINETY", numberWords.toWords(90) ) ;
	}
	
		
			
	}
	
	
	
	
	
	
	

