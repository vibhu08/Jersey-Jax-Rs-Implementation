package org.vibhu.messenger;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	
	static List<Customer> list=new ArrayList<>();
  public static  List<Customer> getAllCustomers()
  {
	 
	  return list;
  }
  
  public static  void addCustomer(String x ,int y)
  {
	  Customer c1=new Customer(x,y); 
	  list.add(c1);
  }

}
