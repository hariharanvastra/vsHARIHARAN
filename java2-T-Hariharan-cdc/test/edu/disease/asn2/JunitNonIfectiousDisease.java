package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitNonIfectiousDisease {

	@Test
	void testGetExamples() {
		NonInfectiousDisease Nifd=new NonInfectiousDisease();
		assertEquals(4, Nifd.getExamples().length);
		
	}

}
