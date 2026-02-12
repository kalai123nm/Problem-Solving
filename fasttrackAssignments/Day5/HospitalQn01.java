import java.time.LocalDate;
public class HospitalQn01{
    public static void main(String argss[]){


        MedicalRecord upC=new InPatientRecord();
        upC.inputRecorddetails(13, null, "rocky", "nullness");
        upC.displayRecord();System.out.println();

        InPatientRecord downC=(InPatientRecord) upC;
        downC.inputRecorddetails(119, null, "domnic", "inpatient upcasting");
        downC.displayRecord();System.out.println();
        
        MedicalRecord upC1=new outPatientRecord();

        outPatientRecord downC1=(outPatientRecord) upC1;
        downC1.inputRecorddetails(0, null, "toreto", "outpatient downcating");
        downC1.displayRecord();System.out.println();
        



        // InPatientRecord inPatient=new InPatientRecord();
        // inPatient.inputRecorddetails(07, LocalDate.of(2025, 8, 02), "David", "Cramp");
        // double inTotal=inPatient.calculateTotalCharges(137, 3, 300.0);
        // System.out.println("------Inpatient Reords------");
        // inPatient.displayRecord();
        // System.out.println("Total inpatient cost: "+inTotal);
        // System.out.println();

        // outPatientRecord outPatient=new outPatientRecord();
        // outPatient.inputRecorddetails(17, LocalDate.of(2023,5,18), "Beckham", "headInjury");
        // outPatient.outPatientDetails("Neymar", 20000);
        // System.out.println("-------OutPatient Records--------");
        // outPatient.displayRecord();

    } 
}
class MedicalRecord{
    int recordID;
    LocalDate dov;
    String patientName,diagnosis;

    
    void inputRecorddetails(int recordID, LocalDate dov, String patientName, String diagnosis){
        this.recordID=recordID;
        this.dov=dov;
        this.patientName=patientName;
        this.diagnosis=diagnosis;
    }
    void displayRecord(){
        System.out.println("Record ID: "+recordID+"\nPatient Name: "+patientName+"\nDate of visited: "+dov+"\nCause of illness: "+diagnosis);
    }
}

class InPatientRecord extends MedicalRecord{
    int roomNo,numberOfDaysAdmitted;
    double roomCharges;

    double calculateTotalCharges(int roomNo, int numberOfDaysAdmitted, double roomCharges){
        this.roomNo=roomNo;
        this.numberOfDaysAdmitted=numberOfDaysAdmitted;
        this.roomCharges=roomCharges;
        return numberOfDaysAdmitted*roomCharges;
    }

    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("Patient Room Number: "+roomNo+"\nTotal number of days admitted: "+numberOfDaysAdmitted+"\nRoom charge per day: "+roomCharges);
    }
    
}

class outPatientRecord extends MedicalRecord{
    String doctorName;
    double consultationFees;

    void outPatientDetails(String doctorName, double consultationFees){
        this.doctorName=doctorName;
        this.consultationFees=consultationFees;
    }
    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor name: "+doctorName+"\nConsultation Fee: "+consultationFees);
    }

    
}