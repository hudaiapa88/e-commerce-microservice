package com.uc.product.model.entity;


import com.uc.product.model.entity.base.BaseId;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class Product extends BaseId {
    String title;
    BigDecimal price;
}
