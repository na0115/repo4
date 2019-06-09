package com.nxl_ssm.controller;

import com.github.pagehelper.PageInfo;

import com.nxl_ssm.domain.Product;
import com.nxl_ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {
    /**
     * 查询
     */
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){

        ModelAndView mv=new ModelAndView();
        List<Product> ps = productService.findAll();

        System.out.println(ps);


        PageInfo pageInfo=new PageInfo(ps);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");

        return mv;
    }




}
