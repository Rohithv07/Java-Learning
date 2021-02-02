package com.rohith.adapter;

/*
 * Here we have to create an object of xpay and set the properties.Then we created the adpter and pass it that xpay object to the constructor and assigned the payD interface
 */
public class RunAdapterExamples {
	public static void main(String[] args) {
		// we need to have an object for xpay
		Xpay xpay = new XPayImpl();
		xpay.setCreditCardNo("123");
		xpay.setCustomerName("Das");
		xpay.setCartExpMonth("08");
		xpay.setCartExpYear("2022");
		xpay.setCardCVVNo((short) 123);
		xpay.setAmount(2566.00);

		// object for payd
		PayD payD = new XpayToPayAdapter(xpay);
		testPayD(payD);

	}

	private static void testPayD(PayD payD) {
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());
	}
}
