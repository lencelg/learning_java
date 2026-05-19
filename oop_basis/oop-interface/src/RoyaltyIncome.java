
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income{
	protected double income;
	RoyaltyIncome(double income){
		this.income = income;
	}
	@Override
	public double getTax(){
		double taxable;
        if (income <= 800) {
            return 0;
        }
        else if (income <= 4000) {
            taxable = income - 800;
        }
        else {
            taxable = income * 0.8;
        }
        return taxable * 0.14;
	}
}
