package com.litb.listing.mapper;

import com.litb.listing.domain.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
@Mapper
public interface ProductMapper {

    Product selectById(int id);





}
