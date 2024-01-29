import java.util.HashMap;
import java.util.Map;

public class AtmoperationImpl implements Atmoperationinterface{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>(); 
    @Override
    public void ViewBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());    
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
       if (withdrawAmount<=atm.getBalance()) {
            ministmt.put(withdrawAmount," Amount Withdraw");
            System.out.println("Collect the cash "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            ViewBalance();
       }
       else{
        System.out.println("Insufficient Balance !!!");
       }
        }
       

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Deposit Amount");
        System.out.println(depositAmount+" Deposited successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        ViewBalance();
    }

    @Override
    public void ViewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getKey());
        }
        }  
}
