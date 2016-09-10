package com.litb.listing.mapper;

import com.litb.listing.domain.ListingTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
@Mapper
public interface ListingTaskMapper {


    List<ListingTask> selectUnListing();

}
