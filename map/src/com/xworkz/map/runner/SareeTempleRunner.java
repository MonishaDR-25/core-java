package com.xworkz.map.runner;

import com.xworkz.map.dto.SareeDto;
import com.xworkz.map.dto.TempleDto;

import java.util.HashMap;
import java.util.Map;

public class SareeTempleRunner {
    public static void main(String[] args) {
        SareeDto saree1 = new SareeDto("Nalli", "Red", 3500);
        SareeDto saree2 = new SareeDto("RMKV", "Green", 4000);
        SareeDto saree3 = new SareeDto("Pothys", "Pink", 3200);
        SareeDto saree4 = new SareeDto("Chennai Silks", "Blue", 2800);
        SareeDto saree5 = new SareeDto("Sundari Silks", "Yellow", 3000);
        SareeDto saree6 = new SareeDto("Kalaniketan", "Orange", 2700);
        SareeDto saree7 = new SareeDto("Kalanjali", "Purple", 3600);
        SareeDto saree8 = new SareeDto("RMKV", "Blue", 4100);
        SareeDto saree9 = new SareeDto("Pothys", "Maroon", 3300);
        SareeDto saree10 = new SareeDto("Sundari Silks", "Cream", 2950);
        SareeDto saree11 = new SareeDto("Chennai Silks", "Sky Blue", 2850);
        SareeDto saree12 = new SareeDto("Pothys", "Red", 3400);
        SareeDto saree13 = new SareeDto("RMKV", "Orange", 3950);
        SareeDto saree14 = new SareeDto("Kalaniketan", "Green", 3100);
        SareeDto saree15 = new SareeDto("Nalli", "Pink", 3550);
        SareeDto saree16 = new SareeDto("Chennai Silks", "Peach", 2700);
        SareeDto saree17 = new SareeDto("Sundari Silks", "Grey", 3000);
        SareeDto saree18 = new SareeDto("Kalanjali", "Golden", 3200);
        SareeDto saree19 = new SareeDto("Pothys", "Magenta", 3400);
        SareeDto saree20 = new SareeDto("Nalli", "Red", 3500);
        SareeDto saree21 = new SareeDto("RMKV", "Green", 4000);
        SareeDto saree22 = new SareeDto("Pothys", "Pink", 3200);;
        SareeDto saree23 = new SareeDto("Chennai Silks", "Lavender", 2700);
        SareeDto saree24 = new SareeDto("Sundari Silks", "Silver", 3100);
        SareeDto saree25 = new SareeDto("Kalaniketan", "Indigo", 3250);


        TempleDto[] temples1 = {
                new TempleDto("Meenakshi", "Madurai", 1600, true),
                new TempleDto("Kapaleeshwarar", "Chennai", 1300, true)};
        TempleDto[] temples2 = {
                new TempleDto("Brihadeeswara", "Thanjavur", 1010, true),
                new TempleDto("Annamalaiyar", "Tiruvannamalai", 900, true)};
        TempleDto[] temples3 = {
                new TempleDto("Srirangam", "Trichy", 1200, true),
                new TempleDto("Murugan", "Palani", 800, true)};
        TempleDto[] temples4 = {
                new TempleDto("Kanchi Kamakshi", "Kanchipuram", 1000, true),
                new TempleDto("Shore Temple", "Mahabalipuram", 700, false)};
        TempleDto[] temples5 = {
                new TempleDto("Ranganathaswamy", "Srirangam", 1200, true),
                new TempleDto("Jambukeswarar", "Thiruvanaikaval", 950, true)};
        TempleDto[] temples6 = {
                new TempleDto("Ekambareswarar", "Kanchipuram", 900, true),
                new TempleDto("Thyagaraja", "Thiruvarur", 850, true)};
        TempleDto[] temples7 = {
                new TempleDto("Rajagopalaswamy", "Mannargudi", 1100, true),
                new TempleDto("Soundararajaperumal", "Thadikombu", 890, false)};
        TempleDto[] temples8 = {
                new TempleDto("Vadapalani", "Chennai", 200, false),
                new TempleDto("Ayyappan Temple", "Sabarimala", 1500, true)};
        TempleDto[] temples9 = {
                new TempleDto("Mahalingeswarar", "Thiruvidaimarudur", 950, true),
                new TempleDto("Thirunallar", "Karaikal", 1000, false)};
        TempleDto[] temples10 = {
                new TempleDto("Thillai Nataraja", "Chidambaram", 1100, true),
                new TempleDto("Kailasanathar", "Kanchipuram", 800, true)};
        TempleDto[] temples11 = {
                new TempleDto("Subramanya Swamy", "Tiruttani", 1200, true),
                new TempleDto("Thiruchendur", "Thoothukudi", 950, true)};
        TempleDto[] temples12 = {
                new TempleDto("Rameswaram", "Rameswaram", 1200, true),
                new TempleDto("Suchindram", "Kanyakumari", 800, true)};
        TempleDto[] temples13 = {
                new TempleDto("Kanchi Kailasanathar", "Kanchipuram", 700, true),
                new TempleDto("Vaitheeswaran Koil", "Mayiladuthurai", 900, true)};
        TempleDto[] temples14 = {
                new TempleDto("Navagraha Temple", "Suryanar", 1100, true),
                new TempleDto("Agneeswarar", "Kumbakonam", 850, true)};
        TempleDto[] temples15 = {
                new TempleDto("Sankaranarayanar", "Sankaran Koil", 1300, true),
                new TempleDto("Vellore Golden Temple", "Vellore", 2010, true)};
        TempleDto[] temples16 = {
                new TempleDto("Arunachaleswarar", "Thiruvannamalai", 1300, true),
                new TempleDto("Sathyanatheswarar", "Thirukattupalli", 950, false)};
        TempleDto[] temples17 = {
                new TempleDto("Sri Yoga Narasimha", "Sholinghur", 1000, true),
                new TempleDto("Shiva Temple", "Kollidam", 850, false)};
        TempleDto[] temples18 = {
                new TempleDto("Andal Temple", "Srivilliputhur", 1000, true),
                new TempleDto("Thirumohoor", "Madurai", 900, false)};
        TempleDto[] temples19 = {
                new TempleDto("Perur Pateeswarar", "Coimbatore", 900, true),
                new TempleDto("Masaniamman", "Pollachi", 800, false)};
        TempleDto[] temples20 = {
                new TempleDto("Meenakshi", "Madurai", 1600, true),
                new TempleDto("Kapaleeshwarar", "Chennai", 1300, true)};
        TempleDto[] temples21 = {
                new TempleDto("Brihadeeswara", "Thanjavur", 1010, true),
                new TempleDto("Annamalaiyar", "Tiruvannamalai", 900, true)};
        TempleDto[] temples22 = {
                new TempleDto("Srirangam", "Trichy", 1200, true),
                new TempleDto("Murugan", "Palani", 800, true)};
        TempleDto[] temples23 = {
                new TempleDto("Aruppukottai Temple", "Virudhunagar", 950, true),
                new TempleDto("Bhavani Sangameswarar", "Bhavani", 950, true)};
        TempleDto[] temples24 = {
                new TempleDto("Neelakanteswarar", "Kanchipuram", 850, true),
                new TempleDto("Pasupathiswarar", "Aavudayarkoil", 950, false)};
        TempleDto[] temples25 = {
                new TempleDto("Dharbaranyeswarar", "Thirunallar", 1100, true),
                new TempleDto("Thiruketheeswaram", "Mannar", 900, false)};

        Map<SareeDto,TempleDto[]> map=new HashMap<>();
        map.put(saree1, temples1);
        map.put(saree2, temples2);
        map.put(saree3, temples3);
        map.put(saree4, temples4);
        map.put(saree5, temples5);
        map.put(saree6, temples6);
        map.put(saree7, temples7);
        map.put(saree8, temples8);
        map.put(saree9, temples9);
        map.put(saree10, temples10);
        map.put(saree11, temples11);
        map.put(saree12, temples12);
        map.put(saree13, temples13);
        map.put(saree14, temples14);
        map.put(saree15, temples15);
        map.put(saree16, temples16);
        map.put(saree17, temples17);
        map.put(saree18, temples18);
        map.put(saree19, temples19);
        map.put(saree20, temples20);
        map.put(saree21, temples21);
        map.put(saree22, temples22);
        map.put(saree23, temples23);
        map.put(saree24, temples24);
        map.put(saree25, temples25);

        System.out.println("Keys");
        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(array->{
            for(TempleDto temple:array){
                System.out.println(temple);
            }
        });

    }
}
