package com.example.demo;

public class CustomerOrderServiceImpl {

	private CustomerOrderService orderService;

	public CustomerOrderServiceImpl(CustomerOrderService orderService) {
		super();
		this.orderService = orderService;
	}


	public CustomerOrder getCustomerOrder(String orderId) {
		CustomerOrder co = orderService.getOrderDetail(orderId);
		return co;
	}

}
