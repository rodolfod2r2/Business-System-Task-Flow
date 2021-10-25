package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Phone {

    private long phoneId;
    private String phoneType;
    private String phoneNumber;
    private boolean PhonePreferred;
    private boolean PhoneStatus;

}
