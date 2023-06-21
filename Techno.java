class Loan
{
    int time;
    double principal, interest, amount;
    protected double commissionRate;
    
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    
    public void cal()
    {
        interest = principal * commissionRate * time * 0.01;
        amount = principal + interest;
        
        System.out.println("Rate: " + commissionRate);
        System.out.println("Interest: " + interest);
        System.out.println("Amount: " + amount);
    }
}

class HomeLoan extends Loan
{
    public HomeLoan(double principal, int time) 
    {
        this.principal = principal;
        this.time = time;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    
    public void cal()
    {
        super.cal();
    }
    
}

class EducationLoan extends Loan
{
    public EducationLoan(double principal, int time) 
    {
        this.principal = principal;
        this.time = time;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    
    public void cal()
    {
        super.cal();
    }
    
}

public class Techno 
{
    public static void main(String[] args)
    {
       System.out.println("Home loan is ....");
        HomeLoan homeLoan = new HomeLoan(1000, 2);
        homeLoan.setCommissionRate(10);
        homeLoan.cal();
        System.out.println("Education loan is ....");
        EducationLoan educationLoan = new EducationLoan(5000, 2);
        educationLoan.setCommissionRate(10);
        educationLoan.cal();
    }
}