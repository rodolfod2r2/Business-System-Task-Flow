package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Department {

    private long departmentId;
    private long departmentCode;
    private String departmentType;
    private String departmentName;
    private boolean departmentStatus;

}
