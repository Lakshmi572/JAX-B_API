package com.Rest_Prerequisites.JackSon.complex.bindings;

import com.Rest_Prerequisites.JaxB.Marshalling.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @JsonProperty("cid")
    private Integer customerId;
    @JsonProperty("cname")
    private String customerName;
    @JsonProperty("cmail")
    private String customerEmail;

    private Address address;
    private insurance policy;
}
