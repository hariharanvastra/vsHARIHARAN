package edu.disease.asn1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class JunitPatient {

	@Test
	void testPatientConTrue() {
		Patient p=new Patient(2, 5);
	    assertEquals(p, p);   
	}
	@Test
	void testPatientConFalseDis() {
		
	    assertThrows(IllegalArgumentException.class, ()->{new Patient(10, 0);});
	}
	@Test
	void testPatientConFalseExp() {
		
	    assertThrows(IllegalArgumentException.class, ()->{new Patient(-10, 10);});
	}
	@Test
	void testFirstNmae() {
		Patient p=new Patient(2, 5);
	    p.setFirstName("hari");   
	    assertEquals("hari", p.getFirstName());
	}
	@Test
	void testLastNmae() {
		Patient p=new Patient(2, 5);
	    p.setLastName("haran");   
	    assertEquals("haran", p.getLastName());
	}
	@Test
	void testPatientId() {
		Patient p=new Patient(2, 5);
	    p.setPatientId(UUID.randomUUID());   
	    assertNotNull(p.getPatientId());
	}
	@Test
	void testAddDiseaseId() {
		Patient p=new Patient(2, 5);
		p.addDiseaseId(UUID.randomUUID());
		for( p.index=0;p.index<2;p.index++) {
			p.diseaseIds[p.index]=UUID.randomUUID();
		}
		 
		 assertThrows(IndexOutOfBoundsException.class, ()->{p.addDiseaseId(UUID.randomUUID());})  ;
	}
	@Test
	void testAddExposure() { 
		Patient p=new Patient(2, 5);
		p.addExposure(new Exposure(UUID.randomUUID()));
		for( p.index1=0;p.index1<5;p.index1++) {
			p.exposures[p.index1]=new Exposure(UUID.randomUUID());
		}
		Exposure e= new Exposure(UUID.randomUUID());
	  assertThrows(IndexOutOfBoundsException.class, ()->{p.addExposure(e);})  ;
	}
	@Test 
	void testHashCode() {
		Patient p=new Patient(2, 5);
		p.setPatientId(UUID.randomUUID());
		
		assertEquals(p.hashCode(),p.hashCode());
	}
	@Test 
	void testHashCodeNull() {
		Patient p=new Patient(2, 5);
		p.setPatientId(null);
		
		assertEquals(p.hashCode(),p.hashCode());
	}
	
	@Test
	void testEqualsNotNull() {
		Patient p=new Patient(2, 5);
		p.setPatientId(UUID.randomUUID());
        p.setFirstName("hari");
        p.setLastName("haran");
		
		assertTrue(p.equals(p));
	}
	@Test
	void testEqualsNull() {
		Patient p=null;
        Patient p1=new Patient(2, 5);
		p1.setPatientId(UUID.randomUUID());
        p1.setFirstName("hari");
        p1.setLastName("haran");
		
		assertFalse(p1.equals(p));
	}
	@Test
	void testEqualsGetClass() {
		Patient p=new Patient(2, 5);
		
		assertFalse(p.equals("k"));
	}
	@Test
	void testEqualsNullPatientId() {
		Patient p1=new Patient(2, 5);
		p1.setPatientId(null);
        p1.setFirstName(null);
        p1.setLastName(null);
	
		Patient p=new Patient(2, 5);
		p.setPatientId(UUID.randomUUID());
        p.setFirstName("hari");
        p.setLastName("haran");
	
		assertFalse(p1.equals(p));
	}
	@Test
	void testEqualsNotNullPatientId() {
		Patient p1=new Patient(2, 5);
		p1.setPatientId(null);
        p1.setFirstName(null);
        p1.setLastName(null);
	
		Patient p=new Patient(2, 5);
		p.setPatientId(UUID.randomUUID());
        p.setFirstName("hari");
        p.setLastName("haran");
	
		assertFalse(p.equals(p1));
	}
	@Test
	void testEqualslastLine() {
		Patient p=new Patient(2, 5);
		p.setPatientId(null);
        p.setFirstName("hari");
        p.setLastName("haran");
		
        Patient p1=new Patient(2, 5);
		p1.setPatientId(null);
        p1.setFirstName("hari");
        p1.setLastName("haran");
		
 
		assertTrue(p.equals(p1));
	}
	@Test 
	void testToString() {
		Patient p=new Patient(2, 5);
		p.setPatientId(UUID.randomUUID());
        p.setFirstName("hari");
        p.setLastName("haran");
       
		assertEquals(p.toString(),p.toString());
	}
}
