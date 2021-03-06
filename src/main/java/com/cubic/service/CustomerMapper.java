package com.cubic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cubic.entity.CustomerEntity;
import com.cubic.vo.CustomerVO;

@Component
public class CustomerMapper {

	public CustomerEntity mapToCustomerEntity(final CustomerEntity entity, final CustomerVO input) {
		entity.setFirstName(input.getFirstName());
		entity.setLastName(input.getLastName());
		entity.setPk(input.getPk());
		return entity;
	}
	
	public CustomerEntity mapToCustomerEntity(final CustomerVO input) {
		return mapToCustomerEntity(new CustomerEntity(),input);
	}	
	
	public CustomerVO mapToCustomerVO(final CustomerEntity entity) {
		CustomerVO vo = new CustomerVO();
		vo.setFirstName(entity.getFirstName());
		vo.setLastName(entity.getLastName());
		vo.setPk(entity.getPk());
		return vo;
	}
	
	public List<CustomerVO> mapToCustomerVOList(final List<CustomerEntity> entities) {
		List<CustomerVO> results = new ArrayList<CustomerVO>();
		for(CustomerEntity entity:entities) {
			results.add(mapToCustomerVO(entity));
		}
		return results;
	}	
	
}
