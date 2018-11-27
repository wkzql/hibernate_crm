package cn.itheima.dao;



import java.util.List;

import cn.itheima.domain.Customer;

public interface CustomerDao {
//保存客户
	void save(Customer c);

	List<Customer> getAll();
	//根据ID获得客户
	Customer getById(Long cust_id);









	



}
