package com.Rest_Prerequisites.JackSon.complex.bindings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class insurance {
    private String policyName;
    private Integer amount;
    private String startDate;
    private String endDate;
}
