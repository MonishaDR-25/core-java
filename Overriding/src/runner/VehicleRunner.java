package runner;

import in.moni.external.*;
import in.moni.external.MetroPass;
import in.moni.internal.*;
import in.moni.internal.Process;

public class VehicleRunner {
    public static void main(String[] args){
        //1. Vehicle-Car
        System.out.println("========Vehicle Override and run time poly is======");
        Vehicle vehicle=new Vehicle();
        vehicle.move();

        System.out.println("Run time poly");
        Vehicle vehi=new Car();
        vehi.move();

        System.out.println("Subclass method");
        Car car=new Car();
        car.move();
        car.honk();

        // 2. Appliance - WashingMachine
        Appliance appliance = new Appliance();
        appliance.start();

        Appliance washer = new WashingMachine();
        washer.start();

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.start();
        washingMachine.rinseClothes();

        //3.Animal-Dog
        Animal animal = new Animal();
        animal.makeSound();

        Animal dogAsAnimal = new Dog();
        dogAsAnimal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();

        //4.Bird-Eagle
        Bird bird = new Bird();
        bird.fly();

        Bird eagleAsBird = new Eagle();
        eagleAsBird.fly();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.hunt();

        // 5. Instrument - Guitar
        Instrument instrument = new Instrument();
        instrument.play();

        Instrument guitarAsInstrument = new Guitar();
        guitarAsInstrument.play();

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tuneStrings();

        // 6. Shape - Circle
        Shape shape = new Shape();
        shape.draw();

        Shape circleAsShape = new Circle();
        circleAsShape.draw();

        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();

        // 7. Building - Apartment
        Building building = new Building();
        building.construct();

        Building apartmentAsBuilding = new Apartment();
        apartmentAsBuilding.construct();

        Apartment apartment = new Apartment();
        apartment.construct();
        apartment.installLift();

        // 8. Document - Invoice
        Document document = new Document();
        document.print();

        Document invoiceAsDocument = new Invoice();
        invoiceAsDocument.print();

        Invoice invoice = new Invoice();
        invoice.print();
        invoice.calculateTotal();

        // 9. Machine - Drill
        Machine machine = new Machine();
        machine.run();

        Machine drillAsMachine = new Drill();
        drillAsMachine.run();

        Drill drill = new Drill();
        drill.run();
        drill.changeBit();


        // 10. Furniture - Chair
        Furniture furniture = new Furniture();
        furniture.assemble();

        Furniture chairAsFurniture = new Chair();
        chairAsFurniture.assemble();

        Chair chair = new Chair();
        chair.assemble();
        chair.adjustHeight();


        //11. Person-Teacher
        Person person=new Person();
        person.work();

        Person asTeacher=new Teacher();
        asTeacher.work();

        Teacher teacher=new Teacher();
        teacher.work();
        teacher.teachLesson();

        // 12. Employee - Engineer
        Employee employee = new Employee();
        employee.performDuty();

        Employee engineerAsEmployee = new Engineer();
        engineerAsEmployee.performDuty();

        Engineer engineer = new Engineer();
        engineer.performDuty();
        engineer.writeCode();

        // 13. Tool - Hammer
        Tool tool = new Tool();
        tool.use();
        Tool hammerAsTool = new Hammer();
        hammerAsTool.use();
        Hammer hammer = new Hammer();
        hammer.use();
        hammer.nailDown();

        // 14. Plant - Cactus
        Plant plant = new Plant();
        plant.grow();
        Plant cactusAsPlant = new Cactus();
        cactusAsPlant.grow();
        Cactus cactus = new Cactus();
        cactus.grow();
        cactus.storeWater();

        // 15. Light - Lamp
        Light light = new Light();
        light.glow();
        Light lampAsLight = new Lamp();
        lampAsLight.glow();
        Lamp lamp = new Lamp();
        lamp.glow();
        lamp.changeBulb();

        // 16. Toy - RobotToy
        Toy toy = new Toy();
        toy.play();
        Toy robotAsToy = new RobotToy();
        robotAsToy.play();
        RobotToy robotToy = new RobotToy();
        robotToy.play();
        robotToy.walk();

        // 17. Device - Phone
        Device device = new Device();
        device.operate();
        Device phoneAsDevice = new Phone();
        phoneAsDevice.operate();
        Phone phone = new Phone();
        phone.operate();
        phone.makeCall();

        // 18. Computer - Laptop
        Computer computer = new Computer();
        computer.process();
        Computer laptopAsComputer = new Laptop();
        laptopAsComputer.process();
        Laptop laptop = new Laptop();
        laptop.process();
        laptop.foldScreen();

        // 19. Bag - Backpack
        Bag bag = new Bag();
        bag.carry();
        Bag backpackAsBag = new Backpack();
        backpackAsBag.carry();
        Backpack backpack = new Backpack();
        backpack.carry();
        backpack.addBook();

        // 20. Clothing - Shirt
        Clothing clothing = new Clothing();
        clothing.wear();
        Clothing shirtAsClothing = new Shirt();
        shirtAsClothing.wear();
        Shirt shirt = new Shirt();
        shirt.wear();
        shirt.buttonUp();

        // 21. Ball - Basketball
        Ball ball = new Ball();
        ball.bounce();
        Ball basketballAsBall = new Basketball();
        basketballAsBall.bounce();
        Basketball basketball = new Basketball();
        basketball.bounce();
        basketball.dribble();

        // 22. Utensil - Spoon
        Utensil utensil = new Utensil();
        utensil.clean();
        Utensil spoonAsUtensil = new Spoon();
        spoonAsUtensil.clean();
        Spoon spoon = new Spoon();
        spoon.clean();
        spoon.scoop();

        // 23. Appliance - Microwave
        Appliances microwaveAppliance = new Microwave();
        microwaveAppliance.start();
        Microwave microwave = new Microwave();
        microwave.start();
        microwave.heatFood();

        // 24. Book - Novel
        Book book = new Book();
        book.open();
        Book novelAsBook = new Novel();
        novelAsBook.open();
        Novel novel = new Novel();
        novel.open();
        novel.readStory();

        // 25. Vehicle - Bicycle
        Vehicle bicycleVehicle = new Bicycle();
        bicycleVehicle.move();
        Bicycle bicycle = new Bicycle();
        bicycle.move();
        bicycle.ringBell();

        // 26. Gadget - Smartwatch
        Gadget gadget = new Gadget();
        gadget.use();
        Gadget watchAsGadget = new Smartwatch();
        watchAsGadget.use();
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.use();
        smartwatch.trackSteps();

        // 27. Food - Pizza
        Food food = new Food();
        food.prepare();
        Food pizzaAsFood = new Pizza();
        pizzaAsFood.prepare();
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.addToppings();

        // 28. Animal - Cat
        Animal catAnimal = new Cat();
        catAnimal.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        cat.scratch();

        // 29. Service - Delivery
        Service service = new Service();
        service.execute();
        Service deliveryAsService = new Delivery();
        deliveryAsService.execute();
        Delivery delivery = new Delivery();
        delivery.execute();
        delivery.trackOrder();

        // 30. Appliance - Blender
        Appliance blenderAppliance = new Blender();
        blenderAppliance.start();
        Blender blender = new Blender();
        blender.start();
        blender.blendFruits();

        // 31. Message - Email
        Message message = new Message();
        message.send();
        Message emailAsMessage = new Email();
        emailAsMessage.send();
        Email email = new Email();
        email.send();
        email.attachFile();

        // 32. Toy - Doll
        Toy dollToy = new Doll();
        dollToy.play();
        Doll doll = new Doll();
        doll.play();
        doll.changeClothes();

        // 33. Sensor - MotionSensor
        Sensor sensor = new Sensor();
        sensor.detect();
        Sensor motionSensor = new MotioSensor();
        motionSensor.detect();
        MotioSensor asmotioSensor=new MotioSensor();
         asmotioSensor.triggerAlarm();
        asmotioSensor.triggerAlarm();


        // 34. Fan - CeilingFan
        Fan fan = new Fan();
        fan.rotate();
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.rotate();
        ceilingFan.changeSpeed();

        // 35. Machine - Lathe
        Machine latheMachine = new Lathe();
        latheMachine.run();
        Lathe lathe = new Lathe();
        lathe.run();
        lathe.cutMetal();

        // 36. Account - SavingsAccount
        Account account = new Account();
        account.access();
        SavingsAccount savings = new SavingsAccount();
        savings.access();
        savings.calculateInterest();

        // 37. Display - LEDDisplay
        Display display = new Display();
        display.show();
        LEDDisplay led = new LEDDisplay();
        led.show();
        led.adjustBrightness();

        // 38. Box - ToolBox
        Box box = new Box();
        box.store();
        ToolBox toolbox = new ToolBox();
        toolbox.store();
        toolbox.lock();

        // 39. Button - PowerButton
        Button button = new Button();
        button.press();
        PowerButton powerButton = new PowerButton();
        powerButton.press();
        powerButton.bootSystem();

        // 40. Cloth - Jacket
        Cloth cloth = new Cloth();
        cloth.wear();
        Jacket jacket = new Jacket();
        jacket.wear();
        jacket.zipUp();

        // 41. Animal - Snake
        Animal snakeAnimal = new Snake();
        snakeAnimal.makeSound();
        Snake snake = new Snake();
        snake.makeSound();
        snake.shedSkin();

        // 42. ApplianceRemote - TVRemote
        System.out.println("\n. ApplianceRemote - TVRemote");
        ApplianceRemote remote = new ApplianceRemote();
        remote.control();
        ApplianceRemote tvRemote = new TVRemote();
        tvRemote.control();
        TVRemote tv = new TVRemote();
        tv.control();
        tv.changeChannel();

        // 43. TicketMachine - TrainTicketMachine
        System.out.println("\n. TicketMachine - TrainTicketMachine");
        TicketMachine machines = new TicketMachine();
        machines.issueTicket();
        TicketMachine trainMachine = new TrainTicketMachine();
        trainMachine.issueTicket();
        TrainTicketMachine ttm = new TrainTicketMachine();
        ttm.issueTicket();
        ttm.showPlatformNumber();

        // 44. Membership - GymMembership
        System.out.println("\n. Membership - GymMembership");
        Membership membership = new Membership();
        membership.register();
        Membership gym = new GymMembership();
        gym.register();
        GymMembership gm = new GymMembership();
        gm.register();
        gm.assignTrainer();

        // 45. Schedule - FlightSchedule
        System.out.println("\n. Schedule - FlightSchedule");
        Schedule schedule = new Schedule();
        schedule.update();
        Schedule flightSchedule = new FlightSchedule();
        flightSchedule.update();
        FlightSchedule fs = new FlightSchedule();
        fs.update();
        fs.rescheduleFlight();

        // 46. Shop - BookStore
        System.out.println("\n. Shop - BookStore");
        Shop shop = new Shop();
        shop.open();
        Shop bookstore = new BookStore();
        bookstore.open();
        BookStore bs = new BookStore();
        bs.open();
        bs.listGenres();

        // 47. Currency - CryptoCurrency
        System.out.println("\n. Currency - CryptoCurrency");
        Currency currency = new Currency();
        currency.convert();
        Currency crypto = new CryptoCurrency();
        crypto.convert();
        CryptoCurrency cc = new CryptoCurrency();
        cc.convert();
        cc.trackValue();

        // 48. Festival - Diwali
        System.out.println("\n. Festival - Diwali");
        Festival festival = new Festival();
        festival.celebrate();
        Festival diwali = new Diwali();
        diwali.celebrate();
        Diwali d = new Diwali();
        d.celebrate();
        d.lightFirecrackers();

        // 49. Parcel - CourierParcel
        System.out.println("\n. Parcel - CourierParcel");
        Parcel parcel = new Parcel();
        parcel.ship();
        Parcel courier = new CourierParcel();
        courier.ship();
        CourierParcel cp = new CourierParcel();
        cp.ship();
        cp.trackDelivery();

        // 50. WaterSource - River
        System.out.println("\n. WaterSource - River");
        WaterSource source = new WaterSource();
        source.flow();
        WaterSource river = new River();
        river.flow();
        River r = new River();
        r.flow();
        r.supportFishing();

        // 51. Contract - EmploymentContract
        System.out.println("\n. Contract - EmploymentContract");
        Contract contract = new Contract();
        contract.sign();
        Contract employment = new EmploymentContract();
        employment.sign();
        EmploymentContract ec = new EmploymentContract();
        ec.sign();
        ec.assignRole();

        // 52. Permit - DrivingPermit
        System.out.println("\n. Permit - DrivingPermit");
        Permit permit = new Permit();
        permit.authorize();
        Permit drivingPermit = new DrivingPermit();
        drivingPermit.authorize();
        DrivingPermit dp = new DrivingPermit();
        dp.authorize();
        dp.checkEligibility();

        // 53. Election - PresidentialElection
        System.out.println("\n. Election - PresidentialElection");
        Election election = new Election();
        election.conduct();
        Election presElection = new PresidentialElection();
        presElection.conduct();
        PresidentialElection pe = new PresidentialElection();
        pe.conduct();
        pe.countVotes();

        // 54. Hospital - ChildrenHospital
        System.out.println("\n. Hospital - ChildrenHospital");
        Hospital hospital = new Hospital();
        hospital.admit();
        Hospital childrenHosp = new ChildrenHospital();
        childrenHosp.admit();
        ChildrenHospital ch = new ChildrenHospital();
        ch.admit();
        ch.provideToys();


        // 56. SensorDevice - AirQualitySensor
        System.out.println("\n. SensorDevice - AirQualitySensor");
        SensorDevice sensorDevice = new SensorDevice();
        sensorDevice.monitor();
        SensorDevice airSensor = new AirQualitySensor();
        airSensor.monitor();
        AirQualitySensor aqs = new AirQualitySensor();
        aqs.monitor();
        aqs.reportPollutionLevel();

        // 57. FestivalEvent - CulturalProgram
        System.out.println("\n. FestivalEvent - CulturalProgram");
        FestivalEvent festivalEvent = new FestivalEvent();
        festivalEvent.organize();
        FestivalEvent cultural = new CulturalProgram();
        cultural.organize();
        CulturalProgram cp2 = new CulturalProgram();
        cp2.organize();
        cp2.inviteArtists();

        // 58. System - SecuritySystem
        System.out.println("\n. System - SecuritySystem");
        Systems system = new Systems();
        system.start();
        Systems security = new SecuritySystem();
        security.start();
        SecuritySystem ss = new SecuritySystem();
        ss.start();
        ss.detectIntrusion();

        // 59. Booth - VotingBooth
        System.out.println("\n. Booth - VotingBooth");
        Booth booth = new Booth();
        booth.serve();
        Booth votingBooth = new VotingBooth();
        votingBooth.serve();
        VotingBooth vb = new VotingBooth();
        vb.serve();
        vb.secureBallot();

        // 60. GameConsole - PlayStation
        System.out.println("\n. GameConsole - PlayStation");
        GameConsole console = new GameConsole();
        console.loadGame();
        GameConsole ps = new PlayStation();
        ps.loadGame();
        PlayStation playstation = new PlayStation();
        playstation.loadGame();
        playstation.connectToNetwork();

        // 61. Museum - ScienceMuseum
        System.out.println("\n. Museum - ScienceMuseum");
        Museum museum = new Museum();
        museum.displayArtifacts();
        Museum scienceMuseum = new ScienceMuseum();
        scienceMuseum.displayArtifacts();
        ScienceMuseum sm = new ScienceMuseum();
        sm.displayArtifacts();
        sm.hostExperiment();

        // 62. Loan - EducationLoan
        System.out.println("\n. Loan - EducationLoan");
        Loan loan = new Loan();
        loan.apply();
        Loan eduLoan = new EducationLoan();
        eduLoan.apply();
        EducationLoan el = new EducationLoan();
        el.apply();
        el.submitDocuments();

        // 63. Factory - CarFactory
        System.out.println("\n. Factory - CarFactory");
        Factory factory = new Factory();
        factory.manufacture();
        Factory carFactory = new CarFactory();
        carFactory.manufacture();
        CarFactory cf = new CarFactory();
        cf.manufacture();
        cf.paintVehicle();

        // 64. Farm - OrganicFarm
        System.out.println("\n. Farm - OrganicFarm");
        Farm farm = new Farm();
        farm.cultivate();
        Farm organic = new OrganicFarm();
        organic.cultivate();
        OrganicFarm of = new OrganicFarm();
        of.cultivate();
        of.addCompost();

        // 65. Classroom - ScienceClassroom
        System.out.println("\n. Classroom - ScienceClassroom");
        Classroom classroom = new Classroom();
        classroom.teach();
        Classroom science = new ScienceClassroom();
        science.teach();
        ScienceClassroom sc = new ScienceClassroom();
        sc.teach();
        sc.conductExperiment();

        // 66. Studio - MusicStudio
        System.out.println("\n. Studio - MusicStudio");
        Studio studio = new Studio();
        studio.record();
        Studio music = new MusicStudio();
        music.record();
        MusicStudio ms = new MusicStudio();
        ms.record();
        ms.mixTrack();

        // 67. Park - NationalPark
        System.out.println("\n. Park - NationalPark");
        Park park = new Park();
        park.maintain();
        Park national = new NationalPark();
        national.maintain();
        NationalPark np = new NationalPark();
        np.maintain();
        np.protectWildlife();

        // 68. Festival - Christmas
        System.out.println("\n. Festival - Christmas");
        Festi festi = new Festi();
        festival.celebrate();
        Festi christmas = new Christmas();
        christmas.celebrate();
        Christmas xmas = new Christmas();
        xmas.celebrate();
        xmas.decorateTree();

        // 69. ResearchCenter - SpaceResearchCenter
        System.out.println("\n. ResearchCenter - SpaceResearchCenter");
        ResearchCenter rc = new ResearchCenter();
        rc.analyze();
        ResearchCenter space = new SpaceResearchCenter();
        space.analyze();
        SpaceResearchCenter src = new SpaceResearchCenter();
        src.analyze();
        src.launchSatellite();

        // 70. BankAccount - FixedDepositAccount
        System.out.println("\n. BankAccount - FixedDepositAccount");
        BankAccount bankaccount = new BankAccount();
        bankaccount.access();
        BankAccount fd = new FixedDepositAccount();
        fd.access();
        FixedDepositAccount fda = new FixedDepositAccount();
        fda.access();
        fda.calculateMaturity();

        // 71. Zoo - BirdSanctuary
        System.out.println("\n. Zoo - BirdSanctuary");
        Zoo zoo = new Zoo();
        zoo.displayAnimals();
        Zoo sanctuary = new BirdSanctuary();
        sanctuary.displayAnimals();
        BirdSanctuary birdSanctuary = new BirdSanctuary();
        birdSanctuary.displayAnimals();
        birdSanctuary.feedBirds();

        // 72. LibraryCard - StudentLibraryCard
        System.out.println("\n. LibraryCard - StudentLibraryCard");
        LibraryCard card = new LibraryCard();
        card.scan();
        LibraryCard student = new StudentLibraryCard();
        student.scan();
        StudentLibraryCard slc = new StudentLibraryCard();
        slc.scan();
        slc.trackOverdueBooks();

        // 73. Battery - LithiumBattery
        System.out.println("\n. Battery - LithiumBattery");
        Battery battery = new Battery();
        battery.charge();
        Battery lithium = new LithiumBattery();
        lithium.charge();
        LithiumBattery lb = new LithiumBattery();
        lb.charge();
        lb.showChargeLevel();

        // 74. Event - WeddingEvent
        System.out.println("\n. Event - WeddingEvent");
        Event event = new Event();
        event.schedule();
        Event wedding = new WeddingEvent();
        wedding.schedule();
        WeddingEvent we = new WeddingEvent();
        we.schedule();
        we.bookVenue();

        // 75. Bill - ElectricityBill
        System.out.println("\n. Bill - ElectricityBill");
        Bill bill = new Bill();
        bill.generate();
        Bill electricity = new ElectricityBill();
        electricity.generate();
        ElectricityBill eb = new ElectricityBill();
        eb.generate();
        eb.applySubsidy();

        // 76. Menu - RestaurantMenu
        System.out.println("\n. Menu - RestaurantMenu");
        Menu menu = new Menu();
        menu.display();
        Menu restaurant = new RestaurantMenu();
        restaurant.display();
        RestaurantMenu rm = new RestaurantMenu();
        rm.display();
        rm.filterByCuisine();

        // 77. Post - BlogPost
        System.out.println("\n. Post - BlogPost");
        Post post = new Post();
        post.publish();
        Post blog = new BlogPost();
        blog.publish();
        BlogPost bp = new BlogPost();
        bp.publish();
        bp.addTags();

        // 78. Alert - WeatherAlert
        System.out.println("\n. Alert - WeatherAlert");
        Alert alert = new Alert();
        alert.notice();
        Alert weather = new WeatherAlert();
        weather.notice();
        WeatherAlert wa = new WeatherAlert();
        wa.notice();
        wa.updateForecast();

        // 78. Wallet - DigitalWallet
        System.out.println("\n. Wallet - DigitalWallet");
        Wallet wallet = new Wallet();
        wallet.pay();
        Wallet digital = new DigitalWallet();
        digital.pay();
        DigitalWallet dw = new DigitalWallet();
        dw.pay();
        dw.scanQRCode();

        // 79. Workout - YogaSession
        System.out.println("\n. Workout - YogaSession");
        Workout workout = new Workout();
        workout.start();
        Workout yoga = new YogaSession();
        yoga.start();
        YogaSession ys = new YogaSession();
        ys.start();
        ys.playRelaxingMusic();

        // 80. Outlet - SmartOutlet
        System.out.println("\n. Outlet - SmartOutlet");
        Outlet outlet = new Outlet();
        outlet.supplyPower();
        Outlet smart = new SmartOutlet();
        smart.supplyPower();
        SmartOutlet so = new SmartOutlet();
        so.supplyPower();
        so.trackUsage();

        // 81. CabService - ElectricCabService
        System.out.println("\n. CabService - ElectricCabService");
        CabService cab = new CabService();
        cab.book();
        CabService electric = new ElectricCabService();
        electric.book();
        ElectricCabService ecs = new ElectricCabService();
        ecs.book();
        ecs.estimateCharge();

        // 82. Lecture - OnlineLecture
        System.out.println("\n. Lecture - OnlineLecture");
        Lecture lecture = new Lecture();
        lecture.deliver();
        Lecture online = new OnlineLecture();
        online.deliver();
        OnlineLecture ol = new OnlineLecture();
        ol.deliver();
        ol.enableChat();

        // 83. Form - ApplicationForm
        System.out.println("\n. Form - ApplicationForm");
        Form form = new Form();
        form.submit();
        Form application = new ApplicationForm();
        application.submit();
        ApplicationForm af = new ApplicationForm();
        af.submit();
        af.uploadDocuments();

        // 84. Connection - InternetConnection
        System.out.println("\n. Connection - InternetConnection");
        Connection connection = new Connection();
        connection.establish();
        Connection internet = new InternetConnection();
        internet.establish();
        InternetConnection ic = new InternetConnection();
        ic.establish();
        ic.checkSpeed();

        // 85. Garage - BikeGarage
        System.out.println("\n. Garage - BikeGarage");
        Garage garage = new Garage();
        garage.service();
        Garage bike = new BikeGarage();
        bike.service();
        BikeGarage bg = new BikeGarage();
        bg.service();
        bg.inflateTires();

        // 86. Advertisement - VideoAd
        System.out.println("\n. Advertisement - VideoAd");
        Advertisement ad = new Advertisement();
        ad.display();
        Advertisement video = new VideoAd();
        video.display();
        VideoAd va = new VideoAd();
        va.display();
        va.trackViews();

        // 87. Interview - TechInterview
        System.out.println("\n. Interview - TechInterview");
        Interview interview = new Interview();
        interview.conduct();
        Interview tech = new TechInterview();
        tech.conduct();
        TechInterview ti = new TechInterview();
        ti.conduct();
        ti.askCodingQuestion();

        // 88. Exam - OnlineExam
        System.out.println("\n. Exam - OnlineExam");
        Exam exam = new Exam();
        exam.evaluate();
        Exam onlineExam = new OnlineExam();
        onlineExam.evaluate();
        OnlineExam oe = new OnlineExam();
        oe.evaluate();
        oe.autoGrade();

        // 89. FuelStation - ElectricChargingStation
        System.out.println("\n. FuelStation - ElectricChargingStation");
        FuelStation fuel = new FuelStation();
        fuel.refill();
        FuelStation electrical = new ElectricChargingStation();
        electrical.refill();
        ElectricChargingStation electricChargingStation = new ElectricChargingStation();
        electricChargingStation.refill();
        electricChargingStation.chargeVehicle();

        // 90. Order - OnlineOrder
        System.out.println("\n. Order - OnlineOrder");
        Order order = new Order();
        order.process();
        Order on = new OnlineOrder();
        on.process();
        OnlineOrder oo = new OnlineOrder();
        oo.process();
        oo.trackDeliveryStatus();

        // 91. Cinema - IMAXCinema
        System.out.println("\n. Cinema - IMAXCinema");
        Cinema cinema = new Cinema();
        cinema.screenMovie();
        Cinema imax = new IMAXCinema();
        imax.screenMovie();
        IMAXCinema ics = new IMAXCinema();
        ics.screenMovie();
        ics.adjustSurroundSound();

        // 92. Subscription - MagazineSubscription
        System.out.println("\n. Subscription - MagazineSubscription");
        Subscription sub = new Subscription();
        sub.action();
        Subscription magazineSub = new MagzineSubscription();
        magazineSub.action();
        MagzineSubscription msn = new MagzineSubscription();
        msn.action();
        msn.deliverIssue();

        //93.Permission-ConstructionPermit
        System.out.println("==== Permit Example ====");
        Permission permission = new Permission();
        permission.action();

        Permission construction = new ConstructionPermit();
        construction.action();

        ConstructionPermit cpt = new ConstructionPermit();
        cpt.action();
        cpt.inspectSite();

        // 94. Mission - SpaceMission
        System.out.println("\n. Mission - SpaceMission");
        Mission mission = new Mission();
        mission.action();
        Mission spac = new SpaceMission();
        spac.action();
        SpaceMission smn = new SpaceMission();
        smn.action();
        smn.launchRocket();


        // 95. Process - HiringProcess
        System.out.println("\n6. Process - HiringProcess");
        Process process = new Process();
        process.action();
        Process hiring = new HiringProcess();
        hiring.action();
        HiringProcess hp = new HiringProcess();
        hp.action();
        hp.interviewCandidate();


        // 96. Pass - MetroPass
        System.out.println("\n. Pass - MetroPass");
        Pass pass = new Pass();
        pass.action();
        Pass metro = new MetroPass();
        metro.action();
        MetroPass mp = new MetroPass();
        mp.action();
        mp.scanAtGate();

        // 97. Exhibit - DinosaurExhibit
        System.out.println("\n. Exhibit - DinosaurExhibit");
        Exhibit exhibit = new Exhibit();
        exhibit.action();
        Exhibit dinosaur = new DinosaurExhibit();
        dinosaur.action();
        DinosaurExhibit de = new DinosaurExhibit();
        de.action();
        de.playRoarSound();

        // 98. Routine - MorningRoutine
        System.out.println("\n. Routine - MorningRoutine");
        Routine routine = new Routine();
        routine.action();
        Routine morning = new MorningRoutine();
        morning.action();
        MorningRoutine mr = new MorningRoutine();
        mr.action();
        mr.makeCoffee();

        // 99. Record - MedicalRecord
        System.out.println("\n. Record - MedicalRecord");
        Record record = new Record();
        record.action();
        Record medical = new MedicalRecord();
        medical.action();
        MedicalRecord medRec = new MedicalRecord();
        medRec.action();
        medRec.updateDiagnosis();

        // 100.Filter-AIFilter
        System.out.println("\n. Base Filter:");
        Filter basicFilter = new Filter();
        basicFilter.apply();

        Filter advancedFilter = new AIFilter();
        advancedFilter.apply();

        AIFilter neuralFilter = new AIFilter();
        neuralFilter.apply();
        neuralFilter.enhanceDetails();



    }

}
