package com.uc.order.model.entity;

import com.uc.order.model.entity.base.BaseId;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class OrderLine extends BaseId {
    private Product product;
    private Integer quantity;
    private BigDecimal totalPrice;
}
