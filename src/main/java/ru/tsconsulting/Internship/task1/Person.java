package ru.tsconsulting.Internship.task1;

import java.math.BigDecimal;

class Person {
    private String name;
    private BigDecimal salary;

    public Person(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
        if (salary.signum() < 0 || salary.scale() > 2) {
            throw new NumberFormatException();
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}