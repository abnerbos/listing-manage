package com.litb.listing.service.impl;

import com.litb.listing.domain.Product;
import com.litb.listing.mapper.ProductMapper;
import com.litb.listing.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
@Service("productService")
@EnableTransactionManagement
public class ProductService implements IProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    @Transactional
    public Product getProduct(int id) {
        return productMapper.selectById(id);
    }
}
