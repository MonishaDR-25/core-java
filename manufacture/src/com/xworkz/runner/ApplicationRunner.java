package com.xworkz.runner;

import com.xworkz.dto.ApplicationDto;
import com.xworkz.dto.Owner;
import com.xworkz.enums.AppType;
import com.xworkz.enums.Version;
import com.xworkz.repository.ApplicationRepository;
import com.xworkz.repository.ApplicationRepositoryImpl;

import java.time.LocalDate;
import java.util.Collection;
import java.util.OptionalDouble;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applicationRepository=new ApplicationRepositoryImpl();
        Collection<ApplicationDto> collection=applicationRepository.findAll();

        System.out.println("1.Find all Applications by Type");
        collection.stream().map(ApplicationDto::getType).forEach(System.out::println);

        System.out.println("2.Find ChargePerUSer by Application name");
        collection.stream()
                .filter(app -> app.getName().equalsIgnoreCase("TaskMaster"))
                .map(ApplicationDto::getChargePerUser)
                .forEach(System.out::println);

        System.out.println("3.Find all by created date in desc order");
        collection.stream().sorted((a,b)->b.getCreatedDate().compareTo(a.getCreatedDate())).forEach(System.out::println);

        System.out.println("4. Sort all applications by Size in Desc order");
        collection.stream().sorted((a,b)->Double.compare(b.getSize(), a.getSize())).forEach(System.out::println);

        System.out.println("5.Find the version by name, type");
        collection.stream()
                .filter(a -> a.getName().equals("App20") && a.getType() == AppType.HEALTH)
                .map(ApplicationDto::getVersion)
                .forEach(System.out::println);

        System.out.println("6.Applications owned by Owner name:");
        collection.stream()
                .filter(app -> app.getOwners().stream().anyMatch(o -> o.getName().equals("Owner25")))
                .forEach(System.out::println);

        System.out.println("7.Find Owner's by application name");
        collection.stream().filter(app->app.getName().equalsIgnoreCase("FitLife")).map(ApplicationDto::getOwners).forEach(System.out::println);

        System.out.println("8.Find all owner email'");
        collection.stream().flatMap(a -> a.getOwners().stream()).map(Owner::getEmail).distinct().forEach(System.out::println);


    }
}
