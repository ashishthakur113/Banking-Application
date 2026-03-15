public class BankOperatingImpl implements  bankoperatingInter{

    BANK b1 = new BANK();

    @Override
    public void viewBalance() {
        System.out.println("Current Balance  : "+b1.getBalance());
    }

    @Override
    public void withDraw(double withDraw) {
        if(withDraw > b1.getBalance()){
            System.out.println("Invalid Choice");
        } else{
            System.out.println("Collect Cash : "+withDraw);
             b1.setBalance(b1.getBalance() - withDraw);
             viewBalance();
        }
    }

    @Override
    public void depositCash(double depositCash) {
        if(depositCash > 10_00_000){
            System.out.println("You can only deposit cash Up to 10 Lakhs ");
        } else if (depositCash <0) {
            System.out.println("Invalid Amount , Amount should be Positive ");
        }else{
            b1.setBalance(b1.getBalance() + depositCash);
            viewBalance();
        }
    }
}
