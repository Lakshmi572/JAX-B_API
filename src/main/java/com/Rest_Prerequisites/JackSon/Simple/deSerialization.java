package com.Rest_Prerequisites.JackSon.Simple;

import com.Rest_Prerequisites.JaxB.Marshalling.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class deSerialization {
    public static void main(String[] args) throws IOException {
        File file=new File("person.json");
        ObjectMapper mapper=new ObjectMapper();
        Student student = mapper.readValue(file, Student.class);
        System.out.println(student);
    }
}
