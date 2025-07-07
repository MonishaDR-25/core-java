package com.xworkz.repository;

import com.xworkz.dto.ApplicationDto;
import com.xworkz.dto.Owner;
import com.xworkz.enums.AppType;
import com.xworkz.enums.Version;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;


public class ApplicationRepositoryImpl implements ApplicationRepository{
    @Override
    public Collection<ApplicationDto> findAll() {

        ApplicationDto app1 = new ApplicationDto("TaskMaster", Version.V1_0, LocalDate.of(2022, 1, 10), 25.0, AppType.PRODUCTIVITY, true, 0, Arrays.asList(new Owner("Rahul", "rahul@example.com", 9876543210L)));
        ApplicationDto app2 = new ApplicationDto("StudyBuddy", Version.V2_0, LocalDate.of(2023, 3, 5), 30.5, AppType.EDUCATION, false, 99.99, Arrays.asList(new Owner("Sneha", "sneha@example.com", 9876543211L)));
        ApplicationDto app3 = new ApplicationDto("HealthTrack", Version.V3_0, LocalDate.of(2024, 5, 18), 45.2, AppType.HEALTH, true, 0, Arrays.asList(new Owner("Arjun", "arjun@example.com", 9876543212L)));
        ApplicationDto app4 = new ApplicationDto("ChatZone", Version.V1_1, LocalDate.of(2023, 7, 22), 50.0, AppType.SOCIAL, false, 49.0, Arrays.asList(new Owner("Priya", "priya@example.com", 9876543213L)));
        ApplicationDto app5 = new ApplicationDto("MovieTime", Version.V2_1, LocalDate.of(2021, 8, 30), 70.1, AppType.ENTERTAINMENT, true, 0, Arrays.asList(new Owner("Karan", "karan@example.com", 9876543214L)));
        ApplicationDto app6 = new ApplicationDto("CodeEditor", Version.V1_0, LocalDate.of(2023, 6, 11), 22.3, AppType.PRODUCTIVITY, false, 19.99, Arrays.asList(new Owner("Divya", "divya@example.com", 9876543215L)));
        ApplicationDto app7 = new ApplicationDto("QuizTime", Version.V2_0, LocalDate.of(2022, 9, 14), 18.9, AppType.EDUCATION, true, 0, Arrays.asList(new Owner("Raj", "raj@example.com", 9876543216L)));
        ApplicationDto app8 = new ApplicationDto("FitLife", Version.V3_0, LocalDate.of(2024, 4, 8), 55.0, AppType.HEALTH, false, 59.0, Arrays.asList(new Owner("Anita", "anita@example.com", 9876543217L)));
        ApplicationDto app9 = new ApplicationDto("InstaChat", Version.V1_1, LocalDate.of(2023, 1, 25), 60.2, AppType.SOCIAL, true, 0, Arrays.asList(new Owner("Aman", "aman@example.com", 9876543218L)));
        ApplicationDto app10 = new ApplicationDto("StreamBox", Version.V2_1, LocalDate.of(2021, 5, 30), 75.6, AppType.ENTERTAINMENT, false, 79.0, Arrays.asList(new Owner("Meena", "meena@example.com", 9876543219L)));
        ApplicationDto app11 = new ApplicationDto("NoteTaker", Version.V1_0, LocalDate.of(2022, 2, 14), 15.4, AppType.PRODUCTIVITY, true, 0, Arrays.asList(new Owner("Manoj", "manoj@example.com", 9876543220L)));
        ApplicationDto app12 = new ApplicationDto("LearnPlus", Version.V2_0, LocalDate.of(2023, 4, 9), 27.1, AppType.EDUCATION, false, 49.0, Arrays.asList(new Owner("Geeta", "geeta@example.com", 9876543221L)));
        ApplicationDto app13 = new ApplicationDto("MediCheck", Version.V3_0, LocalDate.of(2024, 6, 22), 33.3, AppType.HEALTH, true, 0, Arrays.asList(new Owner("Nikhil", "nikhil@example.com", 9876543222L)));
        ApplicationDto app14 = new ApplicationDto("BuzzTalk", Version.V1_1, LocalDate.of(2023, 8, 15), 48.0, AppType.SOCIAL, false, 29.0, Arrays.asList(new Owner("Deepa", "deepa@example.com", 9876543223L)));
        ApplicationDto app15 = new ApplicationDto("FunStream", Version.V2_1, LocalDate.of(2021, 9, 20), 65.5, AppType.ENTERTAINMENT, true, 0, Arrays.asList(new Owner("Ravi", "ravi@example.com", 9876543224L)));
        ApplicationDto app16 = new ApplicationDto("WorkSync", Version.V1_1, LocalDate.of(2022, 3, 1), 28.0, AppType.PRODUCTIVITY, false, 10.0, Arrays.asList(new Owner("Sana", "sana@example.com", 9876543225L)));
        ApplicationDto app17 = new ApplicationDto("EduWorld", Version.V2_1, LocalDate.of(2023, 5, 12), 38.7, AppType.EDUCATION, true, 0, Arrays.asList(new Owner("Rohit", "rohit@example.com", 9876543226L)));
        ApplicationDto app18 = new ApplicationDto("FitTrack", Version.V3_0, LocalDate.of(2024, 7, 3), 47.9, AppType.HEALTH, false, 69.0, Arrays.asList(new Owner("Nisha", "nisha@example.com", 9876543227L)));
        ApplicationDto app19 = new ApplicationDto("Socially", Version.V1_0, LocalDate.of(2023, 2, 27), 53.3, AppType.SOCIAL, true, 0, Arrays.asList(new Owner("Abhay", "abhay@example.com", 9876543228L)));
        ApplicationDto app20 = new ApplicationDto("CinePlay", Version.V2_0, LocalDate.of(2021, 6, 18), 80.0, AppType.ENTERTAINMENT, false, 89.0, Arrays.asList(new Owner("Lata", "lata@example.com", 9876543229L)));
        ApplicationDto app21 = new ApplicationDto("FocusPro", Version.V1_0, LocalDate.of(2022, 5, 10), 26.5, AppType.PRODUCTIVITY, false, 19.0, Arrays.asList(new Owner("Vinay", "vinay@example.com", 9876543230L)));
        ApplicationDto app22 = new ApplicationDto("EduTrain", Version.V2_0, LocalDate.of(2023, 6, 11), 35.5, AppType.EDUCATION, true, 0, Arrays.asList(new Owner("Megha", "megha@example.com", 9876543231L)));
        ApplicationDto app23 = new ApplicationDto("WellnessApp", Version.V3_0, LocalDate.of(2024, 3, 15), 49.0, AppType.HEALTH, false, 59.0, Arrays.asList(new Owner("Suresh", "suresh@example.com", 9876543232L)));
        ApplicationDto app24 = new ApplicationDto("ConnectAll", Version.V1_1, LocalDate.of(2022, 10, 5), 52.0, AppType.SOCIAL, true, 0, Arrays.asList(new Owner("Tina", "tina@example.com", 9876543233L)));
        ApplicationDto app25 = new ApplicationDto("StreamFun", Version.V2_1, LocalDate.of(2021, 11, 9), 73.5, AppType.ENTERTAINMENT, false, 69.0, Arrays.asList(new Owner("Akhil", "akhil@example.com", 9876543234L)));
        ApplicationDto app26 = new ApplicationDto("NoteX", Version.V1_0, LocalDate.of(2023, 9, 23), 20.0, AppType.PRODUCTIVITY, true, 0, Arrays.asList(new Owner("Varsha", "varsha@example.com", 9876543235L)));
        ApplicationDto app27 = new ApplicationDto("AcademIQ", Version.V2_0, LocalDate.of(2022, 12, 8), 32.2, AppType.EDUCATION, false, 39.0, Arrays.asList(new Owner("Jatin", "jatin@example.com", 9876543236L)));
        ApplicationDto app28 = new ApplicationDto("MediPlus", Version.V3_0, LocalDate.of(2024, 1, 19), 42.5, AppType.HEALTH, true, 0, Arrays.asList(new Owner("Ritika", "ritika@example.com", 9876543237L)));
        ApplicationDto app29 = new ApplicationDto("TalkZone", Version.V1_1, LocalDate.of(2023, 11, 14), 50.0, AppType.SOCIAL, false, 39.0, Arrays.asList(new Owner("Uday", "uday@example.com", 9876543238L)));
        ApplicationDto app30 = new ApplicationDto("MovieFlix", Version.V2_1, LocalDate.of(2021, 12, 24), 85.5, AppType.ENTERTAINMENT, true, 0, Arrays.asList(new Owner("Lina", "lina@example.com", 9876543239L)));
        ApplicationDto app31 = new ApplicationDto("TimeTracker", Version.V1_0, LocalDate.of(2022, 8, 1), 29.0, AppType.PRODUCTIVITY, false, 14.5, Arrays.asList(new Owner("Siddharth", "sid@example.com", 9876543240L)));
        ApplicationDto app32 = new ApplicationDto("TutorPlus", Version.V2_0, LocalDate.of(2023, 3, 18), 31.5, AppType.EDUCATION, true, 0, Arrays.asList(new Owner("Amrita", "amrita@example.com", 9876543241L)));
        ApplicationDto app33 = new ApplicationDto("HealthMate", Version.V3_0, LocalDate.of(2024, 8, 9), 44.8, AppType.HEALTH, false, 49.0, Arrays.asList(new Owner("Kabir", "kabir@example.com", 9876543242L)));
        ApplicationDto app34 = new ApplicationDto("ShareChat", Version.V1_1, LocalDate.of(2023, 4, 21), 55.0, AppType.SOCIAL, true, 0, Arrays.asList(new Owner("Reema", "reema@example.com", 9876543243L)));
        ApplicationDto app35 = new ApplicationDto("EnterBox", Version.V2_1, LocalDate.of(2021, 7, 27), 60.0, AppType.ENTERTAINMENT, false, 70.0, Arrays.asList(new Owner("Sunny", "sunny@example.com", 9876543244L)));
        ApplicationDto app36 = new ApplicationDto("Organizer", Version.V1_0, LocalDate.of(2022, 6, 15), 23.9, AppType.PRODUCTIVITY, true, 0, Arrays.asList(new Owner("Snehal", "snehal@example.com", 9876543245L)));
        ApplicationDto app37 = new ApplicationDto("SkillSharp", Version.V2_0, LocalDate.of(2023, 5, 2), 33.3, AppType.EDUCATION, false, 29.99, Arrays.asList(new Owner("Harsha", "harsha@example.com", 9876543246L)));
        ApplicationDto app38 = new ApplicationDto("MediCare", Version.V3_0, LocalDate.of(2024, 10, 18), 41.0, AppType.HEALTH, true, 0, Arrays.asList(new Owner("Nitin", "nitin@example.com", 9876543247L)));
        ApplicationDto app39 = new ApplicationDto("BuzzSocial", Version.V1_1, LocalDate.of(2023, 2, 7), 58.4, AppType.SOCIAL, false, 25.0, Arrays.asList(new Owner("Preeti", "preeti@example.com", 9876543248L)));
        ApplicationDto app40 = new ApplicationDto("StreamFunX", Version.V2_1, LocalDate.of(2021, 10, 29), 82.0, AppType.ENTERTAINMENT, true, 0, Arrays.asList(new Owner("Jay", "jay@example.com", 9876543249L)));
        ApplicationDto app41 = new ApplicationDto("PlanIt", Version.V1_0, LocalDate.of(2022, 4, 12), 26.0, AppType.PRODUCTIVITY, false, 12.0, Arrays.asList(new Owner("Asha", "asha@example.com", 9876543250L)));
        ApplicationDto app42 = new ApplicationDto("SmartLearn", Version.V2_0, LocalDate.of(2023, 6, 25), 36.8, AppType.EDUCATION, true, 0, Arrays.asList(new Owner("Tejas", "tejas@example.com", 9876543251L)));
        ApplicationDto app43 = new ApplicationDto("HealthSync", Version.V3_0, LocalDate.of(2024, 12, 1), 46.0, AppType.HEALTH, false, 55.0, Arrays.asList(new Owner("Kirti", "kirti@example.com", 9876543252L)));
        ApplicationDto app44 = new ApplicationDto("MeetNow", Version.V1_1, LocalDate.of(2023, 7, 5), 53.5, AppType.SOCIAL, true, 0, Arrays.asList(new Owner("Sameer", "sameer@example.com", 9876543253L)));
        ApplicationDto app45 = new ApplicationDto("CineZone", Version.V2_1, LocalDate.of(2021, 3, 13), 77.0, AppType.ENTERTAINMENT, false, 89.0, Arrays.asList(new Owner("Farah", "farah@example.com", 9876543254L)));
        ApplicationDto app46 = new ApplicationDto("TimeBlock", Version.V1_1, LocalDate.of(2022, 11, 22), 28.8, AppType.PRODUCTIVITY, true, 0, Arrays.asList(new Owner("Ajay", "ajay@example.com", 9876543255L)));
        ApplicationDto app47 = new ApplicationDto("EduPlay", Version.V2_1, LocalDate.of(2023, 1, 30), 39.2, AppType.EDUCATION, false, 45.0, Arrays.asList(new Owner("Bhavna", "bhavna@example.com", 9876543256L)));
        ApplicationDto app48 = new ApplicationDto("MyHealth", Version.V3_0, LocalDate.of(2024, 9, 7), 40.0, AppType.HEALTH, true, 0, Arrays.asList(new Owner("Aditya", "aditya@example.com", 9876543257L)));
        ApplicationDto app49 = new ApplicationDto("VibeChat", Version.V1_0, LocalDate.of(2023, 5, 19), 56.6, AppType.SOCIAL, false, 39.0, Arrays.asList(new Owner("Simran", "simran@example.com", 9876543258L)));
        ApplicationDto app50 = new ApplicationDto("MovieShow", Version.V2_0, LocalDate.of(2021, 6, 2), 79.5, AppType.ENTERTAINMENT, true, 0, Arrays.asList(new Owner("Ishaan", "ishaan@example.com", 9876543259L)));



        Collection<ApplicationDto> collection = new ArrayList<>();
        collection.add(app1);
        collection.add(app2);
        collection.add(app3);
        collection.add(app4);
        collection.add(app5);
        collection.add(app6);
        collection.add(app7);
        collection.add(app8);
        collection.add(app9);
        collection.add(app10);
        collection.add(app11);
        collection.add(app12);
        collection.add(app13);
        collection.add(app14);
        collection.add(app15);
        collection.add(app16);
        collection.add(app17);
        collection.add(app18);
        collection.add(app19);
        collection.add(app20);
        collection.add(app21);
        collection.add(app22);
        collection.add(app23);
        collection.add(app24);
        collection.add(app25);
        collection.add(app26);
        collection.add(app27);
        collection.add(app28);
        collection.add(app29);
        collection.add(app30);
        collection.add(app31);
        collection.add(app32);
        collection.add(app33);
        collection.add(app34);
        collection.add(app35);
        collection.add(app36);
        collection.add(app37);
        collection.add(app38);
        collection.add(app39);
        collection.add(app40);
        collection.add(app41);
        collection.add(app42);
        collection.add(app43);
        collection.add(app44);
        collection.add(app45);
        collection.add(app46);
        collection.add(app47);
        collection.add(app48);
        collection.add(app49);
        collection.add(app50);





        return collection;
    }
}
