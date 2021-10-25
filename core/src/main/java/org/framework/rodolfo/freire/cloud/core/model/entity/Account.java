package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account {

    private long accountId;
    private long accountCode;
    private String accountNumber;
    private String accountType;
    private Date accountRelationshipDate;
    private String accountManager;
    private Address accountAddress;
    private Phone accountPhone;
    private BigDecimal accountCreditLimit;
    private BigDecimal accountOverdraftLimit;
    private boolean accountOnlinePay;
    private boolean accountMobilePay;
    private boolean accountCashBackPay;
    private boolean accountOverdraft;
    private boolean accountStatus;

}
