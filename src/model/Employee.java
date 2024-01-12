package model;

import enums.Plan;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, Plan plan ) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[3];
    }

    public void addHealthplan(int index, String name) {
        if (index >= 0 && index < healthplans.length) {
            if (healthplans[index] == null) {
                healthplans[index] = name;
                System.out.println("HealthPlan added successfully.");
            } else {
                System.out.println("The specified index is already occupied.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Getter and Setter methods

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthplans) +
                '}';
    }
}