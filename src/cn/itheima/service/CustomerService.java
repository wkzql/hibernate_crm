package cn.itheima.service;



import java.util.List;

import cn.itheima.domain.Customer;

public interface CustomerService {
//保存客户
	void save(Customer c);

	List<Customer> getAll();

	
}
