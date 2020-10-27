package com.example.demo;

public class TestData {

	private static Object testObject = null;

	public static Object getTestData(Class<?> type) {

		if (type.equals(CustomerOrder.class)) {
			testObject = getCustomerOrderTestData();
		}
		return testObject;
	}

	private static Object getCustomerOrderTestData() {

		CustomerOrder co = new CustomerOrder();
		co.setID("1");
		co.setPurchaseOrderNumber("1");
		co.setStatus("new");
		return co;

	}
}
