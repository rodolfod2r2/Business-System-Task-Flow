package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Payment {

    private long paymentId;
    private long paymentCode;
    private String paymentDescription;
    private TypeOperation paymentType;
    private Bank paymentBank;
    private Account paymentAccount;
    private AccountPlan paymentAccountPlan;
    private Outfitter paymentOutfitter;
    private BigDecimal paymentAmount;
    private BigDecimal discountAmount;
    private BigDecimal paymentInterest;
    private BigDecimal paymentFine;
    private BigDecimal paymentAmountPaid;
    private Date paymentDateCreated;
    private Date paymentDate;
    private Date paymentDateDue;
    private Date paymentDatePaid;
    private boolean paymentStatus;
}
