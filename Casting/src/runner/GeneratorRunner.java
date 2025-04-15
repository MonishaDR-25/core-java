package runner;

import in.moni.internal.Generator;
import in.moni.internal.Inverter;


public class GeneratorRunner {
    public static void main(String[] args) {
        System.out.println("======Gnerator Hierachy=====");

        Generator generator = new Generator();
        generator.generate();

        System.out.println("==========");
        Generator generator1=new Inverter();
        generator1.generate();

        //typecast
        Inverter inverter=(Inverter)generator1;
        inverter.backup();

        System.out.println("------------------------");
        Inverter inverter1=new Inverter();
        inverter1.generate();
        inverter1.backup();
    }
}
