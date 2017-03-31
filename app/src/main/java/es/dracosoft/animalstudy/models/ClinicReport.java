package es.dracosoft.animalstudy.models;

import java.sql.Date;

/**
 * Created by Dracosoft.es on 31/03/2017.
 *
 * @Author Jesús Román Fernández
 * @Version 0.1
 *
 * Makes support for veterinary reviews results
 */

public class ClinicReport {

    private int id;
    private Date dateReport;
    private String veterinaryName;
    private String diagnostic;
    private String symptoms;
    private String[] treatment;
    private String diagnosticTests;

    /**
     * Default constructor
     */
    public void ClinicReport(){
    }

    /**
     * Complete constructor of class
     *
     * @param id                (int) Unique report descriptor
     * @param dateReport        (java.sql.Date) Report date
     * @param veterinaryName    (String) Veterinary's name
     * @param diagnostic        (String) Conclusions
     * @param symptoms          (String) Symptoms and general state
     * @param treatment         (String[]) Treatment, if veterinary considers
     * @param diagnosticTests   (String) Any test order by veterinary
     */
    public ClinicReport(int id, Date dateReport, String veterinaryName, String diagnostic,
                        String symptoms, String[] treatment, String diagnosticTests) {
        this.id = id;
        this.dateReport = dateReport;
        this.veterinaryName = veterinaryName;
        this.diagnostic = diagnostic;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.diagnosticTests = diagnosticTests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateReport() {
        return dateReport;
    }

    public void setDateReport(Date dateReport) {
        this.dateReport = dateReport;
    }

    public String getVeterinaryName() {
        return veterinaryName;
    }

    public void setVeterinaryName(String veterinaryName) {
        this.veterinaryName = veterinaryName;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String[] getTreatment() {
        return treatment;
    }

    public void setTreatment(String[] treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(String diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }
}
