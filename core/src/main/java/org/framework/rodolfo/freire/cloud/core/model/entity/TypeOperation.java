package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TypeOperation {

    private long typeOperationId;
    private long typeOperationCode;
    private String typeOperationDescription;
    private boolean typeOperationStatus;

}
