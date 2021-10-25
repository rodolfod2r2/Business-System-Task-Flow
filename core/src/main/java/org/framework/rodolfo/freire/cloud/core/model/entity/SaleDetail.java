package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SaleDetail {

    private long saleDetailId;
    private long saleDetailCode;
    private Product saleDetailProduct;
    private int saleDetailProductQuantity;
    private BigDecimal saleDetailProductSubTotal;

}
