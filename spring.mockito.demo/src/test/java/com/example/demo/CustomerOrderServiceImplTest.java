package com.example.demo;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class CustomerOrderServiceImplTest {

	Logger LOGGER = LoggerFactory.getLogger(CustomerOrderServiceImplTest.class);

	@Mock
	CustomerOrderService orderServiceMock;

	@InjectMocks
	CustomerOrderServiceImpl cosi;
	
	
	@Before
	public void setUp() {
		when(orderServiceMock.getOrderDetail(anyString())).thenReturn((CustomerOrder)TestData.getTestData(CustomerOrder.class));
	}

	@Test
	public void testGetCustomerOrder() {
		LOGGER.info("{}", cosi.getCustomerOrder("2"));
	}

}
