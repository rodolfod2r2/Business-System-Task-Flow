package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TaxCodeOperation {

    private long taxCodeOperationId;
    private long taxCodeOperationCode;
    private String taxCodeOperationDescription;
    private boolean taxCodeOperationStatus;

}
