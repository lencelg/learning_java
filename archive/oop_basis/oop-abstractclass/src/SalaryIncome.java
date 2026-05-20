
public class SalaryIncome extends Income{
	SalaryIncome(double income){
		super(income);
	}
	@Override
	public double getTax(){
		return income * 0.1;
	}
}
