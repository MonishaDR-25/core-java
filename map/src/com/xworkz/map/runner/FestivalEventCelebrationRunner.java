package com.xworkz.map.runner;

import com.xworkz.map.dto.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FestivalEventCelebrationRunner {
    public static void main(String[] args) {

        Map<FestivalDto, Map<EventDto, CelebrationDto>> map = new HashMap<>();
        FestivalDto festival1 = new FestivalDto("Diwali", "India", "October");
        FestivalDto festival2 = new FestivalDto("Christmas", "USA", "December");
        FestivalDto festival3 = new FestivalDto("Eid", "UAE", "May");
        FestivalDto festival4 = new FestivalDto("Holi", "India", "March");
        FestivalDto festival5 = new FestivalDto("Thanksgiving", "USA", "November");
        FestivalDto festival6 = new FestivalDto("Lunar New Year", "China", "February");
        FestivalDto festival7 = new FestivalDto("Navratri", "India", "October");
        FestivalDto festival8 = new FestivalDto("Pongal", "India", "January");
        FestivalDto festival9 = new FestivalDto("Onam", "India", "August");
        FestivalDto festival10 = new FestivalDto("Bihu", "India", "April");
        FestivalDto festival11 = new FestivalDto("Easter", "Global", "April");
        FestivalDto festival12 = new FestivalDto("Vesak", "Sri Lanka", "May");
        FestivalDto festival13 = new FestivalDto("Ram Navami", "India", "April");
        FestivalDto festival14 = new FestivalDto("Gudi Padwa", "India", "March");
        FestivalDto festival15 = new FestivalDto("Ugadi", "India", "March");
        FestivalDto festival16 = new FestivalDto("Mahavir Jayanti", "India", "April");
        FestivalDto festival17 = new FestivalDto("Guru Nanak Jayanti", "India", "November");
        FestivalDto festival18 = new FestivalDto("Makar Sankranti", "India", "January");
        FestivalDto festival19 = new FestivalDto("Durga Puja", "India", "October");
        FestivalDto festival20 = new FestivalDto("Raksha Bandhan", "India", "August");
        FestivalDto festival21 = new FestivalDto("Karva Chauth", "India", "October");
        FestivalDto festival22 = new FestivalDto("Bastille Day", "France", "July");
        FestivalDto festival23 = new FestivalDto("Halloween", "USA", "October");
        FestivalDto festival24 = new FestivalDto("New Year", "Global", "January");
        FestivalDto festival25 = new FestivalDto("Good Friday", "Global", "April");

        EventDto event1 = new EventDto("Fireworks", 2023);
        EventDto event2 = new EventDto("Feast", 2023);
        EventDto event3 = new EventDto("Prayers", 2023);
        EventDto event4 = new EventDto("Color Throwing", 2023);
        EventDto event5 = new EventDto("Turkey Dinner", 2023);
        EventDto event6 = new EventDto("Dragon Dance", 2023);
        EventDto event7 = new EventDto("Garba Night", 2023);
        EventDto event8 = new EventDto("Harvest Cooking", 2023);
        EventDto event9 = new EventDto("Boat Race", 2023);
        EventDto event10 = new EventDto("Folk Dance", 2023);
        EventDto event11 = new EventDto("Easter Egg Hunt", 2023);
        EventDto event12 = new EventDto("Lantern Release", 2023);
        EventDto event13 = new EventDto("Ram Bhajans", 2023);
        EventDto event14 = new EventDto("New Year Parade", 2023);
        EventDto event15 = new EventDto("Ugadi Pachadi Making", 2023);
        EventDto event16 = new EventDto("Silent Procession", 2023);
        EventDto event17 = new EventDto("Prabhat Pheri", 2023);
        EventDto event18 = new EventDto("Kite Flying", 2023);
        EventDto event19 = new EventDto("Durga Idol Immersion", 2023);
        EventDto event20 = new EventDto("Rakhi Tying", 2023);
        EventDto event21 = new EventDto("Moon Sighting", 2023);
        EventDto event22 = new EventDto("Military Parade", 2023);
        EventDto event23 = new EventDto("Trick or Treat", 2023);
        EventDto event24 = new EventDto("Countdown Celebration", 2023);
        EventDto event25 = new EventDto("Church Mass", 2023);

        CelebrationDto celebration1 = new CelebrationDto("Religious", true);
        CelebrationDto celebration2 = new CelebrationDto("Cultural", true);
        CelebrationDto celebration3 = new CelebrationDto("Spiritual", true);
        CelebrationDto celebration4 = new CelebrationDto("Colorful", false);
        CelebrationDto celebration5 = new CelebrationDto("Traditional", true);
        CelebrationDto celebration6 = new CelebrationDto("Ethnic", false);
        CelebrationDto celebration7 = new CelebrationDto("Garba", true);
        CelebrationDto celebration8 = new CelebrationDto("Harvest", false);
        CelebrationDto celebration9 = new CelebrationDto("Sports", true);
        CelebrationDto celebration10 = new CelebrationDto("Folk", false);
        CelebrationDto celebration11 = new CelebrationDto("Christian", true);
        CelebrationDto celebration12 = new CelebrationDto("Buddhist", true);
        CelebrationDto celebration13 = new CelebrationDto("Hindu", true);
        CelebrationDto celebration14 = new CelebrationDto("Parade", false);
        CelebrationDto celebration15 = new CelebrationDto("Food", true);
        CelebrationDto celebration16 = new CelebrationDto("Silent", true);
        CelebrationDto celebration17 = new CelebrationDto("Community", false);
        CelebrationDto celebration18 = new CelebrationDto("Sky", false);
        CelebrationDto celebration19 = new CelebrationDto("Devotional", true);
        CelebrationDto celebration20 = new CelebrationDto("Bonding", true);
        CelebrationDto celebration21 = new CelebrationDto("Fasting", false);
        CelebrationDto celebration22 = new CelebrationDto("Historic", true);
        CelebrationDto celebration23 = new CelebrationDto("Fun", false);
        CelebrationDto celebration24 = new CelebrationDto("New Year", true);
        CelebrationDto celebration25 = new CelebrationDto("Peaceful", true);

        Map<EventDto, CelebrationDto> innerMap = new HashMap<>();
        innerMap.put(event1, celebration1);
        map.put(festival1, innerMap);
        innerMap.put(event2, celebration2);
        map.put(festival2, innerMap);
        innerMap.put(event3, celebration3);
        map.put(festival3, innerMap);
        innerMap.put(event4, celebration4);
        map.put(festival4, innerMap);
        innerMap.put(event5, celebration5);
        map.put(festival5, innerMap);
        innerMap.put(event6, celebration6);
        map.put(festival6, innerMap);
        innerMap.put(event7, celebration7);
        map.put(festival7, innerMap);
        innerMap.put(event8, celebration8);
        map.put(festival8, innerMap);
        innerMap.put(event9, celebration9);
        map.put(festival9, innerMap);
        innerMap.put(event10, celebration10);
        map.put(festival10, innerMap);
        innerMap.put(event11, celebration11);
        map.put(festival11, innerMap);
        innerMap.put(event12, celebration12);
        map.put(festival12, innerMap);
        innerMap.put(event13, celebration13);
        map.put(festival13, innerMap);
        innerMap.put(event14, celebration14);
        map.put(festival14, innerMap);
        innerMap.put(event15, celebration15);
        map.put(festival15, innerMap);
        innerMap.put(event16, celebration16);
        map.put(festival16, innerMap);
        innerMap.put(event17, celebration17);
        map.put(festival17, innerMap);
        innerMap.put(event18, celebration18);
        map.put(festival18, innerMap);
        innerMap.put(event19, celebration19);
        map.put(festival19, innerMap);
        innerMap.put(event20, celebration20);
        map.put(festival20, innerMap);
        innerMap.put(event21, celebration21);
        map.put(festival21, innerMap);
        innerMap.put(event22, celebration22);
        map.put(festival22, innerMap);
        innerMap.put(event23, celebration23);
        map.put(festival23, innerMap);
        innerMap.put(event24, celebration24);
        map.put(festival24, innerMap);
        innerMap.put(event25, celebration25);
        map.put(festival25, innerMap);

        System.out.println("===Keys===");
        map.keySet().forEach(System.out::println);

        System.out.println("=========Values======");
        map.values().forEach(System.out::println);


        map.forEach((festival, eventMap) -> {
            System.out.println("Festival: " + festival);
            eventMap.forEach((event, celebration) -> {
                System.out.println("  Event: " + event);
                System.out.println("    Celebration: " + celebration);
            });
        });

        System.out.println("Both key and value pair");
        Set<Map.Entry<FestivalDto, Map<EventDto, CelebrationDto>>> set=map.entrySet();
        set.forEach(e->{
            System.out.println("Key:"+e.getKey()+",value:"+e.getValue());

        });

//        System.out.println("=========OR==========");
//        Set<Map.Entry<FestivalDto, Map<EventDto, CelebrationDto>>> entrySet=map.entrySet();
//        entrySet.forEach(entry->{
//            FestivalDto festivalDto=entry.getKey();
//            EventDto eventDto= (EventDto) entry.getValue();
//            CelebrationDto celebrationDto= (CelebrationDto) entry.getValue();
//            System.out.println("festivalDto:"+festivalDto+",eventDto:"+eventDto+",CelebrationDto"+celebrationDto);
//        });

        System.out.println("Both key and value pair");
        map.entrySet().forEach(System.out::println);
    }
}
