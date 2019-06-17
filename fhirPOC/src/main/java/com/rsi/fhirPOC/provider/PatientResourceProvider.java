package com.rsi.fhirPOC.provider;

import java.util.concurrent.ConcurrentHashMap;

import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.OperationOutcome;
import org.hl7.fhir.dstu3.model.Patient;
import org.springframework.stereotype.Component;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jaxrs.server.AbstractJaxRsResourceProvider;
import ca.uhn.fhir.rest.annotation.Create;
import ca.uhn.fhir.rest.annotation.Delete;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.ResourceParam;
import ca.uhn.fhir.rest.annotation.Update;
import ca.uhn.fhir.rest.api.MethodOutcome;


/**
 * The Class PatientResourceProvider.
 */
@Component
public class PatientResourceProvider extends AbstractJaxRsResourceProvider<Patient> {

	/** The counter. */
	private static Long counter = 1L;

	/** The Constant patients. */
	private static final ConcurrentHashMap<String, Patient> patients = new ConcurrentHashMap<>();

	static {
		patients.put("123", createPatient("Van Houte"));

	}

	/**
	 * Instantiates a new patient resource provider.
	 *
	 * @param fhirContext the fhir context
	 */
	public PatientResourceProvider(FhirContext fhirContext) {
		super(fhirContext);
	}

	/**
	 * Find.
	 *
	 * @param theId the the id
	 * @return the patient
	 */
	@Read
	public Patient find(@IdParam final IdType theId) {
        // Find the data from DB and return
		return patients.get("123");

	}

	/**
	 * Creates the patient.
	 *
	 * @param patient the patient
	 * @return the method outcome
	 * @throws Exception the exception
	 */
	@Create
	public MethodOutcome createPatient(@ResourceParam Patient patient) throws Exception {
		//Save the data in DB
		patient.setId(createId(counter, 1L));
		patients.put(String.valueOf(counter), patient);
		MethodOutcome methodOutcome = new MethodOutcome();
		methodOutcome.setId(new IdType("Patient", "3746", "1"));
		methodOutcome.setResource(patient);
		OperationOutcome outcome = new OperationOutcome();

		methodOutcome.setOperationOutcome(outcome);
		return methodOutcome;
	}

	/**
	 * Update.
	 *
	 * @param theId the the id
	 * @param patient the patient
	 * @return the method outcome
	 */
	@Update
	public MethodOutcome update(@IdParam IdType theId, @ResourceParam Patient patient) {
		//Update the data in DB
		patient.setId(createId(counter, 1L));
		patients.put(String.valueOf(counter), patient);
		MethodOutcome methodOutcome = new MethodOutcome();
		methodOutcome.setId(new IdType("Patient", "3746", "1"));
		methodOutcome.setResource(patient);
		OperationOutcome outcome = new OperationOutcome();

		methodOutcome.setOperationOutcome(outcome);
		return methodOutcome;
	}

	/**
	 * Delete patient.
	 *
	 * @param theId the the id
	 */
	@Delete()
	public void deletePatient(@IdParam IdType theId) {

		// Write Delete Logic
		return;
	}

	/**
	 * Gets the resource type.
	 *
	 * @return the resource type
	 */
	@Override
	public Class<Patient> getResourceType() {
		return Patient.class;
	}

	/**
	 * Creates the id.
	 *
	 * @param id the id
	 * @param theVersionId the the version id
	 * @return the id type
	 */
	private static IdType createId(final Long id, final Long theVersionId) {
		return new IdType("Patient", "" + id, "" + theVersionId);
	}

	/**
	 * Creates the patient.
	 *
	 * @param name the name
	 * @return the patient
	 */
	private static Patient createPatient(final String name) {
		final Patient patient = new Patient();
		patient.getName().add(new HumanName().setFamily(name));
		patient.setId(createId(counter, 1L));
		counter++;
		return patient;
	}

}
