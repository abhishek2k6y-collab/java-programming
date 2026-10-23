class Insurance {
    int policyNo;
    String policyHolderName;
    int age;
    int insuredValue;

    Insurance(String policyHolderName, int policyNo, int age, int insuredValue) {
        this.policyHolderName = policyHolderName;
        this.policyNo = policyNo;
        this.age = age;
        this.insuredValue = insuredValue;
    }
}

class Policy extends Insurance {
    float premium;

    Policy(String policyHolderName, int policyNo, int age, int insuredValue) {
        super(policyHolderName, policyNo, age, insuredValue);

        if (age <= 50) {
            premium = (5 / 100.0f) * insuredValue + insuredValue;
        } else {
            premium = (6 / 100.0f) * insuredValue + insuredValue;
        }
    }

    void display() {
        System.out.println("Policy No: " + policyNo);
        System.out.println("Account Name: " + policyHolderName);
        System.out.println("Age: " + age);
        System.out.println("Insured Value: " + insuredValue);
        System.out.println("Premium: " + premium);
    }
}

public class InsurancePremium {
    public static void main(String args[]) {

            Policy policyObj = new Policy("Abhishek",25261799, 20,100000);
            policyObj.display();
        }
    }
