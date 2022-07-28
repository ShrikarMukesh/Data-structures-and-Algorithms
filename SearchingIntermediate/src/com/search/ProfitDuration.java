package com.search;

public class ProfitDuration  {
	
	private int profit;
	private int buyDateIndex;
	private int sellDateIndex;
	
	public ProfitDuration(int profit, int buyDateIndex, int sellDateIndex) {
		
		super();
		this.profit = profit;
		this.buyDateIndex = buyDateIndex;
		this.sellDateIndex = sellDateIndex;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public int getBuyDateIndex() {
		return buyDateIndex;
	}
	public void setBuyDateIndex(int buyDateIndex) {
		this.buyDateIndex = buyDateIndex;
	}
	public int getSellDateIndex() {
		return sellDateIndex;
	}
	public void setSellDateIndex(int sellDateIndex) {
		this.sellDateIndex = sellDateIndex;
	}
	
	public String toString() {
		return "Profit  "+profit+"  BuyIndex  "+buyDateIndex+"  SellIndex  "+sellDateIndex;
	}	
}
