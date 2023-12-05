/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author maria
 */
public class Patient {
    private String name;
    private String lastName;
    private Date dob;
    private String email;
    private String gender;
    private Integer id;
    private String username;
    private String password;
    
    public Patient() {
    }

    public Patient(String name, String lastName, Date dob, String email, String gender, Integer id, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return lastName;
    }

    public void setSurname(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String formatDate (Date dob){
        SimpleDateFormat  formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dob);
    }

    @Override
    public String toString() {
        return "Patient{" + ", name=" + name + ", lastName=" + lastName + ", dob=" + formatDate(dob) + ", email=" + email + ", gender=" + gender + '}';
    }
}
