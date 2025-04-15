package runner;

public class Runner {
    public static void main(String[] args) {
        String name = "Monisha";
        String UpdatedName = name.concat("R");
        System.out.println("Name:"+name);
        System.out.println("UpdatedName:"+UpdatedName);
        String u_name="MonishaR";

        if(UpdatedName == u_name){
            System.out.println("Matching");
        }
        else{
            System.out.println("Not matching");
        }
    }
}
