package MainPackage;

import java.lang.Math;

public class EstimatorCalculator {
	private double TotalGrossIncome;
	private double TotalMonthlyDebt;
	private double MortgageInterestRate;
	private int Term;
	private double DownPayment;
	private double HousingRaw;
	private double HousingAll;
	private double Maximum;
	private double Mortgage;
	
	public double getTotalGrossIncome(){
		return this.TotalGrossIncome;	
	}
	
	public void setTotalGrossIncome(double TotalGrossIncome){
		this.TotalGrossIncome = TotalGrossIncome;
	}
	
	public double getTotalMonthlyDebt(){
		return this.TotalMonthlyDebt;	
	}
	
	public void setTotalMonthlyDebt(double TotalMonthlyDebt){
		this.TotalMonthlyDebt = TotalMonthlyDebt;
	}
	
	public double getMortgageInterestRate(){
		return this.MortgageInterestRate;	
	}
	
	public void setMortgageInterestRate(double MortgageInterestRate){
		this.MortgageInterestRate = MortgageInterestRate;
	}
	
	public int getTerm(){
		return this.Term;	
	}
	
	public void setTerm(int Term){
		this.Term = Term;
	}
	
	public double getDownPayment(){
		return this.DownPayment;	
	}
	
	public void setDownPayment(double DownPayment){
		this.DownPayment = DownPayment;
	}
	
	public double getHousingRaw(){
		return this.HousingRaw;	
	}
	
	public void setHousingRaw(double HousingRaw){
		this.HousingRaw = HousingRaw;
	}
	
	public double getHousingAll(){
		return this.HousingAll;	
	}
	
	public void setHousingAll(double HousingAll){
		this.HousingAll = HousingAll;
	}
	
	public double getMaximum(){
		return this.Maximum;	
	}
	
	public void setMaximum(double Maximum){
		this.Maximum = Maximum;
	}
	
	public double getMortgage(){
		return this.Mortgage;	
	}
	
	public void setMortgage(double Mortgage){
		this.Mortgage = Mortgage;
	}

	public void calculateHousingRaw(){
		this.HousingRaw = (this.TotalGrossIncome / 12) * 0.18;
	}
	
	public void calculateHousingAll(){
		this.HousingRaw = (this.TotalGrossIncome / 12) * 0.36 - this.TotalMonthlyDebt;
	}
	
	public void calculateMaximum(){
		this.Maximum = Math.min(this.HousingRaw, this.HousingAll);
	}
	
	public void calculateMortgage(){
		this.Maximum = this.Maximum*Math.pow(1 +  MortgageInterestRate/12, this.Term*12);
	}
}
