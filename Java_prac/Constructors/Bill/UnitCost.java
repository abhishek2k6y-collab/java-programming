package Bill;

public class UnitCost {
       String Customer_Name;
       int Customer_ID;
       int Units;
       Double Total_Bill;

       UnitCost(String Customer_Name, int Customer_ID, int Units){
       this.Customer_Name=Customer_Name;
       this.Customer_ID=Customer_ID;
       this.Units=Units; 
       Double cost;
       if(Units<=100){
              cost=Units*3d;
              Total_Bill= cost + cost*(18.0/100);
       }
       else if(Units>100 && Units<=300){
              cost=100*3 + (Units-100)*5d;
              Total_Bill= cost + cost*(18.0/100);
       }else{
              cost=100*3 + 200*5 + (Units-300)*8d;
              Total_Bill= cost + cost*(18.0/100);
       }

    }
}
     