package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Card {

    private long cardId;
    private Customer cardCustomer;
    private Bank cardBank;
    private Account cardAccount;
    private String cardNumber;
    private String cardType;
    private String cardPassword;
    private Date cardRelationshipDate;
    private BigDecimal cardCreditLimit;
    private BigDecimal cardOverdraftLimit;
    private boolean cardOnlinePay;
    private boolean cardMobilePay;
    private boolean cardCashBackPay;
    private boolean cardOverdraft;
    private boolean cardStatus;

}
