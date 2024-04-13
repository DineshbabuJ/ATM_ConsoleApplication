

class Admin extends Customer{
    int adminId;
    int pass;
    public Admin(){

    }
    public Admin(int id,int pass){
        this.adminId=id;
        this.pass=pass;
    }
    void putMoney(int amt){
        atmamt+=amt;
        System.out.println("UPLOADED SUCCESSFULLY");
    }
    void checkAtmBalance(){
        System.out.println("ATM balance:"+atmamt);
    }

    void last5transactions(){
        
        System.out.println(history.size());
        for(int i=history.size()-1;i>=0;i--){
            System.out.println(history.get(i));
        }
    }


}
