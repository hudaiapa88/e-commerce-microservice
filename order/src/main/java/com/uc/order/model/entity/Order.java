package com.uc.order.model.entity;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString(callSuper = true)
public class Order extends BaseTimestamp {
    private List<OrderLine> orderLines;
    private BigDecimal totalPrice;
    private String customerId;
    private Address address;
}
