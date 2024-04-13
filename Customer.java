

class Customer extends Main{
    String name;
    int accountno;
    int pin;
    String bank;
    double balance;
    public Customer(){
        
    }
    
    
    public Customer(String name, int id, int pin,double balance,String bank){
        this.name=name;
        this.accountno=id;
        this.pin=pin;
        this.balance=balance;
        this.bank=bank;
    }

    void withdraw(double wamt){
        if(wamt>atmamt){
            System.out.println("ATM RUNS OUT OF MONEY COME BACK LATER, THANKYOU");
        }
        else if(wamt<=this.balance){
            this.balance-=wamt;
            atmamt-=wamt;
            System.out.println("withdrawn successfully");
            this.history.add(this.name+" withdraws Rs"+wamt);
            
        }
        else{
            System.out.println("Insufficient fund");
        }
    }

    void deposit(double damt){
        this.balance+=damt;
        atmamt+=damt;
        System.out.println("deposited successfully");
        this.history.add(this.name+" deposited Rs"+damt);
    }

    void checkbalance(){
        System.out.println(this.balance);
    }
    void changePin(int pin){
        this.pin=pin;
        System.out.println("Pin changed successfully");
    }
}
