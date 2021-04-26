package threads.zad4Thr;

import lombok.AllArgsConstructor;

import java.util.Random;
@AllArgsConstructor
public class AccountOperations {

    private Account account;

    public double getAmmount(){
        return account.getAmount();
    }
    public void cashIn(double amount){
        account.setAmount(account.getAmount() + amount);
        System.out.println("Zasilono konto! Twoje saldo:  "+ getAmmount());
    }
    //pozwala na wykonywanie metody w calosci tylko dla jednego wątku
    //powoduje tworzeni esekcji krytycznej
    public synchronized void cashOut(double amount){
        if(amount <= account.getAmount() ){
            account.setAmount(account.getAmount() - amount);
            System.out.println("wykonano przelew wychodzący. Twoje saldo:  "+ getAmmount());
        } else{
            System.out.println("Nie możesz wypłacić kwoty:  "+ amount + "Brak środków. Twoje saldo:"  + getAmmount());
        }

    }

    public static void main(String[] args) {
        Account account = new Account(1000);
        AccountOperations acc = new AccountOperations(account);
        Thread cashIn = new Thread(() -> {
            Random random = new Random();
            for(int i = 0 ;i < 12;i++){
                acc.cashIn(random.nextInt(1000));
                try{
                    Thread.sleep(500);
                }catch (InterruptedException s){
                    s.printStackTrace();
                }
            }
        }
        ); Thread cashOut = new Thread(() -> {
            Random random = new Random();
            for(int i = 0 ;i < 10;i++){
                acc.cashOut(random.nextInt(1000));
                try{
                    Thread.sleep(500);
                }catch (InterruptedException s){
                    s.printStackTrace();
                }
            }
        }
        );
        cashIn.start();
        cashOut.start();
    }
}
