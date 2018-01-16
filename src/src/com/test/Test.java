package src.com.test;


import src.com.dao.CustomerDao;
import src.com.dao.ProductDao;
import src.com.daoimpl.CustomerDaoImpl;
import src.com.daoimpl.ProductDaoImpl;
import src.com.entity.Customer;
import src.com.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Customer customer = new Customer();
       CustomerDao cd = new CustomerDaoImpl();
       customer.setCustomerName("xiaodong");
       customer.setCustomerPassword("123456");
       Customer customer1 = cd.queryCustomerByName(customer);
       if(customer1 != null){
           System.out.println(customer1);
           System.out.println("µÇÂ¼³É¹¦");
         }

      /*ProductDao pd = new ProductDaoImpl();
      List<Product> productlist = pd.queryAllProduct();
       if(productlist != null){
           for (Product product : productlist) {
               System.out.println(product);
           }
       }*/
    }
}
