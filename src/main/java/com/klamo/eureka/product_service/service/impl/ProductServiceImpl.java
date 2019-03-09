package com.klamo.eureka.product_service.service.impl;


import com.klamo.eureka.product_service.domain.Product;
import com.klamo.eureka.product_service.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer,Product> daoMap = new HashMap<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());

    static {
        daoMap.put(1,new Product(1,"手机",99,10));
        daoMap.put(2,new Product(2,"冰箱",100,30));
        daoMap.put(3,new Product(3,"洗衣机",199,10));
        daoMap.put(4,new Product(4,"电视",919,10));
        daoMap.put(5,new Product(5,"龙梅子",939,10));
        daoMap.put(6,new Product(6,"椅子",299,10));
        daoMap.put(7,new Product(7,"桌子",399,10));
    }

    @Override
    public List<Product> productList() {
        return new ArrayList<>(daoMap.values());
    }

    @Override
    public Product findById(int id) {
        logger.info("product server log日志...");
        return daoMap.get(id);
    }
}
