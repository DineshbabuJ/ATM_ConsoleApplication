import java.util.*;



class Main{
    static List<Customer> cList= new ArrayList<>();
    static List<String> history=new ArrayList<>();
    static Admin a1=new Admin(9999,9999);
    static double atmamt=100000;
    static List<Admin> aList=new ArrayList<>();
    static Bank b1=new Bank();
    static List<String> bList=new ArrayList<>();
    
    
    
    static{
        
        Customer o1=new Customer("dinesh",1111,1111,10000,"SBI");
        Customer o2=new Customer("dharani",2222,1111,20000,"SBI");
        Customer o3=new Customer("aakash",3333,1111,30000,"SBI");
        Customer o4=new Customer("harish",4444,1111,40000,"SBI");
        Customer o5=new Customer("harshit",5555,1111,50000,"ICICI");
        Customer o6=new Customer("jeeva",6666,1111,60000,"HDFC");
        Customer o7=new Customer("gowtham",7777,1111,60000,"ICICI");
        Customer o8=new Customer("gokul",8888,1111,60000,"HDFC");
        cList.add(o1);
        cList.add(o2);
        cList.add(o3);
        cList.add(o4);
        cList.add(o5);
        cList.add(o6);
        cList.add(o7);
        cList.add(o8);
        aList.add(a1);
        bList.add("SBI");
        bList.add("ICICI");
        bList.add("HDFC");
        
        
        
    }
    
    
    public static void main(String[] args) {
        

    
        Scanner sc= new Scanner(System.in);
        

        do {
            System.out.println("_______WELCOME TO ATM________");
            System.out.println("1.new user ");
            System.out.println("2.existing user ");
            System.out.println("3.Admin ");
            System.out.println("4.BANK ");

                    
            int option=sc.nextInt();
            if(option==1){
                System.out.println("enter name");
                String name=sc.next();
                System.out.println("enter account number");
                int id=sc.nextInt();
                System.out.println("enter new pin");
                int pin=sc.nextInt();
                System.out.println("enter initial amount to be deposited");
                double balance=sc.nextDouble(); 
                System.out.println("enter Which bank user");
                String bank=sc.next(); 
                
                Customer ob1=new Customer(name,id,pin,balance,bank);
                

                cList.add(ob1);
            }
            else if(option==2){
                System.out.println("enter your account number");
                int accno=sc.nextInt();
                boolean flag=true;
                for(Customer i:cList){
                    if(i.accountno==accno){
                        
                        flag=false;
                        System.out.println("\nWELCOME "+i.name);
                        System.out.println("enter your 4 digit pin");
                        int enteredpin=sc.nextInt();
                        while(enteredpin!=i.pin){
                            System.out.println("Invalid pin Try again");
                            enteredpin=sc.nextInt();
                        }

                        System.out.println(" OPTIONS IN ATM");
                        System.out.println("1.Withdraw");
                        System.out.println("2.Deposit");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Change Pin");
                        int choice=sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter amount to withdraw");
                                double wamt=sc.nextDouble();
                                i.withdraw(wamt);
                                break;
                            case 2:
                                System.out.println("Enter amount be deposited");
                                double damt=sc.nextDouble();
                                i.deposit(damt);
                                break;
                            case 3:
                                i.checkbalance();
                                break;
                            case 4:
                                System.out.println("enter new Pin");
                                int newpin=sc.nextInt();
                                i.changePin(newpin);
                                break;
                        
                            
                        }
                    }
                }
                if(flag){
                    System.out.println("Invalid account number");
                }

                
                System.out.println("---------------------------------------");
            }
            else if(option==3){
                System.out.println("ENTER ADMIN PASS");
                int ap=sc.nextInt();
                if(ap!=a1.pass){
                    System.out.println("INValid password");
                    continue;
                }
                System.out.println("---------------------------------------");
                System.out.println("List of Options");
                System.out.println("1.Check ATM Balance");
                System.out.println("2.Add Atm balance");
                System.out.println("3.Check previous transactions");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        a1.checkAtmBalance();
                        break;
                
                    case 2:
                        System.out.println("ENter amount to refill");
                        int amt=sc.nextInt();
                        a1.putMoney(amt);
                        break;
                    
                    case 3:
                        a1.last5transactions();
                        break;
                }
            }
            else if(option==4){
                System.out.println("Options for Bank:");
                
                
                System.out.println("1.no of users in each Bank");
                int choice=sc.nextInt();
                if(choice==1){
                    b1.customersInEachBank();
                }

            }
                
        } while (true);
        

    }
}