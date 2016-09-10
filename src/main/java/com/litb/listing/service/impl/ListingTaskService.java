package com.litb.listing.service.impl;

import com.github.pagehelper.PageHelper;
import com.litb.listing.domain.ListingTask;
import com.litb.listing.mapper.ListingTaskMapper;
import com.litb.listing.service.IListingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
@Service("listingTaskService")
public class ListingTaskService implements IListingTaskService {

    @Autowired
    private ListingTaskMapper listingTaskMapper;

    @Override
    public List<ListingTask> getUnListing(int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return listingTaskMapper.selectUnListing();
    }


}
