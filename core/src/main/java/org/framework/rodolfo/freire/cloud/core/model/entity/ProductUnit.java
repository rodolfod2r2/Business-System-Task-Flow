package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductUnit {

    private long productUnitId;
    private String productUnitCode;
    private String productUnitDescription;
    private boolean productStatus;

}
