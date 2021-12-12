package org.example.spring_mvc.model;




import org.example.spring_mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "Minimum 2 symbols")
    private String name;
    @NotBlank(message = "Не должно быть пустым.")
    private String surName;
    @Min(value = 500, message = "Must be greate than 499")
    @Max(value = 1000, message = "Must be less than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String [] languages;
    private Map<String, String> languagess;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail
    private String email;


    public Employee(){
        departments = new HashMap<>();
        departments.put("HR", "Human Resourses");
        departments.put("IT", "Information Tech");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Mersedec","Mersedec");

        languagess = new HashMap<>();
        languagess.put("En","English");
        languagess.put("Fr","Frense");
        languagess.put("De","Deutch");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguagess() {
        return languagess;
    }

    public void setLanguagess(Map<String, String> languagess) {
        this.languagess = languagess;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
