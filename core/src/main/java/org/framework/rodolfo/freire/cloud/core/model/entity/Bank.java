package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Bank {

    private long bankId;
    private long bankCode;
    private Date bankRelationshipDate;
    private Account account;
    private Address bankAddress;
    private Phone bankPhone;
    private boolean bankStatus;
}
