package edu.disease.asn2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Patient;

class JunitDiseaseControlManagerImpl {

	@Test
	void testDiseaseControlManagerImplConTrue() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 5);
		assertEquals(dcmi, dcmi);
	}

	@Test
	void testDiseaseControlManagerImplConFalseDis() {

		assertThrows(IllegalArgumentException.class, () -> {
			new DiseaseControlManagerImpl(-1, 10);
		});
	}

	@Test
	void testDiseaseControlManagerImplConFalsePat() {

		assertThrows(IllegalArgumentException.class, () -> {
			new DiseaseControlManagerImpl(10, -10);
		});
	}

	@Test
	void testAddDiseaseTrue() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 5);

		assertEquals(new InfectiousDisease(), dcmi.addDisease("priya", true));
		assertEquals(new NonInfectiousDisease(), dcmi.addDisease("priya", false));

	}

	@Test
	void testAddDiseaseFalse() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 5);
		dcmi.index = 3;
		assertThrows(IllegalStateException.class, () -> {
			dcmi.addDisease("hi", false);
		});
	}

//	@Test
//	void testGetDisease() {
//		
//		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 5);
//
//		assertEquals(new InfectiousDisease(), dcmi.addDisease("priya", true));
//		assertEquals(new NonInfectiousDisease(), dcmi.addDisease("priya", false));
//
//	}
	@Test
	void testGetDisease() {
		DiseaseControlManagerImpl dcmi = new DiseaseControlManagerImpl(2, 5);

		Disease disease = dcmi.addDisease("Cold", true);
		UUID uuid = UUID.randomUUID();
		disease.setDiseaseId(uuid);
		UUID diseaseId = disease.getDiseaseId();
		Disease retrievedDisease = dcmi.getDisease(diseaseId);
		assertNotNull(retrievedDisease);
		assertEquals(diseaseId, retrievedDisease.getDiseaseId());
	}
}
