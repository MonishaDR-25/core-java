package runner;

import in.moni.internal.*;

import java.lang.Process;

public class ObjectRunner {
    public static void main(String[] args) {
        //1.Account
        Account account=new Account("Monisha",234);
        System.out.println(account);

        //2. Advertisement
        Advertisement advertisement=new Advertisement("colors kannada",5);
        System.out.println(advertisement);

        //3.Factory
        Factory factory = new Factory("Hyderabad", 100);
        System.out.println(factory);

        //4
        Farm farm = new Farm("GreenFields", 500);
        System.out.println(farm);

        Classroom classroom = new Classroom("Physics", 30);
        System.out.println(classroom);

        Studio studio = new Studio("SoundMix", 3);
        System.out.println(studio);

        Park park = new Park("Central Park", 200);
        System.out.println(park);

        Festival festival = new Festival("Diwali", 5);
        System.out.println(festival);

        ResearchCenter center = new ResearchCenter("ISRO", 1000);
        System.out.println(center);

        BankAccount bankAccount = new BankAccount("SBI", 50000);
        System.out.println(bankAccount);

        Zoo zoo = new Zoo("Mysore Zoo", 150);
        System.out.println(zoo);

        LibraryCard card = new LibraryCard("L123", 2);
        System.out.println(card);

        Battery battery = new Battery("Duracell", 3000);
        System.out.println(battery);

        Event event = new Event("Marriage", 200);
        System.out.println(event);

        Bill bill = new Bill("Electricity", 1200);
        System.out.println(bill);

        Menu menu = new Menu("Dinner", 5);
        System.out.println(menu);

        Post post = new Post("Tech Blog", 2024);
        System.out.println(post);

        Alert alert = new Alert("Flood Warning", 3);
        System.out.println(alert);

        Wallet wallet = new Wallet("Paytm", 1500);
        System.out.println(wallet);

        Workout workout = new Workout("Yoga", 60);
        System.out.println(workout);

        Outlet outlet = new Outlet("Socket-1", 220);
        System.out.println(outlet);

        CabService cab = new CabService("Ola", 50);
        System.out.println(cab);

        Lecture lecture = new Lecture("Java Basics", 90);
        System.out.println(lecture);

        Form form = new Form("Job App", 4);
        System.out.println(form);

        Connection connection = new Connection("Broadband", 100);
        System.out.println(connection);

        Garage garage = new Garage("AutoFix", 25);
        System.out.println(garage);

        Interview interview = new Interview("Developer Role", 3);
        System.out.println(interview);

        Exam exam = new Exam("Math Test", 100);
        System.out.println(exam);

        FuelStation station = new FuelStation("HP", 800);
        System.out.println(station);

        Order order = new Order("Books", 10);
        System.out.println(order);

        Cinema cinema = new Cinema("PVR", 200);
        System.out.println(cinema);

        Animal animal = new Animal("Mammal", 5);
        System.out.println(animal);

        Appliance appliance = new Appliance("LG", 1500);
        System.out.println(appliance);

        ApplianceRemote remote = new ApplianceRemote("1.2.3", 10);
        System.out.println(remote);

        Appliances appliances = new Appliances("Kitchen", 299.99);
        System.out.println(appliances);

        Bag bag = new Bag("Red", 25);
        System.out.println(bag);

        Ball ball = new Ball("Rubber", 7.5);
        System.out.println(ball);

        Bird bird = new Bird("Parrot", 0.75);
        System.out.println(bird);

        Book book = new Book("Java Programming", "Anita Sharma");
        System.out.println(book);

        Booth booth = new Booth("Hall A", true);
        System.out.println(booth);

        Box box = new Box("Rectangle", 40);
        System.out.println(box);

        Building building = new Building("Sky Tower", 50);
        System.out.println(building);

        Button button = new Button("Submit", true);
        System.out.println(button);

        Car car = new Car("Tesla", 240);
        System.out.println(car);

        Cloth cloth = new Cloth("Cotton", "M");
        System.out.println(cloth);

        Clothing clothing = new Clothing("Jacket", 129.99);
        System.out.println(clothing);

        Computer computer = new Computer("HP", 16);
        System.out.println(computer);

        Container container = new Container("Water", 20);
        System.out.println(container);

        Contract contract = new Contract("Company A", "Company B");
        System.out.println(contract);

        Currency currency = new Currency("Rupee", 83.27);
        System.out.println(currency);

        //using setter
        Device device = new Device();
        device.setBrand("Samsung");
        device.setPrice(499.99);
        System.out.println(device);

        Display display = new Display();
        display.setType("LCD");
        display.setResolution(720);
        System.out.println(display);

        Document document = new Document();
        document.setTitle("Project Report");
        document.setPages(15);
        System.out.println(document);

        Election election = new Election();
        election.setRegion("Delhi");
        election.setYear(2025);
        System.out.println(election);

        Employee employee = new Employee();
        employee.setName("Ravi Kumar");
        employee.setSalary(65000);
        System.out.println(employee);

        Exhibit exhibit = new Exhibit();
        exhibit.setName("Ancient Coins");
        exhibit.setCategory("Numismatics");
        System.out.println(exhibit);

        Fan fan = new Fan();
        fan.setBrand("Usha");
        fan.setSpeed(5);
        System.out.println(fan);

        Festi festi = new Festi();
        festi.setEvent("Music Fest");
        festi.setPlace("Mumbai");
        System.out.println(festi);

        FestivalEvent festivalEvent = new FestivalEvent();
        festivalEvent.setName("Diwali Celebration");
        festivalEvent.setDate("2025-11-12");
        System.out.println(festivalEvent);

        Filter filter = new Filter();
        filter.setType("Water");
        filter.setBrand("PureIt");
        System.out.println(filter);

        Food food = new Food();
        food.setName("Paneer Tikka");
        food.setIsVegetarian(true);
        System.out.println(food);

        Furniture furniture = new Furniture();
        furniture.setItem("Sofa Set");
        furniture.setCost(25000);
        System.out.println(furniture);

        Gadget gadget = new Gadget();
        gadget.setName("Smartwatch");
        gadget.setVersion("2.0");
        System.out.println(gadget);

        GameConsole gameConsole = new GameConsole();
        gameConsole.setBrand("Sony");
        gameConsole.setModel("PS5");
        System.out.println(gameConsole);

        Hospital hospital = new Hospital();
        hospital.setName("Apollo");
        hospital.setLocation("Chennai");
        System.out.println(hospital);

        Instrument instrument = new Instrument();
        instrument.setType("Guitar");
        instrument.setMaterial("Wood");
        System.out.println(instrument);

        Light light = new Light();
        light.setColor("Warm White");
        light.setWattage(12);
        System.out.println(light);

        Loan loan = new Loan();
        loan.setType("Home");
        loan.setAmount(750000);
        System.out.println(loan);

        Machine machine = new Machine();
        machine.setName("Lathe");
        machine.setPower(5);
        System.out.println(machine);

        Membership membership = new Membership();
        membership.setType("Premium");
        membership.setDuration(12);
        System.out.println(membership);

        Message message = new Message();
        message.setSender("Admin");
        message.setContent("Welcome to the portal");
        System.out.println(message);

        Mission mission = new Mission();
        mission.setTitle("Moon Mission");
        mission.setYear(2024);
        System.out.println(mission);

        Museum museum = new Museum();
        museum.setName("National Museum");
        museum.setCity("Delhi");
        System.out.println(museum);

        Parcel parcel = new Parcel();
        parcel.setSender("Client");
        parcel.setRecipient("Bangalore");
        System.out.println(parcel);

        Pass pass = new Pass();
        pass.setValidity("year");
        pass.setType("Monthly");
        System.out.println(pass);

        Permission permission = new Permission();
        permission.setUser("Users");
        permission.setLevel("Admin Access");
        System.out.println(permission);

        Permit permit = new Permit();
        permit.setNumber(456);
        permit.setIssuedBy("Govt Office");
        System.out.println(permit);

        Person person = new Person();
        person.setName("Arjun");
        person.setAge(30);
        System.out.println(person);

        Plant plant = new Plant();
        plant.setSpecies("Rose");
        plant.setLocation("Bangalore");
        System.out.println(plant);

        Process process = new Process();
        process.setStep(1);
        process.setDuration("year");
        System.out.println(process);

        Record record = new Record();
        record.setTitle("Attendance");
        record.setFormat("UpperCase");
        System.out.println(record);

        Routine routine = new Routine();
        routine.setActivity("Workout");
        routine.setTime(60);
        System.out.println(routine);

        Schedule schedule = new Schedule();
        schedule.setDate("Monday");
        schedule.setEvent("Yoga");
        System.out.println(schedule);

        Sensor sensor = new Sensor();
        sensor.setType("Temperature");
        sensor.setStatus("Summer");
        System.out.println(sensor);

        SensorDevice sensorDevice = new SensorDevice();
        sensorDevice.setModel("SD-101");
        sensorDevice.setFunction("running");
        System.out.println(sensorDevice);

        Service service = new Service();
        service.setProvider("Internet");
        service.setType("Active");
        System.out.println(service);

        Shape shape = new Shape();
        shape.setName("Circle");
        shape.setSides(0);
        System.out.println(shape);

        Shop shop = new Shop();
        shop.setName("General Store");
        shop.setLocation("Chennai");
        System.out.println(shop);

        Subscription subscription = new Subscription();
        subscription.setUser("Music");
        subscription.setUser("1 Year");
        System.out.println(subscription);

        Systems systems = new Systems();
        systems.setName("Operating");
        systems.setVersion("IT");
        System.out.println(systems);

        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setType("Local");
        ticketMachine.setLocation("Station A");
        System.out.println(ticketMachine);

        Tool tool = new Tool();
        tool.setName("Hammer");
        tool.setPurpose("Cooking");
        System.out.println(tool);

        Toy toy = new Toy();
        toy.setName("FunKids");
        toy.setCategory("Kids");
        System.out.println(toy);

        Utensil utensils = new Utensil();
        utensils.setType("Steel");
        utensils.setMaterial("Steel");
        System.out.println(utensils);

        Vehicle vehicle = new Vehicle();
        vehicle.setModel("Swift");
        vehicle.setYear(2022);
        System.out.println(vehicle);

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.setBrand("LG");
        washingMachine.setCapacity(7);
        System.out.println(washingMachine);

        WaterSource waterSource = new WaterSource();
        waterSource.setType("Lakeview");
        waterSource.setType("Groundwater");
        System.out.println(waterSource);

    }
}
