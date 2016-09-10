package com.litb.listing.controller;

import com.litb.listing.domain.ListingTask;
import com.litb.listing.domain.Product;
import com.litb.listing.service.IListingTaskService;
import com.litb.listing.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * description
 *
 * @author PengBo
 * @since 2016/9/9
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private IListingTaskService listingTaskService;

    @RequestMapping("pending/{pageNum}")
    String pending(@PathVariable int pageNum, Model model){
        List<ListingTask> pendTaskList = listingTaskService.getUnListing(5,pageNum);
        model.addAttribute("pendTaskList",pendTaskList);
        return "product/pending";
    }

    @RequestMapping("show/{id}")
    String show(@PathVariable int id, Model model){
        Product product = productService.getProduct(id);
        model.addAttribute(product);
        return "product/show";
    }

}
