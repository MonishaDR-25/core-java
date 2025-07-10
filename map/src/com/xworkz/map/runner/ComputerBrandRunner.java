package com.xworkz.map.runner;

import com.xworkz.map.dto.BrandDto;
import com.xworkz.map.dto.ComputerDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ComputerBrandRunner {
    public static void main(String[] args) {
        ComputerDto computerDto1 = new ComputerDto("Inspiron", "Intel i5", 8, "SN101");
        ComputerDto computerDto2 = new ComputerDto("Pavilion", "Intel i7", 16, "SN102");
        ComputerDto computerDto3 = new ComputerDto("MacBook Air", "M1", 8, "SN103");
        ComputerDto computerDto4 = new ComputerDto("MacBook Pro", "M2", 16, "SN104");
        ComputerDto computerDto5 = new ComputerDto("ThinkPad", "Intel i5", 8, "SN105");
        ComputerDto computerDto6 = new ComputerDto("Inspiron", "Intel i5", 8, "SN106");
        ComputerDto computerDto7 = new ComputerDto("EliteBook", "AMD Ryzen 5", 16, "SN107");
        ComputerDto computerDto8 = new ComputerDto("IdeaPad", "Intel i3", 4, "SN108");
        ComputerDto computerDto9 = new ComputerDto("Predator", "Intel i9", 32, "SN109");
        ComputerDto computerDto10 = new ComputerDto("ZenBook", "Intel i7", 16, "SN110");
        ComputerDto computerDto11 = new ComputerDto("Swift", "Intel i5", 8, "SN111");
        ComputerDto computerDto12 = new ComputerDto("Aspire", "Intel i5", 8, "SN112");
        ComputerDto computerDto13 = new ComputerDto("Surface Pro", "Intel i7", 16, "SN113");
        ComputerDto computerDto14 = new ComputerDto("MacBook Air", "M1", 8, "SN114");
        ComputerDto computerDto15 = new ComputerDto("ThinkBook", "Intel i5", 8, "SN115");
        ComputerDto computerDto16 = new ComputerDto("VivoBook", "AMD Ryzen 7", 16, "SN116");
        ComputerDto computerDto17 = new ComputerDto("Legion", "Intel i7", 32, "SN117");
        ComputerDto computerDto18 = new ComputerDto("ROG", "Intel i9", 32, "SN118");
        ComputerDto computerDto19 = new ComputerDto("Gram", "Intel i5", 8, "SN119");
        ComputerDto computerDto20 = new ComputerDto("XPS", "Intel i7", 16, "SN120");
        ComputerDto computerDto21 = new ComputerDto("ProBook", "Intel i5", 8, "SN121");
        ComputerDto computerDto22 = new ComputerDto("Chromebook", "ARM", 4, "SN122");
        ComputerDto computerDto23 = new ComputerDto("Latitude", "Intel i5", 8, "SN123");
        ComputerDto computerDto24 = new ComputerDto("Yoga", "Intel i7", 16, "SN124");
        ComputerDto computerDto25 = new ComputerDto("Pavilion", "Intel i7", 16, "SN125");

        BrandDto brandDto1 = new BrandDto("Dell", "USA", 1984, "Michael Dell");
        BrandDto brandDto2 = new BrandDto("HP", "USA", 1939, "Bill Hewlett");
        BrandDto brandDto3 = new BrandDto("Apple", "USA", 1976, "Steve Jobs");
        BrandDto brandDto4 = new BrandDto("Lenovo", "China", 1984, "Liu Chuanzhi");
        BrandDto brandDto5 = new BrandDto("Asus", "Taiwan", 1989, "T.H. Tung");
        BrandDto brandDto6 = new BrandDto("Dell", "USA", 1984, "Michael Dell");
        BrandDto brandDto7 = new BrandDto("Acer", "Taiwan", 1976, "Stan Shih");
        BrandDto brandDto8 =new BrandDto("HP", "USA", 1939, "Bill Hewlett");
        BrandDto brandDto9 = new BrandDto("Microsoft", "USA", 1975, "Bill Gates");
        BrandDto brandDto10 = new BrandDto("Samsung", "South Korea", 1938, "Lee Byung-chul");
        BrandDto brandDto11 = new BrandDto("HP", "USA", 1939, "Bill Hewlett");
        BrandDto brandDto12 = new BrandDto("LG", "South Korea", 1958, "Koo In-hwoi");
        BrandDto brandDto13 = new BrandDto("Huawei", "China", 1987, "Ren Zhengfei");
        BrandDto brandDto14 = new BrandDto("Lenovo", "China", 1984, "Liu Chuanzhi");
        BrandDto brandDto15 = new BrandDto("Intel", "USA", 1968, "Gordon Moore");
        BrandDto brandDto16 = new BrandDto("Asus", "Taiwan", 1989, "T.H. Tung");
        BrandDto brandDto17 = new BrandDto("Razer", "USA", 2005, "Min-Liang Tan");
        BrandDto brandDto18 = new BrandDto("Sony", "Japan", 1946, "Masaru Ibuka");
        BrandDto brandDto19 = new BrandDto("Microsoft", "USA", 1975, "Bill Gates");
        BrandDto brandDto20 = new BrandDto("Toshiba", "Japan", 1939, "Tanaka Hisashige");
        BrandDto brandDto21 =new BrandDto("Dell", "USA", 1984, "Michael Dell");
        BrandDto brandDto22 = new BrandDto("HP", "USA", 1939, "Bill Hewlett");
        BrandDto brandDto23 = new BrandDto("Apple", "USA", 1976, "Steve Jobs");
        BrandDto brandDto24 = new BrandDto("Lenovo", "China", 1984, "Liu Chuanzhi");
        BrandDto brandDto25 =new BrandDto("Asus", "Taiwan", 1989, "T.H. Tung");

        Map<ComputerDto,BrandDto> map=new HashMap<>();
        map.put(computerDto1, brandDto1);
        map.put(computerDto2, brandDto2);
        map.put(computerDto3, brandDto3);
        map.put(computerDto4, brandDto4);
        map.put(computerDto5, brandDto5);
        map.put(computerDto6, brandDto6);
        map.put(computerDto7, brandDto7);
        map.put(computerDto8, brandDto8);
        map.put(computerDto9, brandDto9);
        map.put(computerDto10, brandDto10);
        map.put(computerDto11, brandDto11);
        map.put(computerDto12, brandDto12);
        map.put(computerDto13, brandDto13);
        map.put(computerDto14, brandDto14);
        map.put(computerDto15, brandDto15);
        map.put(computerDto16, brandDto16);
        map.put(computerDto17, brandDto17);
        map.put(computerDto18, brandDto18);
        map.put(computerDto19, brandDto19);
        map.put(computerDto20, brandDto20);
        map.put(computerDto21, brandDto21);
        map.put(computerDto22, brandDto22);
        map.put(computerDto23, brandDto23);
        map.put(computerDto24, brandDto24);
        map.put(computerDto25, brandDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);


        System.out.println("Both key and value pair");
        Set<Map.Entry<ComputerDto,BrandDto>> set=map.entrySet();
       set.forEach(e->{
           System.out.println("Key:"+e.getKey()+",value:"+e.getValue());

       });

        System.out.println("=========OR==========");
        Set<Map.Entry<ComputerDto,BrandDto>> entrySet=map.entrySet();
        entrySet.forEach(entry->{
            ComputerDto computerDto=entry.getKey();
            BrandDto brandDto=entry.getValue();
            System.out.println("ComputerDto:"+computerDto+",BrandDto:"+brandDto);
        });

        System.out.println("Both key and value pair");
        map.entrySet().forEach(System.out::println);

    }
}
