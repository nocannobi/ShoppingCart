package src.com.daoimpl;


import src.com.dao.BaseDao;
import src.com.dao.CustomerDao;
import src.com.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl extends BaseDao implements CustomerDao {

    public boolean saveCustomer(Customer customer) {
        String sql = "INSERT INTO customer(customer_name," +
                "customer_password, customer_email, customer_phone,"
                + "customer_money) VALUES(?,?,?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(customer.getCustomerName());
        params.add(customer.getCustomerPassword());
        params.add(customer.getCustomerEmail());
        params.add(customer.getCustomerPhone());
        params.add(customer.getCustomerMoney());
        return update(sql, params);
    }

    public boolean updateCustomer(Customer customer) {
        String sql = "UPDATE customer SET customer_password=?"
                 +"where id = ?";
        List<Object> params = new ArrayList<>();
        params.add(customer.getCustomerPassword());
        params.add(customer.getId());
        boolean update = update(sql, params);
        return false;
    }

    public boolean delCustomer(Customer customer) {
        String sql ="Delete From customer Where id = ?";
        List<Object> params = new ArrayList<>();
        params.add(customer.getId());
        boolean del = update(sql,params);
        return false;

    }

    @Override
    public Customer queryCustomerByName(Customer customer) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id,customer_name,customer_password,customer_email,customer_phone,customer_money FROM customer WHERE customer_name = ? and customer_password = ?";
        Customer customer1 = null;
        try {
            connection = getconn();
            ps = connection.prepareStatement(sql);
            ps.setString(1, customer.getCustomerName());
            ps.setString(2,customer.getCustomerPassword());
            rs = ps.executeQuery();
            //可以通过列的名字获取当前行所对应的列的值  或者根据列编号获取
            if (rs != null) {
                while(rs.next()){
                    customer1 = new Customer();
                   customer1.setId(rs.getInt("id"));
                   customer1.setCustomerName(rs.getString("customer_name"));
                   customer1.setCustomerPassword(rs.getString("customer_password"));
                   customer1.setCustomerEmail(rs.getString("customer_email"));
                   customer1.setCustomerPhone(rs.getString("customer_phone"));
                   customer1.setCustomerMoney(rs.getBigDecimal("customer_money"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(rs,ps,connection);
        }


        return customer1;
    }


}
