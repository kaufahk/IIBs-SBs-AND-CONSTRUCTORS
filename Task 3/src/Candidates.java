public class Candidates {
    String RegistrationStatus;
    String ExamCentre;
    String CandidateName;
    static String GradingPolicies;
    static int ExamYear;
    static int RegistrationFees;
    {
        System.out.println("\n INSTANCE INITIALIZATION BLOCK ");
        RegistrationStatus = "Active";
        ExamCentre = "25/UG/1608/BSCS-S";
    }
    static {
        System.out.println("\n STATIC BLOCK ");
        ExamYear = 2024;
        RegistrationFees = 2000;
        GradingPolicies = "A=85-100, B= 75-84, C= 65-74";
    }
    public Candidates(String C) {
        CandidateName = C;
    }
    public void display() {
    }
}
