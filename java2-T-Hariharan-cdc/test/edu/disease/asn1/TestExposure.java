package edu.disease.asn1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestExposure {
	
	@Test
	void testExposures() {
		UUID uuid=UUID.randomUUID();
		Exposure e= new Exposure(uuid);
		LocalDateTime l=LocalDateTime.now();
		e.setDateTime(l);
		e.setExposureType("D"); 
		assertEquals(l,e.getDateTime());
		assertEquals("D",e.getExposureType());
		e.setExposureType("I");
		assertEquals("I",e.getExposureType());
		assertEquals(uuid,e.getPatientId());
	}
	@Test
	void testSetExposureType() {
		Exposure e= new Exposure(UUID.randomUUID());
		assertThrows(IllegalArgumentException.class , ()->e.setExposureType("g"));
	}
   
	@Test
	void testHashcode() {  
     	UUID patientId = UUID.randomUUID();
        Exposure exposure1 = new Exposure(patientId);
        exposure1.setDateTime(LocalDateTime.now());
        Exposure exposure2 = new Exposure(patientId);
        exposure2.setDateTime(LocalDateTime.now());
        
        assertEquals(exposure1.hashCode(), exposure2.hashCode());
	}
	@Test
	void testHashcodeIfNull() {  
     	
        Exposure exposure1 = new Exposure(null);
      
        Exposure exposure2 = new Exposure(null);
        
        
        assertEquals(exposure1.hashCode(), exposure2.hashCode());
	}
	 
	@Test
	void testEqualMethod() {
		UUID uuid=UUID.randomUUID();
		Exposure e3= new Exposure(uuid);
		e3.setDateTime(LocalDateTime.now());
		 e3.setExposureType("D");

		Exposure e4= new Exposure(null);
		Exposure e5= new Exposure(uuid);
		e5.setDateTime(LocalDateTime.now());
		 e5.setExposureType("D");
		assertFalse(e4.equals(null)); 
		assertFalse(e3.equals("k"));
		assertTrue(e3.equals(e3));	
		assertTrue(e3.equals(e5));

	}
	@Test
		 public void testEqualsNullDateTime() {
		Exposure exposure1 = new Exposure(UUID.randomUUID());
		exposure1.setDateTime(null);
		Exposure exposure2 = new Exposure(UUID.randomUUID());
		exposure2.setDateTime(LocalDateTime.now());
		 assertFalse(exposure1.equals(exposure2));
	}
	@Test
	void testEqualsDateTime() {
		Exposure exposure1 = new Exposure(UUID.randomUUID());
		exposure1.setDateTime(LocalDateTime.now());
 
        Exposure exposure2 = new Exposure(UUID.randomUUID());

        assertFalse(exposure1.equals(exposure2));
	}
	@Test
	void testEqualsPatientId() {
		Exposure exposure1 = new Exposure(null);
		
		Exposure exposure2 = new Exposure(UUID.randomUUID());
		 
		 assertFalse(exposure1.equals(exposure2));  
	}
	@Test
	void testEqualsOtherPatientId() {
		 Exposure exposure3 = new Exposure(UUID.randomUUID());
	        Exposure exposure4 = new Exposure(null);
	        assertFalse(exposure3.equals(exposure4));
	}
	@Test
	void testToString() {
		 Exposure exposure3 = new Exposure(UUID.randomUUID());
		 exposure3.setDateTime(LocalDateTime.now());
		 exposure3.setExposureType("D");
		 assertTrue(exposure3.toString().equals(exposure3.toString()));
	}
}
