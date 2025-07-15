package com.xworkz.set.runner;

import com.xworkz.set.dto.*;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerRunner {
    public static void main(String[] args) {



        Customer customer1 = new Customer("Amit", "amit@example.com", 32,
                new Passport("P123", "2020-01-01", "2030-01-01",
                        new Country("India", "Asia", 1400000000,
                                new President("Kumar", 60, "Democratic",
                                        new Driver("Ravi", 45, "DL123",
                                                new Vehicle("XUV500", "Mahindra", "KA05ML1234",
                                                        new Company("TechSoft", "IT", 10000,
                                                                new CEO("Neha", 48, "neha@techsoft.com",
                                                                        new House("Bangalore", 2, true,
                                                                                new Security("SEC100", "Electronic", true,
                                                                                        new Job("Developer", "IT", 70000,
                                                                                                new Detail("DET001", "PAN", "Identity",
                                                                                                        new Education("B.Tech", "IIT Delhi", 2012, 78.9)
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        Customer customer2 = new Customer("Customer1", "customer1@mail.com", 26,
                new Passport("P00001", "2020-01-01", "2030-01-01",
                        new Country("India", "Asia", 1010000,
                                new President("President1", 56, "Independent",
                                        new Driver("Driver1", 35, "LIC00001",
                                                new Vehicle("Model1", "BrandX", "KA01XYZ001",
                                                        new Company("TechSoft", "IT", 101,
                                                                new CEO("CEO1", 45, "ceo1@example.com",
                                                                        new House("Address 1", 2, true,
                                                                                new Security("SEC001", "Electronic", true,
                                                                                        new Job("Tester", "IT", 51000,
                                                                                                new Detail("DET001", "Govt ID", "PAN",
                                                                                                        new Education("MBA", "Institution1", 2011, 79.3)
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        Customer customer3 = new Customer("Customer0", "customer0@mail.com", 25,
                new Passport("P00000", "2020-01-01", "2030-01-01",
                        new Country("Japan", "Asia", 1000000,
                                new President("President0", 55, "Independent",
                                        new Driver("Driver0", 30, "LIC00000",
                                                new Vehicle("Model0", "BrandX", "KA00XYZ000",
                                                        new Company("CodeWave", "IT", 100,
                                                                new CEO("CEO0", 40, "ceo0@example.com",
                                                                        new House("Address 0", 1, true,
                                                                                new Security("SEC000", "Electronic", false,
                                                                                        new Job("Analyst", "IT", 50000,
                                                                                                new Detail("DET000", "Govt ID", "PAN",
                                                                                                        new Education("MBA", "Institution0", 2010, 76.90)
                                                                                                ))))))))))));

        Customer customer4 = new Customer("Customer10", "customer10@mail.com", 25,
                new Passport("P00010", "2020-01-01", "2030-01-01",
                        new Country("France", "Asia", 1100000,
                                new President("President10", 55, "Independent",
                                        new Driver("Driver10", 30, "LIC00010",
                                                new Vehicle("Model10", "BrandX", "KA10XYZ010",
                                                        new Company("Xenon", "IT", 110,
                                                                new CEO("CEO10", 40, "ceo10@example.com",
                                                                        new House("Address 10", 1, true,
                                                                                new Security("SEC010", "Electronic", false,
                                                                                        new Job("Developer", "IT", 60000,
                                                                                                new Detail("DET010", "Govt ID", "PAN",
                                                                                                        new Education("MBA", "Institution10", 2010, 81.64)
                                                                                                ))))))))))));

        List<Customer> customers = Arrays.asList(
                customer1, customer2, customer3,customer4
        );


        System.out.println("1:Sort by Company Name (desc)");
        customers.stream()
                .sorted(Comparator.comparing(
                        c -> c.getPassport().getCountry().getPresident().getDriver().getVehicle().getCompany().getName(),
                        Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println( "2: Find customer by job role");
        customers.stream()
                .filter(c -> c.getPassport().getCountry().getPresident()
                        .getDriver().getVehicle().getCompany().getCeo()
                        .getHouse().getSecurity().getJob().getRole().equals("Developer"))
                .forEach(System.out::println);


        System.out.println("3.Sort by Country name (desc)");
        customers.stream()
                .sorted((c1, c2) -> c2.getPassport().getCountry().getName()
                        .compareTo(c1.getPassport().getCountry().getName()))
                .forEach(System.out::println);

        System.out.println("4.Sort by education qualification (asc)");
        customers.stream()
                .sorted(Comparator.comparing(
                        c -> c.getPassport().getCountry().getPresident()
                                .getDriver().getVehicle().getCompany().getCeo()
                                .getHouse().getSecurity().getJob().getDetail()
                                .getEducation().getQualification()))
                .forEach(System.out::println);

        System.out.println("5.Collect unique countries");
        Set<String> countries = customers.stream()
                .map(c -> c.getPassport().getCountry().getName())
                .collect(Collectors.toSet());

        countries.forEach(System.out::println);







    }
}
