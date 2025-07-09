package com.xworkz.map.runner;

import com.xworkz.map.dto.AddressDto;
import com.xworkz.map.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;

public class PersonAddressRunner {
    public static void main(String[] args) {

        PersonDto personDto1 = new PersonDto("Moni", "moni@gmail.com", "1234 5678 9012");
        PersonDto personDto2 = new PersonDto("Moni", "moni@gmail.com", "9999 8888 7777");
        PersonDto personDto3 = new PersonDto("Hansika", "hansika@com", "1234 5678 9012");
        PersonDto personDto4 = new PersonDto("Hansika", "hansika@com", "9999 8888 7777");
        PersonDto personDto5 = new PersonDto("Aarav", "aarav@gmail.com", "1111 2222 3333");
        PersonDto personDto6 = new PersonDto("Diya", "diya@gmail.com", "4444 5555 6666");
        PersonDto personDto7 = new PersonDto("Rahul", "rahul@gmail.com", "7777 8888 9999");
        PersonDto personDto8 = new PersonDto("Sita", "sita@abc.com", "9999 8888 7777");
        PersonDto personDto9 = new PersonDto("Ram", "ram@gmail.com", "6666 5555 4444");
        PersonDto personDto10 = new PersonDto("Krishna", "krishna@.com", "2222 3333 4444");
        PersonDto personDto11 = new PersonDto("Moni", "moni@com", "0000 1111 2222");
        PersonDto personDto12 = new PersonDto("Radha", "radha@.com", "3333 4444 5555");
        PersonDto personDto13 = new PersonDto("Kiran", "kiran@com", "1122 3344 5566");
        PersonDto personDto14 = new PersonDto("Neha", "neha@com", "2233 4455 6677");
        PersonDto personDto15 = new PersonDto("Ravi", "ravi@com", "3344 5566 7788");
        PersonDto personDto16 = new PersonDto("Anita", "anita@com", "4455 6677 8899");
        PersonDto personDto17 = new PersonDto("Rakesh", "rakesh@com", "5566 7788 9900");
        PersonDto personDto18 = new PersonDto("Pooja", "pooja@com", "6677 8899 0011");
        PersonDto personDto19 = new PersonDto("Nikhil", "nikhil@com", "7788 9900 1122");
        PersonDto personDto20 = new PersonDto("Suman", "suman@com", "8899 0011 2233");
        PersonDto personDto21 = new PersonDto("Moni", "moni@com", "1234 5678 9012");
        PersonDto personDto22 = new PersonDto("Gita", "gita@com", "9900 1122 3344");
        PersonDto personDto23 = new PersonDto("Harish", "harish@com", "1010 2020 3030");
        PersonDto personDto24 = new PersonDto("Preeti", "preeti@com", "2020 3030 4040");
        PersonDto personDto25 = new PersonDto("Yash", "yash@com", "5050 6060 7070");

        AddressDto address1 = new AddressDto(101, "1st Main", "Bangalore", 560001);
        AddressDto address2 = new AddressDto(102, "2nd Main", "Bangalore", 560002);
        AddressDto address3 = new AddressDto(103, "3rd Cross", "Chennai", 600003);
        AddressDto address4 = new AddressDto(104, "4th Cross", "Mysore", 570004);
        AddressDto address5 = new AddressDto(105, "5th Main", "Bangalore", 560005);
        AddressDto address6 = new AddressDto(106, "6th Main", "Hyderabad", 500006);
        AddressDto address7 = new AddressDto(107, "7th Cross", "Delhi", 110007);
        AddressDto address8 = new AddressDto(108, "8th Main", "Mumbai", 400008);
        AddressDto address9 = new AddressDto(109, "9th Street", "Kolkata", 700009);
        AddressDto address10 = new AddressDto(110, "10th Lane", "Pune", 411010);
        AddressDto address11 = new AddressDto(111, "11th Road", "Chennai", 600011);
        AddressDto address12 = new AddressDto(112, "12th Main", "Bangalore", 560012);
        AddressDto address13 = new AddressDto(113, "13th Cross", "Mumbai", 400013);
        AddressDto address14 = new AddressDto(114, "14th Street", "Delhi", 110014);
        AddressDto address15 = new AddressDto(115, "15th Avenue", "Pune", 411015);
        AddressDto address16 = new AddressDto(116, "16th Road", "Hyderabad", 500016);
        AddressDto address17 = new AddressDto(117, "17th Main", "Kolkata", 700017);
        AddressDto address18 = new AddressDto(118, "18th Cross", "Mysore", 570018);
        AddressDto address19 = new AddressDto(119, "19th Street", "Bangalore", 560019);
        AddressDto address20 = new AddressDto(120, "20th Lane", "Chennai", 600020);
        AddressDto address21 = new AddressDto(121, "21st Main", "Mumbai", 400021);
        AddressDto address22 = new AddressDto(122, "22nd Cross", "Delhi", 110022);
        AddressDto address23 = new AddressDto(123, "23rd Street", "Bangalore", 560023);
        AddressDto address24 = new AddressDto(124, "24th Avenue", "Chennai", 600024);
        AddressDto address25 = new AddressDto(125, "25th Road", "Mysore", 570025);

        Map<PersonDto, AddressDto> map = new HashMap<>();
        map.put(personDto1, address1);
        map.put(personDto2, address2);
        map.put(personDto3, address3);
        map.put(personDto4, address4);
        map.put(personDto5, address5);
        map.put(personDto6, address6);
        map.put(personDto7, address7);
        map.put(personDto8, address8);
        map.put(personDto9, address9);
        map.put(personDto10, address10);
        map.put(personDto11, address11);
        map.put(personDto12, address12);
        map.put(personDto13, address13);
        map.put(personDto14, address14);
        map.put(personDto15, address15);
        map.put(personDto16, address16);
        map.put(personDto17, address17);
        map.put(personDto18, address18);
        map.put(personDto19, address19);
        map.put(personDto20, address20);
        map.put(personDto21, address21);
        map.put(personDto22, address22);
        map.put(personDto23, address23);
        map.put(personDto24, address24);
        map.put(personDto25, address25);

        System.out.println("Loop only keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Loop only Values");
        map.values().forEach(System.out::println);


    }
}
