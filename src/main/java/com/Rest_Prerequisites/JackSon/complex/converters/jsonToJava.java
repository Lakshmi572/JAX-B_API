package com.Rest_Prerequisites.JackSon.complex.converters;

import com.Rest_Prerequisites.JackSon.complex.bindings.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jsonToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        File file =new File("customer.json");
        Customer customer = mapper.readValue(file, Customer.class);
        System.out.println(customer);
    }
}
