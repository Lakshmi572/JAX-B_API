package com.Rest_Prerequisites.JackSon;

import com.Rest_Prerequisites.JaxB.Marshalling.Address;
import com.Rest_Prerequisites.JaxB.Marshalling.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serialization {
    public static void main(String[] args) throws JsonProcessingException {
        Address a1=new Address("Vizag","AP","India");
        Student s1=new Student(101,"Inder",23,50,a1);
        ObjectMapper mapper=new ObjectMapper();
        String string = mapper.writeValueAsString(s1);
        System.out.println(string);
    }
}
