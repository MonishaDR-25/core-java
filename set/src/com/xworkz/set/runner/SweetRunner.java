package com.xworkz.set.runner;

import com.xworkz.set.dto.SweetDto;
import com.xworkz.set.repository.SweetRepository;
import com.xworkz.set.repository.SweetRepositoryImpl;

import java.util.*;
import java.util.stream.Collectors;

public class SweetRunner {
    public static void main(String[] args) {

        SweetRepository sweetRepository=new SweetRepositoryImpl();
        Set<SweetDto> set=sweetRepository.findAll();

        System.out.println("Print all sweets");
        set.forEach(System.out::println);

        System.out.println(" Sort all elements by price in desc using TreeSet");
        Set<SweetDto> priceSorted = new TreeSet<>((a,b)->Double.compare(b.getPrice(), a.getPrice()));
        priceSorted.addAll(set);
        priceSorted.forEach(System.out::println);

        System.out.println("Sort all elements by name and price in desc");
        Set<SweetDto> sortedSet = set.stream().sorted(
                        Comparator.comparing(SweetDto::getName, Comparator.reverseOrder())
                                .thenComparing(Comparator.comparingDouble(SweetDto::getPrice).reversed())).collect(Collectors.toCollection(LinkedHashSet::new));
        sortedSet.forEach(System.out::println);

        System.out.println("\n---- Converted to LinkedList ----");
        List<SweetDto> list=new LinkedList<>(set);
        list.forEach(System.out::println);
    }
}
