package src.test.com.daoimpl;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* CustomerDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>01/13/2018</pre> 
* @version 1.0 
*/ 
public class CustomerDaoImplTest extends TestCase { 
public CustomerDaoImplTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: saveCustomer(Customer customer) 
* 
*/ 
public void testSaveCustomer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateCustomer(Customer customer) 
* 
*/ 
public void testUpdateCustomer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delCustomer(Customer customer) 
* 
*/ 
public void testDelCustomer() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(CustomerDaoImplTest.class); 
} 
} 
