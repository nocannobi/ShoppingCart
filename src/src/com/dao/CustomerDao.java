package src.com.dao;


import src.com.entity.Customer;

public interface CustomerDao {
    /**
     *
     * @param customer
     * @return boolean
     * �����û�
     */
    public boolean saveCustomer(Customer customer);

    /**
     *
     * @param customer
     * @return boolean
     * �����û�����
     */
    public boolean updateCustomer(Customer customer);

    /**
     *
     * @param customer
     * @return boolean
     * ɾ���û�
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
