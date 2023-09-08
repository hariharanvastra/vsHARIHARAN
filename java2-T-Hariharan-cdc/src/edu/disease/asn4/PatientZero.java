package edu.disease.asn4;

import java.time.LocalDateTime;

import edu.disease.asn3.Patient;

/**
 * A class PatientZero represent following properties:
 * <li>
 * private Patient patient; 
 * private LocalDateTime exposureDateTime;
 * private boolean exposed;
 * <li>
 */
public class PatientZero {
	private Patient patient;
	private LocalDateTime exposureDateTime;
	private boolean exposed;

	/**
	 * provied setter method for Patient.
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * provied setter method for ExposureDateTime.
	 */
	public void setExposureDateTime(LocalDateTime exposureDateTime) {
		this.exposureDateTime = exposureDateTime;
	}

	/**
	 * provied setter method for Exposed.
	 */
	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}
	/**
	 * @return patient
	 * provied getter method for patient.
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @return exposureDateTime
	 * provied getter method for ExposureDateTime.
	 */
	public LocalDateTime getExposureDateTime() {
		return exposureDateTime;
	}

	/**
	 * @return exposed
	 * provied getter method for Exposed.
	 */
	public boolean isExposed() {
		return exposed;
	}



}
