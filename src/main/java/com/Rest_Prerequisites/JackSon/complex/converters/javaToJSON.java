package com.Rest_Prerequisites.JackSon.complex.converters;

import com.Rest_Prerequisites.JackSon.complex.bindings.Customer;
import com.Rest_Prerequisites.JackSon.complex.bindings.insurance;
import com.Rest_Prerequisites.JaxB.Marshalling.Address;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;

public class javaToJSON {
    public static void main(String[] args) throws Exception {
        insurance p1=new insurance("Jeevan",10000,"10-10-2010","10-10-2030");
        Address a1=new Address("Tirupati","AP","India");
        Customer c1=new Customer(1987,"Aravind","aravind@gmail.com",a1,p1);
        ObjectMapper mapper=new ObjectMapper();
        String string = mapper.writeValueAsString(c1);
        FileWriter f=new FileWriter("customer.json");
        f.write(string);
        System.out.println("**** JSON file created successfully*****");
        f.close();
    }
}
