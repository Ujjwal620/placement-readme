package revision;
class Payment{
    float admFees , regFees, balAmt ;
    Payment(float admFees, float regFees, float balAmt){
        this.admFees=admFees;
        this.regFees=regFees;
        this.balAmt=balAmt;
    }
}
class Information{
    int floorNo, roomNo, BedNo ;
    String blockNo;
    Information(String blockNo, int floorNo, int roomNo, int BedNo){
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.BedNo= BedNo ;
    }
}

class Patient {

        String patientName ;
        int Age ;
        String DOA ;
        String disease ;
    public Patient(String DOA, int Age, String patientName, String disease) {
        this.DOA = DOA;
        this.Age = Age;
        this.patientName = patientName;
        this.disease = disease;
    }
    void PatientDetails(){
        System.out.println("details : ");
        System.out.println("name "+ this.patientName);
        System.out.println("age "+this.Age);
        System.out.println("doa "+ this.DOA);
        System.out.println("Block Number : ");
        System.out.println("Floor Number : ");
        System.out.println("Room Numer : ");
        System.out.println("Bed number : ");
        System.out.println("Admission fee : ");
        System.out.println("Registration Fee : ");
        System.out.println("Balance Amount : ");
    }


}
