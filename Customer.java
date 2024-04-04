class Customer extends Main{
    String name;
    int accountno;
    int pin;
    double balance;
    public Customer(){
        
    }
    
    public Customer(String name, int id, int pin,double balance){
        this.name=name;
        this.accountno=id;
        this.pin=pin;
        this.balance=balance;
    }

    void withdraw(double wamt){
        if(wamt>atmamt){
            System.out.println("ATM RUNS OUT OF MONEY COME BACK LATER, THANKYOU");
        }
        else if(wamt<=this.balance){
            this.balance-=wamt;
            atmamt-=wamt;
            System.out.println("withdrawn successfully");
        }
        else{
            System.out.println("Insufficient fund");
        }
    }

    void deposit(double damt){
        this.balance+=damt;
        atmamt+=damt;
        System.out.println("deposited successfully");
    }

    void checkbalance(){
        System.out.println(this.balance);
    }
    void changePin(int pin){
        this.pin=pin;
        System.out.println("Pin changed successfully");
    }
}
