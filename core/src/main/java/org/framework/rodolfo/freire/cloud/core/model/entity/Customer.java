package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Customer {

    private long customerId;
    private long customerCode;
    private String customerType;
    private String customerIdNational;
    private String customerName;
    private String customerGender;
    private Date customerBirthday;
    private Date customerRelationshipDate;
    private String customerOccupation;
    private BigDecimal customerIncome;
    private Address customerAddress;
    private Phone customerPhone;
    private String customerEmail;
    private boolean customerStatus;

}
