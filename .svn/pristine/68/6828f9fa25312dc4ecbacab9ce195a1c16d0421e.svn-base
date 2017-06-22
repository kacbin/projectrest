package com.cubic.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.cubic.entity.CustomerEntity;
import com.cubic.test.CustomerData;
import com.cubic.vo.CustomerVO;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceJpaImplTest {

	
	@InjectMocks
	private CustomerServiceJpaImpl impl;
	
	@Mock
	private EntityManager em;
	
	@Spy
	private CustomerMapper mapper;
	
	@Test
	public void testFindCustomer() {
		CustomerEntity entity = CustomerData.createCustomerEntity();
		when(em.find(CustomerEntity.class, new Long(2000))).thenReturn(entity);
		CustomerVO result =impl.findCustomer(new Long(2000));
		assertNotNull(result);
		assertEquals(entity.getPk(), result.getPk());
	}

}
