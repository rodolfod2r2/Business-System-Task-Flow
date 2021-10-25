package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

    private long productId;
    private long productCode;
    private String productDescription;
    private ProductUnit productUnit;
    private Outfitter productOutfitter;
    private BigDecimal productSaleValue;
    private BigDecimal productPurchaseValue;
    private int productStockQuantity;
    private int productCriticalStockQuantity;
    private int productPromotionalPercent;
    private Date productPromotionalStarDate;
    private Date productPromotionalEndDate;
    private boolean productPromotionalStatus;
    private boolean productStatus;

}
