//Exp 19.2: Develop a Java program using an interface declared inside a class to determine whether a student is eligible for examination.
//Create a class College containing a public nested interface ExamEligibility with the method boolean isEligible().
//Create a separate class Student that implements College.ExamEligibility. 
//Store attendance percentage and fee-payment status, initialized through a parameterized constructor.
//A student is eligible only when attendance is at least 75% and fees are paid. 
//Accept the details from the user, validate attendance within 0–100, and display the eligibility status

import java.util.*;

class College {
    public interface ExamEligibility {
        boolean isEligible();
    }
}

class Student implements College.ExamEligibility {
    double att_Percentage;
    String fee_Status;

    public Student(double att_Percentage, String fee_Status) {
        this.att_Percentage = att_Percentage;
        this.fee_Status = fee_Status;
    }

    @Override
    public boolean isEligible() {
        return att_Percentage >= 75 && fee_Status.equalsIgnoreCase("yes");
    }
}



public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Student Details----");

        System.out.print("Enter Attendance Percentage:");
        double att_Percentage = sc.nextDouble();

        System.out.print("is Fees paid(yes/no):");
        String fee_Status = sc.next();

        if (att_Percentage < 0 || att_Percentage > 100) {
            System.out.println("Invalid attendance percentage!");
        } 

        if (fee_Status.equalsIgnoreCase("no")){
            System.out.println("Pay the Fees first.");
        }

        Student st = new Student(att_Percentage, fee_Status);
        if (st.isEligible()) {
                System.out.println("Student is eligible for examination.");
        } else {
                System.out.println("Student is not eligible for examination.");
        }
    }    
}
