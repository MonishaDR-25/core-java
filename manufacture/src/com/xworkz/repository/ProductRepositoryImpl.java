package com.xworkz.repository;

import com.xworkz.dto.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public Collection<ProductDto> findAll() {

        ProductDto productDto1=new ProductDto(1,"HairDryer","Electronics",LocalDate.of(2025,3,12),"Philips",2000,15,20,2);
        ProductDto productDto2=new ProductDto(2,"Furniture","Sofa",LocalDate.of(2024,12,23),"Ikea",12000,12,1,24);
        ProductDto productDto3=new ProductDto(3,"Mixer","Grinder",LocalDate.of(2025,2,8),"Preethi",5000,10,5,6);
        ProductDto productDto4=new ProductDto(4,"Straightner","Electronics",LocalDate.of(2024,12,19),"Panasonic",4000,12,1,22);
        ProductDto productDto5=new ProductDto(5, "Refrigerator", "Appliances", LocalDate.of(2023, 10, 10), "LG", 22000, 18, 2, 36);
        ProductDto productDto6=new ProductDto(6, "Induction Stove", "Appliances", LocalDate.of(2025, 1, 15), "Prestige", 4500, 10, 6, 1);
        ProductDto productDto7=new ProductDto(7, "Television", "Electronics", LocalDate.of(2024, 5, 1), "Sony", 30000, 20, 3, 36);
        ProductDto productDto8=new ProductDto(8, "Table Fan", "Electronics", LocalDate.of(2025, 2, 14), "Usha", 2500, 7, 10, 12);
        ProductDto productDto9=new ProductDto(9, "Water Purifier", "Appliances", LocalDate.of(2023, 8, 30), "Kent", 8000, 15, 4, 24);
        ProductDto productDto10=new ProductDto(10, "Dining Table", "Furniture", LocalDate.of(2024, 6, 5), "Durian", 15000, 12, 1, 60);
        ProductDto productDto11=new ProductDto(11, "Ceiling Fan", "Electronics", LocalDate.of(2024, 7, 11), "Havells", 3000, 5, 7, 24);
        ProductDto productDto12=new ProductDto(12, "Pressure Cooker", "Kitchen", LocalDate.of(2025, 3, 3), "Butterfly", 2200, 8, 12, 18);
        ProductDto productDto13=new ProductDto(13, "Bed", "Furniture", LocalDate.of(2024, 10, 17), "Godrej", 18000, 10, 1, 48);
        ProductDto productDto14=new ProductDto(14, "Electric Kettle", "Appliances", LocalDate.of(2023, 11, 9), "Morphy Richards", 2800, 9, 5, 12);
        ProductDto productDto15=new ProductDto(15, "Laptop Table", "Furniture", LocalDate.of(2024, 1, 25), "Urban Ladder", 3200, 6, 2, 24);
        ProductDto productDto16=new ProductDto(16, "Toaster", "Kitchen", LocalDate.of(2025, 4, 1), "Bajaj", 1600, 4, 3, 12);
        ProductDto productDto17=new ProductDto(17, "Wall Clock", "Decor", LocalDate.of(2023, 12, 21), "Ajanta", 1000, 3, 8, 12);
        ProductDto productDto18=new ProductDto(18, "Washing Machine", "Appliances", LocalDate.of(2024, 9, 18), "Samsung", 25000, 20, 2, 1);
        ProductDto productDto19=new ProductDto(19, "Air Conditioner", "Electronics", LocalDate.of(2024, 3, 30), "Voltas", 38000, 22, 1, 36);
        ProductDto productDto20=new ProductDto(20, "Vacuum Cleaner", "Appliances", LocalDate.of(2023, 6, 12), "Eureka Forbes", 7000, 10, 3, 24);
        ProductDto productDto21=new ProductDto(21, "Mattress", "Furniture", LocalDate.of(2025, 2, 22), "Sleepwell", 9500, 15, 1, 2);
        ProductDto productDto22=new ProductDto(22, "Curtains", "Decor", LocalDate.of(2024, 8, 5), "Home Centre", 1800, 5, 6, 12);
        ProductDto productDto23=new ProductDto(23, "Bookshelf", "Furniture", LocalDate.of(2024, 7, 8), "Nilkamal", 5500, 12, 2, 2);
        ProductDto productDto24=new ProductDto(24, "Rice Cooker", "Appliances", LocalDate.of(2024, 9, 27), "Panasonic", 3000, 6, 4, 18);
        ProductDto productDto25=new ProductDto(25, "CCTV Camera", "Electronics", LocalDate.of(2024, 5, 19), "CP Plus", 4500, 10, 2, 24);
        ProductDto productDto26=new ProductDto(26, "Bluetooth Speaker", "Electronics", LocalDate.of(2023, 4, 1), "Boat", 2000, 15, 7, 12);
        ProductDto productDto27=new ProductDto(27, "Smart Watch", "Electronics", LocalDate.of(2025, 1, 30), "Noise", 3500, 8, 3, 12);
        ProductDto productDto28=new ProductDto(28, "Iron Box", "Appliances", LocalDate.of(2024, 11, 10), "Orient", 1800, 6, 4, 24);
        ProductDto productDto29=new ProductDto(29, "LED Bulbs", "Lighting", LocalDate.of(2023, 12, 3), "Syska", 300, 2, 20, 6);
        ProductDto productDto30=new ProductDto(30, "Extension Board", "Electronics", LocalDate.of(2024, 2, 14), "GM", 900, 3, 10, 12);
        ProductDto productDto31=new ProductDto(31, "Chopper", "Kitchen", LocalDate.of(2025, 2, 17), "Wonderchef", 1600, 7, 6, 12);
        ProductDto productDto32=new ProductDto(32, "Gas Stove", "Kitchen", LocalDate.of(2024, 3, 23), "Sunflame", 5600, 10, 2, 24);
        ProductDto productDto33=new ProductDto(33, "Inverter", "Electronics", LocalDate.of(2023, 5, 8), "Luminous", 11000, 12, 1, 2);
        ProductDto productDto34=new ProductDto(34, "Books", "Stationery", LocalDate.of(2025, 1, 1), "Penguin", 600, 5, 10, 12);
        ProductDto productDto35=new ProductDto(35, "Study Chair", "Furniture", LocalDate.of(2023, 6, 4), "Featherlite", 3800, 9, 2, 1);
        ProductDto productDto36=new ProductDto(36, "Photo Frame", "Decor", LocalDate.of(2024, 12, 12), "DecoWorld", 1500, 3, 8, 12);
        ProductDto productDto37=new ProductDto(37, "Thermos Flask", "Kitchen", LocalDate.of(2023, 10, 10), "Milton", 800, 6, 5, 18);
        ProductDto productDto38=new ProductDto(38, "Pen Set", "Stationery", LocalDate.of(2024, 1, 11), "Reynolds", 250, 2, 15, 6);
        ProductDto productDto39=new ProductDto(39, "Notebook", "Stationery", LocalDate.of(2025, 3, 14), "Classmate", 80, 1, 20, 6);
        ProductDto productDto40=new ProductDto(40, "Toothbrush", "Personal Care", LocalDate.of(2025, 5, 25), "Colgate", 50, 0, 30, 3);
        ProductDto productDto41=new ProductDto(41, "Shampoo", "Personal Care", LocalDate.of(2024, 11, 20), "Dove", 300, 5, 12, 6);
        ProductDto productDto42=new ProductDto(42, "Face Cream", "Personal Care", LocalDate.of(2023, 9, 14), "Himalaya", 150, 3, 10, 6);
        ProductDto productDto43=new ProductDto(43, "Toilet Cleaner", "Household", LocalDate.of(2025, 2, 2), "Harpic", 120, 2, 8, 6);
        ProductDto productDto44=new ProductDto(44, "Floor Mop", "Household", LocalDate.of(2024, 7, 30), "Scotch-Brite", 600, 5, 5, 12);

        Collection<ProductDto> collection=new ArrayList<>();
        collection.add(productDto1);
        collection.add(productDto2);
        collection.add(productDto3);
        collection.add(productDto4);
        collection.add(productDto5);
        collection.add(productDto6);
        collection.add(productDto7);
        collection.add(productDto8);
        collection.add(productDto9);
        collection.add(productDto10);
        collection.add(productDto11);
        collection.add(productDto12);
        collection.add(productDto13);
        collection.add(productDto14);
        collection.add(productDto15);
        collection.add(productDto16);
        collection.add(productDto17);
        collection.add(productDto18);
        collection.add(productDto19);
        collection.add(productDto20);
        collection.add(productDto21);
        collection.add(productDto22);
        collection.add(productDto23);
        collection.add(productDto24);
        collection.add(productDto25);
        collection.add(productDto26);
        collection.add(productDto27);
        collection.add(productDto28);
        collection.add(productDto29);
        collection.add(productDto30);
        collection.add(productDto31);
        collection.add(productDto32);
        collection.add(productDto33);
        collection.add(productDto34);
        collection.add(productDto35);
        collection.add(productDto36);
        collection.add(productDto37);
        collection.add(productDto38);
        collection.add(productDto39);
        collection.add(productDto40);
        collection.add(productDto41);
        collection.add(productDto42);
        collection.add(productDto43);
        collection.add(productDto44);


        return collection;
    }
}
