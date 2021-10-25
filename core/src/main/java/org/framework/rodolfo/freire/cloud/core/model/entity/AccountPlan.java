package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AccountPlan {

    private long accountPlanId;
    private long accountPlanCode;
    private String accountPlanDescription;
    private String accountPlanLevel;
    private boolean accountPlanStatus;

}
