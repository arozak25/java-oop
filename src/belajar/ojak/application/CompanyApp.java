package belajar.ojak.application;

import belajar.ojak.data.Company;

/**
 * @author Abdul Rozak
 * @since 2/4/21
 */
public class CompanyApp {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Ojaaaak");

        Company.Employee employee = company.new Employee();
        employee.setName("Ojakun");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
