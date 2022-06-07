package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "${user.empty}")
    @Size(min = 5, max = 45, message = "Ten khach hang phai trong khoang 5 den 15 ky tu")
    private String firstName;

    @NotEmpty(message = "{user.empty}")
    @Size(min = 5, max = 45, message = "Ten khach hang phai trong khoang 5 den 15 ky tu")
    private String lastName;

    @NotEmpty(message = "{user.empty}")
    @Pattern(regexp = "(0)+([0-9]{9})", message = "So dien thoai phai bat dau tu 0 va 10 so")
    private String phoneNumber;


    @Min(value = 18, message = "Ban chua du 18 tuoi")
    private int age;

    @NotEmpty(message = "{user.empty}")
    @Email(message = "Dinh dang Email khong hop le")
    private String email;

    public Users() {
    }

    public Users(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}