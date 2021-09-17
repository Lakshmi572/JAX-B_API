package com.Rest_Prerequisites.JaxB.Marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshall {
    public static void main(String[] args) throws JAXBException {
        Address add=new Address("Kadapa","AP","India");
        Student s1=new Student(101,"Lakshmi",25,10,add);

        JAXBContext context=JAXBContext.newInstance(Student.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(s1,System.out);
    }
}
