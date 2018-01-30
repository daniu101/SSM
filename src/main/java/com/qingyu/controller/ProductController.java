package com.qingyu.controller;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import com.qingyu.model.Product;
import com.qingyu.service.IProductService;

@Controller  
@RequestMapping("/product")  
public class ProductController {  
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	 @Resource  
	 private IProductService productService;     
    
    // /product/details/{id}
    @RequestMapping(value="/details/{id}",method=RequestMethod.GET)  
    public String toIndex3(@PathVariable("id")String id,Map<String, Object> model){  
        int productId = Integer.parseInt(id);  
        Product product = this.productService.getProductById(productId);
        model.put("product", product);  
        return "details";  
    }  
    
    // /product/index/
    @RequestMapping(value="/index",method=RequestMethod.GET)  
    public String index(Map<String, Object> model){  
    	
    	Product product = new Product();
    	
    	List<Product> productList = this.productService.getProductIndex(product);
        model.put("product", productList);  
        
        return "index";  
    }  
    
}  