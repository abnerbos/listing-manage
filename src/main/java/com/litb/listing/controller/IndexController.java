package com.litb.listing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pengbo on 16/9/9.
 */

@Controller
public class IndexController {


    @RequestMapping("/")
    String index(){
        return "index";
    }


}
