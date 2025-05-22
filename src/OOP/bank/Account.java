package OOP.bank;

public abstract class Account {
    protected int amount;
    abstract void withdraw(int amount);
    abstract void deposit(int amount);
    Account(int amount){
        this.amount = amount;
    }

    int getCurrentAmount(){
        return amount;
    }


}
