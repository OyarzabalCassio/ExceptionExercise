public class Account {
    Integer number;
    String holder;
    Double balance, withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

        public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }



    public void deposit(double amount){
        this.balance = balance + amount;

    }
    public void withdraw (double amount){
        if(amount > withdrawLimit){
            throw new IllegalArgumentException("Queres sacar mais que o limite");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Queres sacar mais do que tens");
        }
        this.balance = balance - amount;

    }

    public String toString(){
        return
        "Nome: " + number + "\n" +
        "Conta: " + holder + "\n" +
        "Saldo: " + balance + "\n" +
        "Limite: "+ withdrawLimit;

    }

}
