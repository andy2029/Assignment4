import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHouseClass {

	@Test
	void testAddHouse_testCase1() {
		//Test Case 1: Check the function with valid inputs
		//Test Case 1_Test Data 1
		House housetestCase1Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 499999.99, 3, 2, 1, 66.66, "three bed, two bath, one garage");
		//assertEquals(true, housetestCase1Data1.AddHouse());
		//Test Case 1_Test Data 2
		House housetestCase1Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 777777.99, 4, 3, 2, 77.77, "four bed, three bath, two garage");
		//assertEquals(true, housetestCase1Data2.AddHouse());
		//Test Case 1_Test Data 3
		House housetestCase1Data3 = new House("GHI7891234", "9123 Other Drive", "Villa", 333333.33, 2, 1, 2, 22.22, "two bed, one bath, two garage");
		//assertEquals(true, housetestCase1Data3.AddHouse());
		
		assertAll ("", ()->assertEquals(true, housetestCase1Data1.AddHouse()),
				()->assertEquals (true, housetestCase1Data2.AddHouse()),
						()->assertEquals (true, housetestCase1Data3.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase2() {
		//Test Case 2: Check the function with invalid ID
		//Test Case 2_Test Data 1
		House housetestCase2Data1 = new House("abc1234567", "1234 Main Street", "Apartment", 499999.99, 3, 2, 1, 66.66, "three bed, two bath, one garage");
		//assertEquals(false, housetestCase2Data1.AddHouse());
		//Test Case 2_Test Data 2
		House housetestCase2Data2 = new House("ABC123456", "1234 Main Street", "Apartment", 499999.99, 3, 2, 1, 66.66, "three bed, two bath, one garage");
		//assertEquals(false, housetestCase2Data2.AddHouse());
		//Test Case 2_Test Data 3
		House housetestCase2Data3 = new House("1234567ABC", "1234 Main Street", "Apartment", 499999.99, 3, 2, 1, 66.66, "three bed, two bath, one garage");
		//assertEquals(false, housetestCase2Data3.AddHouse());
		
		assertAll ("", ()->assertEquals(false, housetestCase2Data1.AddHouse()),
				()->assertEquals (false, housetestCase2Data2.AddHouse()),
						()->assertEquals (false, housetestCase2Data3.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase3() {
		//Test Case 3: Check the function with invalid description
		//Test Case 3_Test Data 1
		House housetestCase3Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 499999.99, 3, 2, 1, 66.66, "three bed");
		//assertEquals(false, housetestCase3Data1.AddHouse());
		//Test Case 3_Test Data 2
		House housetestCase3Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 599999.99, 4, 3, 1, 77.77, "four bed, three bath, two garage AB AC AD AE AF");
		//assertEquals(false, housetestCase3Data2.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase3Data1.AddHouse()),
				()->assertEquals (false, housetestCase3Data2.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase4() {
		//Test Case 4: Check the function with invalid bedrooms and invalid bathrooms
		//Test Case 4_Test Data 1
		House housetestCase4Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 499999.99, 5, 2, 1, 66.66, "three bed, two bath, one garage");
		//assertEquals(false, housetestCase4Data1.AddHouse());
		//Test Case 4_Test Data 2
		House housetestCase4Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 599999.99, 6, 1, 1, 77.77, "four bed, three bath, two garage");
		//assertEquals(false, housetestCase4Data2.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase4Data1.AddHouse()),
				()->assertEquals (false, housetestCase4Data2.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase5() {
		//Test Case 5: Check the function with invalid size and invalid price
		//Test Case 5_Test Data 1
		House housetestCase5Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 555555.55, 3, 2, 1, 22.22, "three bed, three bath, two garage");
		//assertEquals(false, housetestCase5Data1.AddHouse());
		//Test Case 5_Test Data 2
		House housetestCase5Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 666666.66, 4, 3, 1, 44.44, "four bed, three bath, two garage");
		//assertEquals(false, housetestCase5Data2.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase5Data1.AddHouse()),
				()->assertEquals (false, housetestCase5Data2.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase6() {
		//Test Case 6: Check the function with invalid type and invalid carspace
		//Test Case 6_Test Data 1
		House housetestCase6Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 499999.99, 3, 2, 0, 66.66, "three bed, three bath, two garage");
		//assertEquals(false, housetestCase6Data1.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase6Data1.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase7() {
		//Test Case 7: Check the function with invalid price
		//Test Case 7_Test Data 1
		House housetestCase7Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 99.99, 3, 2, 1, 66.66, "three bed, three bath, two garage");
		//assertEquals(false, housetestCase7Data1.AddHouse());
		//Test Case 7_Test Data 2
		House housetestCase7Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 2222222.22, 4, 3, 1, 77.77, "four bed, three bath, two garage");
		//assertEquals(false, housetestCase7Data2.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase7Data1.AddHouse()),
				()->assertEquals (false, housetestCase7Data2.AddHouse()));
	}
	
	@Test
	void testAddHouse_testCase8() {
		//Test Case 8: Check the function with invalid berdrooms and invalid bathrooms and invalid price
		//Test Case 8_Test Data 1
		House housetestCase8Data1 = new House("ABC1234567", "1234 Main Street", "Apartment", 888888.88, 2, 1, 1, 66.66, "three bed, three bath, two garage");
		//assertEquals(false, housetestCase8Data1.AddHouse());
		//Test Case 8_Test Data 2
		House housetestCase8Data2 = new House("DEF8923456", "5678 Side Avenue", "House", 999999.99, 1, 1, 1, 77.77, "four bed, three bath, two garage");
		//assertEquals(false, housetestCase8Data2.AddHouse());
		
		assertAll ("", ()->assertEquals(false,housetestCase8Data1.AddHouse()),
				()->assertEquals (false, housetestCase8Data2.AddHouse()));
	}

}
