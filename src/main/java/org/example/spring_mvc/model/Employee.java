package org.example.spring_mvc.model;




import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;
    private String surName;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String [] languages;
    private Map<String, String> languagess;



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
