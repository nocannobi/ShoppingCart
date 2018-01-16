package src.com.daoimpl;


import src.com.dao.BaseDao;
import src.com.dao.ProductDao;
import src.com.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends BaseDao implements ProductDao {

    public boolean saveProduct(Product product) {
        String sql ="INSERT INTO product(product_name,product_price,product_type) VALUES (?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(product.getProductName());
        params.add(product.getProductPrice());
        params.add(product.getProductType());
        return update(sql,params);
    }

    public boolean updateProductForPrice(Product product) {
        String sql ="UPDATE product SET product_price=?"+"WHERE id= ?";
        List<Object> params = new ArrayList<>();
        params.add(product.getProductPrice());
        params.add(product.getId());
        return update(sql, params);
    }

    public boolean updateProductForType(Product product) {
        String sql ="UPDATE product SET product_type = ?"+"WHERE id= ?";
        List<Object> params = new ArrayList<>();
        params.add(product.getProductType());
        params.add(product.getId());
        return update(sql,params);
    }


    public boolean delProduct(Product product) {
        String sql ="DELETE From product WHERE id =?";
        List<Object> params = new ArrayList<>();
        params.add(product.getId());
        return update(sql,params);
    }

    @Override
    public List<Product> queryAllProduct() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Product> productlist = new ArrayList<>();
        String sql ="SELECT id,product_name,product_price,product_type FROM product";
        try {
            connection = getconn();
           ps = connection.prepareStatement(sql);
           rs = ps.executeQuery();
           if(rs != null){
               while(rs.next()){
                  Product product = new Product();
                  product.setId(rs.getInt("id"));
                  product.setProductName(rs.getString("product_name"));
                  product.setProductPrice(rs.getBigDecimal("product_price"));
                  product.setProductType(rs.getString("product_type"));
                  productlist.add(product);
               }

           }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(rs,ps,connection);
        }
        return productlist;
    }

    @Override
    public Product queryProductByName(Product product) {
        Connection connection = null;
        PreparedStatement ps = null;
        Product product1 = new Product();
        ResultSet rs = null;
        String sql = "SELECT id, product_name, product_price, product_type FROM product WHERE product_name = ?";
        try {
            connection = getconn();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
