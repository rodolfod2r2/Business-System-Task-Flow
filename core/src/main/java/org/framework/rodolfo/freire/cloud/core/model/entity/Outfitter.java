package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Outfitter {

    private long outfitterId;
    private long outfitterCode;
    private String outfitterType;
    private String outfitterIdNational;
    private String outfitterName;
    private Date outfitterRelationshipDate;
    private Address outfitterAddress;
    private Phone outfitterPhone;
    private String outfitterSite;
    private String outfitterEmail;
    private boolean outfitterStatus;

}
