package src.com.dao;


import src.com.entity.Customer;

public interface CustomerDao {
    /**
     *
     * @param customer
     * @return boolean
     * 增加用户
     */
    public boolean saveCustomer(Customer customer);

    /**
     *
     * @param customer
     * @return boolean
     * 更新用户密码
     */
    public boolean updateCustomer(Customer customer);

    /**
     *
     * @param customer
     * @return boolean
     * 删除用户
     */
    public boolean delCustomer(Customer customer);

    /**
     *
     * @param customer
     * @return Costomer
     *
     */
    public Customer queryCustomerByName(Customer customer);
}
