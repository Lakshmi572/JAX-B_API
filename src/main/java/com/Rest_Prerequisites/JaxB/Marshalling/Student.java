package com.Rest_Prerequisites.JaxB.Marshalling;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
//    @XmlElement(name="Id")
    @XmlAttribute(name="Id")
    private Integer studentId;
    @XmlElement(name="Name")
    private String studentName;
    @XmlElement(name="Age")
    private Integer studentAge;
    @XmlElement(name="Rank")
    private Integer studentRank;
    private Address address;

    public Student() {
    }

    public Student(Integer studentId, String studentName, Integer studentAge, Integer studentRank, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentRank = studentRank;
        this.address = address;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getStudentRank() {
        return studentRank;
    }

    public void setStudentRank(Integer studentRank) {
        this.studentRank = studentRank;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentRank=" + studentRank +
                ", address=" + address +
                '}';
    }
}
