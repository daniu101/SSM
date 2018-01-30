package com.qingyu.service.impl;
import java.util.List;

import javax.annotation.Resource;  
import org.springframework.stereotype.Service;

import com.qingyu.dao.ProductMapper;
import com.qingyu.model.Product;
import com.qingyu.service.IProductService;
  
  
@Service("productService")  
public class ProductServiceImpl implements IProductService {  
    @Resource  
    private ProductMapper productDao;  
    
    public Product getProductById(int id) {  
        // TODO Auto-generated method stub  
        return this.productDao.selectByPrimaryKey(id);  
    }

	@Override
	public List<Product> getProductIndex(Product record) {
		// TODO Auto-generated method stub
		return this.productDao.selectProductIndex(record);
	}  
  
}  
