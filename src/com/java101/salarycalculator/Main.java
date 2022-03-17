package com.java101.salarycalculator;

public class Main {

    public static void main(String[] args) {

        Employee emp001 = new Employee("kemal",1985,2000.0,45);
        emp001.tax();
        emp001.bonus();
        emp001.raiseSalary();
        emp001.showExactSalary();
    }
}
