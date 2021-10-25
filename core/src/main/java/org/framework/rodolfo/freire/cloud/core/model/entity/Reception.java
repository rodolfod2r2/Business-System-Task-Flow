package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Reception {

    private long receptionId;
    private long receptionCode;
    private String receptionDescription;
    private TypeOperation receptionType;
    private Bank receptionBank;
    private Account receptionAccount;
    private AccountPlan receptionAccountPlan;
    private Customer receptionCustomer;
    private BigDecimal receptionAmount;
    private BigDecimal discountAmount;
    private BigDecimal receptionInterest;
    private BigDecimal receptionFine;
    private BigDecimal receptionAmountPaid;
    private Date receptionDateCreated;
    private Date receptionDate;
    private Date receptionDateDue;
    private Date receptionDatePaid;
    private boolean receptionStatus;

}
