package com.spring.app;

import java.util.Map;
import java.util.Map.Entry;

public class CurrencyConverter {
	private Map<String, String> mObj;

	public Map<String, String> getmObj() {
	    return mObj;
	}
	public void setmObj(Map<String, String> mObj) {
	    this.mObj = mObj;
	}

	public int getTotalCurrencyValue(String value) {
		String num = "";
		String currency = "";
		int total = 0;
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i))) {
				num = num + value.charAt(i);
			} else {
				currency = currency + value.charAt(i);
			}
		}
		for (Entry<String, String> entry : mObj.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(currency)) {
				total = Integer.valueOf(entry.getValue());
			}
		}
		total = total * Integer.valueOf(num);
		return total;

	}
}