import java.util.*;

public class Bank extends Admin{

    void customersInEachBank(){
        for(String b:bList){
            int count=0;
            for(Customer i:cList){
                if(i.bank.equals(b)) count++;
            }
            System.out.println("NO of CUSTOMERS IN "+b+" : "+count);
        }
    }
}
