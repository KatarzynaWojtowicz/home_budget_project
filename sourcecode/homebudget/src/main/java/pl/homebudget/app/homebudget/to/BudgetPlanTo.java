package pl.homebudget.app.homebudget.to;

import java.util.List;

public class BudgetPlanTo {
	private ExpenseTo expense;
	private ProfitTo profit;
	private List<UserTo> user;

	public ExpenseTo getExpense() {
		return expense;
	}

	public void setExpense(ExpenseTo expense) {
		this.expense = expense;
	}

	public ProfitTo getProfit() {
		return profit;
	}

	public void setProfit(ProfitTo profit) {
		this.profit = profit;
	}

	public List<UserTo> getUser() {
		return user;
	}

	public void setUser(List<UserTo> user) {
		this.user = user;
	}

}
