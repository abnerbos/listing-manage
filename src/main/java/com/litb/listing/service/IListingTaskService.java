package com.litb.listing.service;

import com.litb.listing.domain.ListingTask;

import java.util.List;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
public interface IListingTaskService {

    List<ListingTask> getUnListing(int pageSize, int pageNum);


}
