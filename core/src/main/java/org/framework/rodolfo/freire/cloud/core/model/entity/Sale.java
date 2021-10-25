package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sale {

    private long saleId;
    private long saleCode;
    private Date saleDate;
    private BigDecimal saleAmountPaid;
    private TypeOperation saleType;
    private String SaleInvoiceNumber;
    private BigDecimal discountAmount;
    private Customer saleCustomer;
    private Employee saleEmployee;
    private TaxCodeOperation saleTaxCodeOperation;
    private List<SaleDetail> saleDetailList;
    private boolean saleStatus;


}
