package com.java101.salarycalculator;


public class Employee {

    String name;
    int hireYear ;
    double salary;
    int workHours ;
    double exactSalary, tax = 0 , bonus = 0, raise ;

    public Employee(String name, int hireYear, double salary, int workHours) {

        this.name = name;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workHours = workHours;
    }

    public void tax(){

        System.out.println("=========================================");
        System.out.println(this.name + " isimli çalışanın maaşı : " + this.salary + "TL");
        if (this.salary > 1000){

            tax = (this.salary * 0.03) ;
            System.out.println(this.name + " isimli çalışandan alınacak vergi : " + (this.salary * 0.03) + "TL");
        }
        else {

            System.out.println(this.name + " isimli çalışandan alınacak vergi : 0TL ");
        }

    }

    public void bonus(){

        System.out.println("=========================================");
        if (this.workHours > 40){

            bonus = ((this.workHours - 40) * 30 );
            System.out.println(this.name + " isimli çalışanın çalışama saati :" + this.workHours);
            System.out.println(this.name + " isimli çalışanın alacağı bonus :" + ((this.workHours - 40) * 30 ) + "TL");
        }

    }

    public void raiseSalary(){

        System.out.println("=========================================");
        System.out.println(this.name + " isimli çalışan " + this.hireYear + " senesinde işe başlamıştır");
        if (this.hireYear > 2011){

            System.out.println(this.name + " isimli çalışanın alacağı zam miktarı :" + ((this.salary) * 0.05 ));
            raise = ((this.salary) * 0.05 );
        }
        if (this.hireYear < 2012 && this.hireYear > 2001){

            System.out.println(this.name + " isimli çalışanın alacağı zam miktarı :" + ((this.salary) * 0.1 ));
            raise = ((this.salary) * 0.1 );
        }
        if (this.hireYear < 2002){

            System.out.println(this.name + " isimli çalışanın alacağı zam miktarı :" + ((this.salary) * 0.15 ));
            raise = ((this.salary) * 0.15 );
        }

    }

    public  void showExactSalary() {

        System.out.println("=========================================");
        System.out.println(this.name + " isimli çalışanın hesaplanan yeni maaşı : " + (this.salary + bonus + raise - tax));
    }

}
