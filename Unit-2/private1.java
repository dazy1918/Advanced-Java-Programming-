//Private Method

interface inter1{

    private void checkbalance(){   
        System.out.println("Checking Balance");
    }

    default void deposit(){
        System.out.println("Money Deposit");
        checkbalance();   
    }
}

public class private1 implements inter1{
    public static void main(String[] args){
        private1 p = new private1();
        p.deposit();
    }
}
