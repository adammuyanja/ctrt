public class Patient {
    private String patientID;
    private String allergyNotes;

    // Constructor with parameter names same as field names
    public Patient(String patientID, String allergyNotes) {
        this.patientID = patientID;         // ‘this’ refers to the current object
        this.allergyNotes = allergyNotes;
    }
}
