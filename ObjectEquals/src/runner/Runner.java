package runner;

import com.java.internal.*;

public class Runner {
    public static void main(String[] args) {

        //Pen
        Pen pen1 = new Pen("Red", "Reynolds", 30.5, true);
        Pen pen2 = new Pen("Blue", "BallPen", 40.5, false);
        Pen pen3 = new Pen("Blue", "BallPen", 40.5, false);
        System.out.println("Pen matching:"+pen1.equals(pen2));
        System.out.println("Pen matching:"+pen2.equals(pen3));

        //Farm
        Farm farm1 = new Farm("Green Acres", 100.5, "Karnataka", 50);
        Farm farm2 = new Farm("Sunny Fields", 80.0, "Tamil Nadu", 40);
        Farm farm3 = new Farm("Sunny Fields", 80.0, "Tamil Nadu", 40);
        System.out.println("Farm match: " + farm3.equals(farm2));
        System.out.println("Farm match: " + farm1.equals(farm2));

        // Phone
        Phone phone1 = new Phone("Samsung", "Galaxy", 128, 30000);
        Phone phone2 = new Phone("Apple", "iPhone", 250, 70000);
        Phone phone3 = new Phone("Apple", "iPhone", 250, 70000);
        System.out.println("Phone match: " + phone3.equals(phone2));
        System.out.println("Phone not match: " + phone1.equals(phone2));

        // Laptop
        Laptop laptop1 = new Laptop("Dell", "i5", 8, 512);
        Laptop laptop2 = new Laptop("HP", "i7", 16, 1024);
        Laptop laptop3 = new Laptop("HP", "i7", 16, 1024);
        System.out.println("Laptop match: " + laptop3.equals(laptop2));
        System.out.println("Laptop not match: " + laptop1.equals(laptop2));

        // Book
        Book book1 = new Book("Wings of fire","APJ kalam",800,986.9);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 200, 150.0);
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 200, 150.0);
        System.out.println("Book match: " + book3.equals(book2));
        System.out.println("Book not match: " + book1.equals(book2));

        // Camera
        Camera camera1 = new Camera("Canon", "EOS 90D", 32, 120000);
        Camera camera2 = new Camera("Nikon", "D5600", 24, 70000);
        Camera camera3 = new Camera("Nikon", "D5600", 24, 70000);
        System.out.println("Camera match: " + camera3.equals(camera2));
        System.out.println("Camera not match: " + camera1.equals(camera2));

        //Fan
        Fan fan1 = new Fan("Usha", 2500, 3, "red");
        Fan fan2 = new Fan("Bajaj", 7980, 2, "blue");
        Fan fan3 = new Fan("Bajaj", 7980, 2, "blue");
        System.out.println(fan1.equals(fan2));
        System.out.println(fan3.equals(fan2));

        //Car
        Car c1 = new Car("Toyota", "Sedan", 2019, "Black");
        Car c2 = new Car("Hyundai", "SUV", 2021, "White");
        Car c3 = new Car("Hyundai", "SUV", 2021, "White");
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));

        // Watch
        Watch watch1 = new Watch("Fossil", "Analog", false, 4500);
        Watch watch2 = new Watch("Apple", "Digital", true, 25000);
        Watch watch3 = new Watch("Apple", "Digital", true, 25000);
        System.out.println("Watch match: " + watch3.equals(watch2));
        System.out.println("Watch not match: " + watch1.equals(watch2));

        // Bicycle
        Bicycle cycle1 = new Bicycle("Hero", 21, "Red", 12.5);
        Bicycle cycle2 = new Bicycle("Firefox", 18, "Blue", 13.0);
        Bicycle cycle3 = new Bicycle("Firefox", 18, "Blue", 13.0);
        System.out.println("Bicycle match: " + cycle3.equals(cycle2));
        System.out.println("Bicycle not match: " + cycle1.equals(cycle2));

        // Chair
        Chair chair1 = new Chair("Wood", "Brown", true, 3.5);
        Chair chair2 = new Chair("Plastic", "White", false, 3.0);
        Chair chair3 = new Chair("Plastic", "White", false, 3.0);
        System.out.println("Chair match: " + chair3.equals(chair2));
        System.out.println("Chair not match: " + chair1.equals(chair2));

        // Table
        Table table1 = new Table("Round", "Wood", 4.0, 4.0);
        Table table2 = new Table("Square", "Metal", 5.0, 5.0);
        Table table3 = new Table("Square", "Metal", 5.0, 5.0);
        System.out.println("Table match: " + table3.equals(table2));
        System.out.println("Table not match: " + table1.equals(table2));

        // Bottle
        Bottle bottle1 = new Bottle("Red", 1.0, "Plastic", true);
        Bottle bottle2 = new Bottle("Black", 1.5, "Steel", true);
        Bottle bottle3 = new Bottle("Black", 1.5, "Steel", true);
        System.out.println("Bottle match: " + bottle3.equals(bottle2));
        System.out.println("Bottle not match: " + bottle1.equals(bottle2));

        // Bag
        Bag bag1 = new Bag("Wildcraft", "Backpack", 30, "Black");
        Bag bag2 = new Bag("Skybags", "Laptop", 28, "Grey");
        Bag bag3 = new Bag("Skybags", "Laptop", 28, "Grey");
        System.out.println("Bag match: " + bag3.equals(bag2));
        System.out.println("Bag not match: " + bag1.equals(bag2));

        // Glass
        Glass glass1 = new Glass("Wine", 0.3, true, "Glass");
        Glass glass2 = new Glass("Juice", 0.4, false, "Plastic");
        Glass glass3 = new Glass("Juice", 0.4, false, "Plastic");
        System.out.println("Glass match: " + glass3.equals(glass2));
        System.out.println("Glass not match: " + glass1.equals(glass2));

        // Mirror
        Mirror mirror1 = new Mirror("Oval", 4.0, 2.0, true);
        Mirror mirror2 = new Mirror("Rectangle", 5.0, 3.0, false);
        Mirror mirror3 = new Mirror("Rectangle", 5.0, 3.0, false);
        System.out.println("Mirror match: " + mirror3.equals(mirror2));
        System.out.println("Mirror not match: " + mirror1.equals(mirror2));

        // Shoe
        Shoe shoe1 = new Shoe("Nike", "9", "Red", true);
        Shoe shoe2 = new Shoe("Adidas", "8", "Black", false);
        Shoe shoe3 = new Shoe("Adidas", "8", "Black", false);
        System.out.println("Shoe match: " + shoe3.equals(shoe2));
        System.out.println("Shoe not match: " + shoe1.equals(shoe2));

        // Keyboard
        Keyboard kb1 = new Keyboard("Logitech", "Mechanical", true, 2500);
        Keyboard kb2 = new Keyboard("Dell", "Membrane", false, 1000);
        Keyboard kb3 = new Keyboard("Dell", "Membrane", false, 1000);
        System.out.println("Keyboard match: " + kb3.equals(kb2));
        System.out.println("Keyboard not match: " + kb1.equals(kb2));

        // Mouse
        Mouse mouse1 = new Mouse("Logitech", true, 3, 700);
        Mouse mouse2 = new Mouse("HP", false, 2, 400);
        Mouse mouse3 = new Mouse("HP", false, 2, 400);
        System.out.println("Mouse match: " + mouse3.equals(mouse2));
        System.out.println("Mouse not match: " + mouse1.equals(mouse2));

        // Refrigerator
        Refrigerator ref1 = new Refrigerator("LG", 340, "Silver", 35000);
        Refrigerator ref2 = new Refrigerator("Samsung", 300, "Grey", 32000);
        Refrigerator ref3 = new Refrigerator("Samsung", 300, "Grey", 32000);
        System.out.println("Refrigerator match: " + ref3.equals(ref2));
        System.out.println("Refrigerator not match: " + ref1.equals(ref2));

        // Television
        Television tv1 = new Television("Sony", 55.0, "LED", 60000);
        Television tv2 = new Television("Samsung", 50.0, "QLED", 55000);
        Television tv3 = new Television("Samsung", 50.0, "QLED", 55000);
        System.out.println("Television match: " + tv3.equals(tv2));
        System.out.println("Television not match: " + tv1.equals(tv2));

        // Speaker
        Speaker speaker1 = new Speaker("JBL", "Bluetooth", 30, 3000);
        Speaker speaker2 = new Speaker("Boat", "Wireless", 25, 2500);
        Speaker speaker3 = new Speaker("Boat", "Wireless", 25, 2500);
        System.out.println("Speaker match: " + speaker3.equals(speaker2));
        System.out.println("Speaker not match: " + speaker1.equals(speaker2));

        // AirConditioner
        AirConditioner ac1 = new AirConditioner("LG", 1.5, true, 35000);
        AirConditioner ac2 = new AirConditioner("Samsung", 1.0, false, 30000);
        AirConditioner ac3 = new AirConditioner("Samsung", 1.0, false, 30000);
        System.out.println("AirConditioner match: " + ac3.equals(ac2));
        System.out.println("AirConditioner not match: " + ac1.equals(ac2));

        // Oven
        Oven oven1 = new Oven("Samsung", "Convection", 28, 9500);
        Oven oven2 = new Oven("IFB", "Grill", 20, 8500);
        Oven oven3 = new Oven("IFB", "Grill", 20, 8500);
        System.out.println("Oven match: " + oven3.equals(oven2));
        System.out.println("Oven not match: " + oven1.equals(oven2));

        // WashingMachine
        WashingMachine wm1 = new WashingMachine("Whirlpool", "TopLoad", 7, 15000);
        WashingMachine wm2 = new WashingMachine("Bosch", "FrontLoad", 6, 20000);
        WashingMachine wm3 = new WashingMachine("Bosch", "FrontLoad", 6, 20000);
        System.out.println("WashingMachine match: " + wm3.equals(wm2));
        System.out.println("WashingMachine not match: " + wm1.equals(wm2));

        SmartPhone s1 = new SmartPhone(); s1.setBrand("Apple"); s1.setModel("iPhone 14"); s1.setPrice(1200); s1.setStorage(24);
        SmartPhone s2 = new SmartPhone(); s2.setBrand("Samsung"); s2.setModel("Galaxy S21"); s2.setPrice(1000); s2.setStorage(22);
        SmartPhone s3 = new SmartPhone(); s3.setBrand("Samsung"); s3.setModel("Galaxy S21"); s3.setPrice(1000); s3.setStorage(22);
        System.out.println("Smartphone match: " + s2.equals(s3));
        System.out.println("Smartphone not match: " + s1.equals(s2));

        DigitalClock digitalClock1 = new DigitalClock(); digitalClock1.setBrand("Casio"); digitalClock1.setIs24Hour(true); digitalClock1.setColor("red"); digitalClock1.setCost(234);
        DigitalClock digitalClock2 = new DigitalClock(); digitalClock2.setBrand("Sony"); digitalClock2.setIs24Hour(false); digitalClock2.setColor("Green"); digitalClock2.setCost(480);
        DigitalClock digitalClock3 = new DigitalClock(); digitalClock3.setBrand("Sony"); digitalClock3.setIs24Hour(false); digitalClock3.setColor("Green"); digitalClock3.setCost(480);
        System.out.println("DigitalClock match: " + c2.equals(c3));
        System.out.println("DigitalClock not match: " + c1.equals(c2));

        SmartSpeaker sp1 = new SmartSpeaker(); sp1.setBrand("Amazon"); sp1.setAssistant("Echo Dot"); sp1.setCost(7000); sp1.setPortable(true);
        SmartSpeaker sp2 = new SmartSpeaker(); sp2.setBrand("Google"); sp2.setAssistant("Nest Mini"); sp2.setCost(5000); sp2.setPortable(true);
        SmartSpeaker sp3 = new SmartSpeaker(); sp3.setBrand("Google"); sp3.setAssistant("Nest Mini"); sp3.setCost(5000); sp3.setPortable(true);
        System.out.println("SmartSpeaker match: " + sp2.equals(sp3));
        System.out.println("SmartSpeaker not match: " + sp1.equals(sp2));

        FitnessTracker ft1 = new FitnessTracker(); ft1.setBrand("Fitbit"); ft1.setWaterproof(true); ft1.setBatteryLife(12000); ft1.setPrice(600);
        FitnessTracker ft2 = new FitnessTracker(); ft2.setBrand("Garmin"); ft2.setWaterproof(true); ft2.setBatteryLife(10000); ft2.setPrice(550);
        FitnessTracker ft3 = new FitnessTracker(); ft3.setBrand("Garmin"); ft3.setWaterproof(true); ft3.setBatteryLife(10000); ft3.setPrice(550);
        System.out.println("FitnessTracker match: " + ft2.equals(ft3));
        System.out.println("FitnessTracker not match: " + ft1.equals(ft2));

        TrafficLight tl1 = new TrafficLight(); tl1.setLocation("Main Street"); tl1.setColor("Red"); tl1.setTimer(60); tl1.setIsWorking(true);
        TrafficLight tl2 = new TrafficLight(); tl2.setLocation("2nd Street"); tl2.setColor("Green"); tl2.setTimer(45); tl2.setIsWorking(true);
        TrafficLight tl3 = new TrafficLight(); tl3.setLocation("2nd Street"); tl3.setColor("Green"); tl3.setTimer(45); tl3.setIsWorking(true);
        System.out.println("TrafficLight match: " + tl2.equals(tl3));
        System.out.println("TrafficLight not match: " + tl1.equals(tl2));

        MicrowaveOven mo1 = new MicrowaveOven(); mo1.setBrand("LG"); mo1.setCapacity(20); mo1.setPrice(800); mo1.setGrillOption(false);
        MicrowaveOven mo2 = new MicrowaveOven(); mo2.setBrand("Samsung"); mo2.setCapacity(25); mo2.setPrice(1000); mo2.setGrillOption(true);
        MicrowaveOven mo3 = new MicrowaveOven(); mo3.setBrand("Samsung"); mo3.setCapacity(25); mo3.setPrice(1000); mo3.setGrillOption(true);
        System.out.println("MicrowaveOven match: " + mo2.equals(mo3));
        System.out.println("MicrowaveOven not match: " + mo1.equals(mo2));

        ElectricKettle ek1 = new ElectricKettle(); ek1.setBrand("Prestige"); ek1.setVolume(1.5); ek1.setPrice(1500); ek1.setAutoShutoff(true);
        ElectricKettle ek2 = new ElectricKettle(); ek2.setBrand("Bajaj"); ek2.setVolume(2.0); ek2.setPrice(1800); ek2.setAutoShutoff(true);
        ElectricKettle ek3 = new ElectricKettle(); ek3.setBrand("Bajaj"); ek3.setVolume(2.0); ek3.setPrice(1800); ek3.setAutoShutoff(true);
        System.out.println("ElectricKettle match: " + ek2.equals(ek3));
        System.out.println("ElectricKettle not match: " + ek1.equals(ek2));

        AirFryer af1 = new AirFryer(); af1.setBrand("Philips"); af1.setDigital(true); af1.setCost(2.4); af1.setCapacity(30);
        AirFryer af2 = new AirFryer(); af2.setBrand("Inalsa"); af2.setDigital(false); af2.setCost(4.0); af2.setCapacity(60);
        AirFryer af3 = new AirFryer(); af3.setBrand("Inalsa"); af3.setDigital(false); af3.setCost(4.0); af3.setCapacity(60);
        System.out.println("AirFryer match: " + af2.equals(af3));
        System.out.println("AirFryer not match: " + af1.equals(af2));

        SmartCoffeeMaker scm1 = new SmartCoffeeMaker(); scm1.setBrand("Nespresso"); scm1.setBrewTime(2); scm1.setPrice(1.2); scm1.setWifiEnabled(true);
        SmartCoffeeMaker scm2 = new SmartCoffeeMaker(); scm2.setBrand("Keurig"); scm2.setBrewTime(3); scm2.setPrice(1.5); scm2.setWifiEnabled(true);
        SmartCoffeeMaker scm3 = new SmartCoffeeMaker(); scm3.setBrand("Keurig"); scm3.setBrewTime(3); scm3.setPrice(1.5); scm3.setWifiEnabled(true);
        System.out.println("SmartCoffeeMaker match: " + scm2.equals(scm3));
        System.out.println("SmartCoffeeMaker not match: " + scm1.equals(scm2));

        SmartRefrigerator sr1 = new SmartRefrigerator(); sr1.setBrand("Samsung"); sr1.setTouchscreen(true); sr1.setPrice(500); sr1.setDoors(4);
        SmartRefrigerator sr2 = new SmartRefrigerator(); sr2.setBrand("LG"); sr2.setTouchscreen(true); sr2.setPrice(600); sr2.setDoors(5);
        SmartRefrigerator sr3 = new SmartRefrigerator(); sr3.setBrand("LG"); sr3.setTouchscreen(false); sr3.setPrice(600); sr3.setDoors(5);
        System.out.println("SmartRefrigerator match: " + sr2.equals(sr3));
        System.out.println("SmartRefrigerator not match: " + sr1.equals(sr2));

        // GPS Navigation
        GPSNavigation g1 = new GPSNavigation(); g1.setBrand("Garmin"); g1.setScreenSize("GPSMAP 64st"); g1.setVoiceSupport("Topographic"); g1.setPrice(16);
        GPSNavigation g2 = new GPSNavigation(); g2.setBrand("TomTom"); g2.setScreenSize("GO 620"); g2.setVoiceSupport("Road"); g2.setPrice(12);
        GPSNavigation g3 = new GPSNavigation(); g3.setBrand("TomTom"); g3.setScreenSize("GO 620"); g3.setVoiceSupport("Road"); g3.setPrice(12);
        System.out.println("GPSNavigation match: " + g2.equals(g3));
        System.out.println("GPSNavigation not match: " + g1.equals(g2));

        // Filter
        Filter f1 = new Filter(); f1.setSize("Honeywell"); f1.setType("HEPA"); f1.setCost(99.97); f1.setReusable("Medium");
        Filter f2 = new Filter(); f2.setSize("Dyson"); f2.setType("Carbon"); f2.setCost(99.99); f2.setReusable("Large");
        Filter f3 = new Filter(); f3.setSize("Dyson"); f3.setType("Carbon"); f3.setCost(99.99); f3.setReusable("Large");
        System.out.println("Filter match: " + f2.equals(f3));
        System.out.println("Filter not match: " + f1.equals(f2));

        // Scooter
        Scooter sc1 = new Scooter(); sc1.setModel("Vespa"); sc1.setElectric("SXL 125"); sc1.setRange(90); sc1.setPrice(8);
        Scooter sc2 = new Scooter(); sc2.setModel("Honda"); sc2.setElectric("Activa 6G"); sc2.setRange(80); sc2.setPrice(5.3);
        Scooter sc3 = new Scooter(); sc3.setModel("Honda"); sc3.setElectric("Activa 6G"); sc3.setRange(80); sc3.setPrice(5.3);
        System.out.println("Scooter match: " + sc2.equals(sc3));
        System.out.println("Scooter not match: " + sc1.equals(sc2));

        // Machine
        Machine m1 = new Machine(); m1.setType("Caterpillar"); m1.setAutomatic("D6N"); m1.setPower(160); m1.setPrice(18000);
        Machine m2 = new Machine(); m2.setType("Komatsu"); m2.setAutomatic("D65PX"); m2.setPower(200); m2.setPrice(20000);
        Machine m3 = new Machine(); m3.setType("Komatsu"); m3.setAutomatic("D65PX"); m3.setPower(200); m3.setPrice(20000);
        System.out.println("Machine match: " + m2.equals(m3));
        System.out.println("Machine not match: " + m1.equals(m2));

        // Drone
        Drone d1 = new Drone(); d1.setBrand("DJI"); d1.setCamera("Mavic Air 2"); d1.setRange(34); d1.setWeight(570);
        Drone d2 = new Drone(); d2.setBrand("Parrot"); d2.setCamera("Anafi"); d2.setRange(25); d2.setWeight(320);
        Drone d3 = new Drone(); d3.setBrand("Parrot"); d3.setCamera("Anafi"); d3.setRange(25); d3.setWeight(320);
        System.out.println("Drone match: " + d2.equals(d3));
        System.out.println("Drone not match: " + d1.equals(d2));

        // Broadcast
        Broadcast b1 = new Broadcast(); b1.setName("Sony"); b1.setFrequency("HBO"); b1.setDuration(120); b1.setIsLive("HD");
        Broadcast b2 = new Broadcast(); b2.setName("Netflix"); b2.setFrequency("Netflix Originals"); b2.setDuration(60); b2.setIsLive("4K");
        Broadcast b3 = new Broadcast(); b3.setName("Netflix"); b3.setFrequency("Netflix Originals"); b3.setDuration(60); b3.setIsLive("4K");
        System.out.println("Broadcast match: " + b2.equals(b3));
        System.out.println("Broadcast not match: " + b1.equals(b2));

        // Stick
        Stick sk1 = new Stick(); s1.setMaterial("Wood"); s1.setLength(5); s1.setWeight(300); s1.setColor("High");
        Stick sk2 = new Stick(); s2.setMaterial("Bamboo"); s2.setLength(4); s2.setWeight(200); s2.setColor("Medium");
        Stick sk3 = new Stick(); s3.setMaterial("Bamboo"); s3.setLength(4); s3.setWeight(200); s3.setColor("Medium");
        System.out.println("Stick match: " + sk2.equals(sk3));
        System.out.println("Stick not match: " + sk1.equals(sk2));

        // Gaming Console
        GamingConsole gc1 = new GamingConsole(); gc1.setBrand("Sony"); gc1.setModel("PS5"); gc1.setWireless(825); gc1.setPrice(499);
        GamingConsole gc2 = new GamingConsole(); gc2.setBrand("Microsoft"); gc2.setModel("Xbox Series X"); gc2.setWireless(1000); gc2.setPrice(499);
        GamingConsole gc3 = new GamingConsole(); gc3.setBrand("Microsoft"); gc3.setModel("Xbox Series X"); gc3.setWireless(1000); gc3.setPrice(499);
        System.out.println("GamingConsole match: " + gc2.equals(gc3));
        System.out.println("GamingConsole not match: " + gc1.equals(gc2));

        // Headset
        Headset h1 = new Headset(); h1.setBrand("Bose"); h1.setColor("QuietComfort 35 II"); h1.setNoiseCancelling("Over-Ear"); h1.setPrice(20);
        Headset h2 = new Headset(); h2.setBrand("Sony"); h2.setColor("WH-1000XM4"); h2.setNoiseCancelling("Over-Ear"); h2.setPrice(30);
        Headset h3 = new Headset(); h3.setBrand("Sony"); h3.setColor("WH-1000XM4"); h3.setNoiseCancelling("Over-Ear"); h3.setPrice(30);
        System.out.println("Headset match: " + h2.equals(h3));
        System.out.println("Headset not match: " + h1.equals(h2));

        // Smart TV
        SmartTV stv1 = new SmartTV(); stv1.setBrand("Samsung"); stv1.setIs4K(false); stv1.setSize(55); stv1.setPrice(5000);
        SmartTV stv2 = new SmartTV(); stv2.setBrand("LG"); stv2.setIs4K(true); stv2.setSize(65); stv2.setPrice(5067);
        SmartTV stv3 = new SmartTV(); stv3.setBrand("LG"); stv3.setIs4K(true); stv3.setSize(65); stv3.setPrice(5067);
        System.out.println("SmartTV match: " + stv2.equals(stv3));
        System.out.println("SmartTV not match: " + stv1.equals(stv2));

        // Microwave
        Microwave mw1 = new Microwave(); mw1.setBrand("Panasonic"); mw1.setGrillFeature(true); mw1.setCapacity(2.2); mw1.setPrice(1250);
        Microwave mw2 = new Microwave(); mw2.setBrand("LG"); mw2.setGrillFeature(false); mw2.setCapacity(1.5); mw2.setPrice(1000);
        Microwave mw3 = new Microwave(); mw3.setBrand("LG"); mw3.setGrillFeature(false); mw3.setCapacity(1.5); mw3.setPrice(1000);
        System.out.println("Microwave match: " + mw2.equals(mw3));
        System.out.println("Microwave not match: " + mw1.equals(mw2));

        // Saucer
        Saucer sa1 = new Saucer(); sa1.setMaterial("Ceramic"); sa1.setRadius(20); sa1.setColor("White"); sa1.setDishwasherSafe(true);
        Saucer sa2 = new Saucer(); sa2.setMaterial("Glass"); sa2.setRadius(15); sa2.setColor("Blue"); sa2.setDishwasherSafe(false);
        Saucer sa3 = new Saucer(); sa3.setMaterial("Glass"); sa3.setRadius(15); sa3.setColor("Blue"); sa3.setDishwasherSafe(false);
        System.out.println("Saucer match: " + sa2.equals(sa3));
        System.out.println("Saucer not match: " + sa1.equals(sa2));

        // Station
        Station st1 = new Station(); st1.setName("Waterloo"); st1.setCity("London"); st1.setPlatforms(6); st1.setJunction(false);
        Station st2 = new Station(); st2.setName("King's Cross"); st2.setCity("London"); st2.setPlatforms(7); st2.setJunction(true);
        Station st3 = new Station(); st3.setName("King's Cross"); st3.setCity("London"); st3.setPlatforms(7); st3.setJunction(true);
        System.out.println("Station match: " + st2.equals(st3));
        System.out.println("Station not match: " + st1.equals(st2));

        // Doorbell
        Doorbell db1 = new Doorbell(); db1.setBrand("Ring"); db1.setWireless(false); db1.setPrice(6); db1.setRingtone("HD Video");
        Doorbell db2 = new Doorbell(); db2.setBrand("Nest"); db2.setWireless(true); db2.setPrice(5); db2.setRingtone("Video and Audio");
        Doorbell db3 = new Doorbell(); db3.setBrand("Nest"); db3.setWireless(true); db3.setPrice(5); db3.setRingtone("Video and Audio");
        System.out.println("Doorbell match: " + db2.equals(db3));
        System.out.println("Doorbell not match: " + db1.equals(db2));

        // Plate
        Plate p1 = new Plate(); p1.setMaterial("Ceramic"); p1.setColor("Red"); p1.setDiameter(10); p1.setMicrowaveSafe(true);
        Plate p2 = new Plate(); p2.setMaterial("Plastic"); p2.setColor("Green"); p2.setDiameter(12); p2.setMicrowaveSafe(false);
        Plate p3 = new Plate(); p3.setMaterial("Plastic"); p3.setColor("Green"); p3.setDiameter(12); p3.setMicrowaveSafe(false);
        System.out.println("Plate match: " + p2.equals(p3));
        System.out.println("Plate not match: " + p1.equals(p2));

    }
}
