package com.xworkz.map.runner;

import com.xworkz.map.dto.ProductDto;
import com.xworkz.map.dto.VendorDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductVendorRunner {
    public static void main(String[] args) {
        // Product Entries (some with duplicate name + price)
        ProductDto productDto1 = new ProductDto("Mixer", "Appliance", 3000, 101, 1);
        ProductDto productDto2 = new ProductDto("TV", "Electronics", 45000, 102, 2);
        ProductDto productDto3 = new ProductDto("Refrigerator", "Appliance", 25000, 103, 3);
        ProductDto productDto4 = new ProductDto("Oven", "Kitchen", 12000, 104, 4);
        ProductDto productDto5 = new ProductDto("Laptop", "Electronics", 70000, 105, 5);
        ProductDto productDto6 = new ProductDto("Mixer", "Kitchen", 3000, 106, 6);
        ProductDto productDto7 = new ProductDto("Washing Machine", "Appliance", 28000, 107, 7);
        ProductDto productDto8 = new ProductDto("Fan", "Electronics", 2200, 108, 8);
        ProductDto productDto9 = new ProductDto("Iron", "Appliance", 1500, 109, 9);
        ProductDto productDto10 = new ProductDto("Smartphone", "Electronics", 25000, 110, 10);
        ProductDto productDto11 = new ProductDto("Router", "Electronics", 2000, 111, 11);
        ProductDto productDto12 = new ProductDto("Tablet", "Electronics", 18000, 112, 12);
        ProductDto productDto13 = new ProductDto("AC", "Appliance", 35000, 113, 13);
        ProductDto productDto14 = new ProductDto("Blender", "Kitchen", 2500, 114, 14);
        ProductDto productDto15 = new ProductDto("Heater", "Electronics", 4000, 115, 15);
        ProductDto productDto16 = new ProductDto("Laptop", "Computer", 70000, 116, 16);
        ProductDto productDto17 = new ProductDto("Water Purifier", "Appliance", 9000, 117, 17);
        ProductDto productDto18 = new ProductDto("Camera", "Electronics", 55000, 118, 18);
        ProductDto productDto19 = new ProductDto("Toaster", "Kitchen", 1700, 119, 19);
        ProductDto productDto20 = new ProductDto("Printer", "Electronics", 12000, 120, 20);
        ProductDto productDto21 = new ProductDto("Microwave", "Kitchen", 11000, 121, 21);
        ProductDto productDto22 = new ProductDto("Speaker", "Electronics", 8000, 122, 22);
        ProductDto productDto23 = new ProductDto("Kettle", "Kitchen", 2300, 123, 23);
        ProductDto productDto24 = new ProductDto("Monitor", "Electronics", 15000, 124, 24);
        ProductDto productDto25 = new ProductDto("TV", "Smart", 45000, 125, 25);

        VendorDto vendorDto1 = new VendorDto("Vijay Traders", "GST101", LocalDate.of(2010, 5, 15));
        VendorDto vendorDto2 = new VendorDto("ElectroMart", "GST102", LocalDate.of(2012, 8, 20));
        VendorDto vendorDto3 = new VendorDto("KitchenHub", "GST103", LocalDate.of(2015, 2, 5));
        VendorDto vendorDto4 = new VendorDto("GadgetPoint", "GST104", LocalDate.of(2018, 3, 18));
        VendorDto vendorDto5 = new VendorDto("Digital World", "GST105", LocalDate.of(2020, 1, 10));
        VendorDto vendorDto6 = new VendorDto("Vijay Traders", "GST101", LocalDate.of(2010, 5, 15));
        VendorDto vendorDto7 = new VendorDto("HomeNeeds", "GST106", LocalDate.of(2011, 7, 9));
        VendorDto vendorDto8 = new VendorDto("ElectroMart", "GST102", LocalDate.of(2012, 8, 20));
        VendorDto vendorDto9 = new VendorDto("CoolTech", "GST107", LocalDate.of(2016, 4, 22));
        VendorDto vendorDto10 = new VendorDto("MobilePlanet", "GST108", LocalDate.of(2019, 11, 11));
        VendorDto vendorDto11 = new VendorDto("NetShop", "GST109", LocalDate.of(2017, 9, 27));
        VendorDto vendorDto12 = new VendorDto("CompuZone", "GST110", LocalDate.of(2021, 6, 30));
        VendorDto vendorDto13 = new VendorDto("FreezeMart", "GST111", LocalDate.of(2014, 12, 12));
        VendorDto vendorDto14 = new VendorDto("Digital World", "GST105", LocalDate.of(2020, 1, 10));
        VendorDto vendorDto15 = new VendorDto("HeatLine", "GST112", LocalDate.of(2023, 3, 8));
        VendorDto vendorDto16 = new VendorDto("ClickStore", "GST113", LocalDate.of(2010, 10, 1));
        VendorDto vendorDto17 = new VendorDto("HygienePlus", "GST114", LocalDate.of(2012, 2, 2));
        VendorDto vendorDto18 = new VendorDto("ZoomLens", "GST115", LocalDate.of(2019, 9, 19));
        VendorDto vendorDto19 = new VendorDto("Toastie", "GST116", LocalDate.of(2013, 6, 6));
        VendorDto vendorDto20 = new VendorDto("CoolTech", "GST107", LocalDate.of(2016, 4, 22));
        VendorDto vendorDto21 = new VendorDto("HeatKing", "GST117", LocalDate.of(2011, 1, 1));
        VendorDto vendorDto22 = new VendorDto("SoundBeats", "GST118", LocalDate.of(2022, 5, 5));
        VendorDto vendorDto23 = new VendorDto("QuickBoil", "GST119", LocalDate.of(2018, 8, 8));
        VendorDto vendorDto24 = new VendorDto("NetShop", "GST109", LocalDate.of(2017, 9, 27));
        VendorDto vendorDto25 = new VendorDto("SmartScreen", "GST120", LocalDate.of(2016, 12, 25));

        Map<ProductDto, VendorDto> map = new HashMap<>();

        map.put(productDto1, vendorDto1);
        map.put(productDto2, vendorDto2);
        map.put(productDto3, vendorDto3);
        map.put(productDto4, vendorDto4);
        map.put(productDto5, vendorDto5);
        map.put(productDto6, vendorDto6);
        map.put(productDto7, vendorDto7);
        map.put(productDto8, vendorDto8);
        map.put(productDto9, vendorDto9);
        map.put(productDto10, vendorDto10);
        map.put(productDto11, vendorDto11);
        map.put(productDto12, vendorDto12);
        map.put(productDto13, vendorDto13);
        map.put(productDto14, vendorDto14);
        map.put(productDto15, vendorDto15);
        map.put(productDto16, vendorDto16);
        map.put(productDto17, vendorDto17);
        map.put(productDto18, vendorDto18);
        map.put(productDto19, vendorDto19);
        map.put(productDto20, vendorDto20);
        map.put(productDto21, vendorDto21);
        map.put(productDto22, vendorDto22);
        map.put(productDto23, vendorDto23);
        map.put(productDto24, vendorDto24);
        map.put(productDto25, vendorDto25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);



    }
}
