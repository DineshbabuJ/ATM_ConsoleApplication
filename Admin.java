class Admin extends Customer{
    int adminId;
    int pass;
    
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


}
