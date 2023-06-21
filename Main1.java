abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    public int getBalance() {
        return 200;
    }
}

public class Main{
    public static void main(String[] args) {
        Bank a = new BankA();
        System.out.println(a.getBalance());  

        Bank b = new BankB();
        System.out.println(b.getBalance());  

        Bank c = new BankC();
        System.out.println(c.getBalance());  
    }
}