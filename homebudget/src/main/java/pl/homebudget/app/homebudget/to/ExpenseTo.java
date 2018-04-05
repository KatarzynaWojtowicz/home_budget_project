package pl.homebudget.app.homebudget.to;

public class ExpenseTo {
	private String nameExpense;
	private int count;
	private double price;
	private String date;
	private boolean done;
	private CategoryTo category;

	public String getNameExpense() {
		return nameExpense;
	}

	public void setNameExpense(String nameExpense) {
		this.nameExpense = nameExpense;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public CategoryTo getCategory() {
		return category;
	}

	public void setCategory(CategoryTo category) {
		this.category = category;
	}
}
