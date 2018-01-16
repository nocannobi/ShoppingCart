package src.com.dao;

import src.com.entity.Product;

import java.util.List;

public interface ProductDao {
    /**
     *
     * @param product
     * @return boolean
     * ������Ʒ
     */
    public boolean saveProduct(Product product);

    /**
     *
     * @param product
     * @return boolean
     * ������Ʒ�۸�
     */
    public boolean updateProductForPrice(Product product);

    /**
     *
     * @param product
     * @return boolean
     * ������Ʒ����
     */
    public boolean updateProductForType(Product product);

    /**
     *
     * @param product
     * @return boolean
     * ɾ����Ʒ
     */
    public boolean delProduct(Product product);

    List<Product> queryAllProduct();

    Product queryProductByName(Product product);
}
