package org.framework.rodolfo.freire.cloud.core.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {

    private long employeeId;
    private long employeeCode;
    private String employeeType;
    private String employeeIdNational;
    private String employeeName;
    private String employeeGender;
    private Date employeeBirthday;
    private Date employeeRelationshipDate;
    private Department employeeDepartment;
    private String employeeOccupation;
    private BigDecimal employeeIncome;
    private Address employeeAddress;
    private Phone employeePhone;
    private String employeeEmail;
    private String employeePassword;
    private String employeeAccessLevels;
    private boolean employeeStatus;

}
