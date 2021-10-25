package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Address {

    private long addressId;
    private String addressType;
    private Date addressRelationshipDate;
    private String postalCode;
    private String streetLine1;
    private String streetLine2;
    private String streetLine3;
    private String streetLine4;
    private String city;
    private String state;
    private String country;
    private boolean addressPreferred;
    private boolean PhoneStatus;

}
