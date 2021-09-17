package com.Rest_Prerequisites.JaxB.UnMarshalling;

import com.Rest_Prerequisites.JaxB.Marshalling.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnMarshal {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context=JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Student o = (Student)unmarshaller.unmarshal(new File("output.xml"));
        System.out.println(o);
    }
}
