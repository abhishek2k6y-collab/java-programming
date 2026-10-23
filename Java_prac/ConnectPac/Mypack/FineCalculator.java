//A library imposes a fine of ₹2 per day for the first five delayed days,
// ₹5 per day for the next five days, and ₹10 per day thereafter. 
// Create a package *library.fine* containing a *FineCalculator* class. 
// Import it into a library application and calculate the fine.

package Java_prac.ConnectPac.Mypack;

public class FineCalculator {
    public void Fine(int Day) {
        int Total_Fine;

        if (Day <= 5) {
            Total_Fine = 2 * Day;
        } 
        else if (Day <= 10) {
            Total_Fine = 10 + 5 * (Day - 5);
        } 
        else {
            Total_Fine = 35 + 10 * (Day - 10);
        }

        System.out.println("Total Fine: " + Total_Fine);
    }

}
