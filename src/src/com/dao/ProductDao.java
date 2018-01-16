package src.com.dao;

import src.com.entity.Product;

import java.util.List;

public interface ProductDao {
    /**
     *
     * @param product
     * @return boolean
     * 增加商品
     */
    public boolean saveProduct(Product product);

    /**
     *
     * @param product
     * @return boolean
     * 更新商品价格
     */
    public boolean updateProductForPrice(Product product);

    /**
     *
     * @param product
     * @return boolean
     * 更新商品类型
     */
    public boolean updateProductForType(Product product);

    /**
     *
     * @param product
     * @return boolean
     * 删除商品
     */
    public boolean delProduct(Product product);

    List<Product> queryAllProduct();

    Product queryProductByName(Product product);
}
