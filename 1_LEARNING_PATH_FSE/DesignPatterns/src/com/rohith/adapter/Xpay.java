package com.rohith.adapter;

public interface Xpay {
	public String getCreditCardNo();

	public String getCustomerName();

	public String getCardExpMonth();

	public String getCardExpYear();

	public Short getCardCVVNo();

	public Double getAmount();

	public void setCreditCardNo(String creditCardNo);

	public void setCustomerName(String customerName);

	public void setCartExpMonth(String cardExpMonth);

	public void setCartExpYear(String cardExpYear);

	public void setCardCVVNo(Short cardCVVNo);

	public void setAmount(Double amount);

}
