package com.bharath.springcloud.controller;

import com.bharath.springcloud.model.Coupon;
import com.bharath.springcloud.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    @Autowired
    CouponRepo repo;

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon) {
        return repo.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
    public Coupon getCoupon(@PathVariable("code") String code) {
        return repo.findByCode(code);

    }

//    @RequestMapping(value = "/coupons/expDate/**", method = RequestMethod.GET)
//    public Coupon getCouponByExpDate(String expDate) {
//        return repo.findByExpDate(expDate);
//
//    }

    @RequestMapping(value = "/coupons/expDate", method = RequestMethod.GET)
    public Coupon getCouponByExpDate(@RequestParam("expDate") String expDate) {
        Coupon ret = repo.findByExpDate(expDate);
        return ret;
    }

//    @RequestMapping(value = "/coupons/expDate/{expDate}", method = RequestMethod.GET)
//    public Coupon getCouponByExpDate(@PathVariable("expDate") String expDate) {
//        return repo.findByExpDate(expDate);
//
//    }

//    @GetMapping(value = "/coupons/expDate/**")
//    public String getCouponByExpDate(HttpServletRequest request) {
//        String[] temp = request.getRequestURI().split(request.getContextPath() +
//                "/expDate/");
//        return temp[1];
//
//    }


}
