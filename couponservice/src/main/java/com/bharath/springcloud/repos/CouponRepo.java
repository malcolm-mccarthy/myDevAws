package com.bharath.springcloud.repos;

import com.bharath.springcloud.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
    public Coupon findByCode(String code);
    public Coupon findByExpDate(String expDate);
}
