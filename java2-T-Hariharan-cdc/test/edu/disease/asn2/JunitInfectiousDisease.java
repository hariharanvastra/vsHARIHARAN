package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitInfectiousDisease {

	@Test
	void testGetExamples() {
		InfectiousDisease ifd=new InfectiousDisease();
		assertEquals(4, ifd.getExamples().length);
		
	}

}