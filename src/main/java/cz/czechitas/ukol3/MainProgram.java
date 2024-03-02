package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Computer;
import cz.czechitas.ukol3.model.Memory;
import cz.czechitas.ukol3.model.Processor;
import cz.czechitas.ukol3.model.Disc;
/**
 * Spouštěcí třída celého programu
 */
public class MainProgram {

    public static void main(String... args) {
        Computer myPC = new Computer();
        System.out.println(myPC.toString());
        myPC.turnOn();

        Processor myProcessor = new Processor();
        myProcessor.setSpeed(2_300_000_000L);
        myProcessor.setManufacturer("Intel");

        Disc myDisc = new Disc();
        myDisc.setCapacity(269_176_337_858L);
        myDisc.setSpaceUsed(135_602_854_952L);

        Memory myMemory = new Memory();
        myMemory.setCapacity(800_000_000L);

        myPC.setCpu(myProcessor);
        myPC.setRam(myMemory);
        myPC.setHardDisc(myDisc);

        System.out.println(myPC.toString());

        myPC.turnOn();
        myPC.turnOn();
        System.out.println(myPC.toString());
        myPC.turnOff();
        myPC.turnOff();

        myPC.createFileSized(5_602_854_952L);
        System.out.println(myPC.toString());
        myPC.createFileSized(135_602_854_952L);
        System.out.println(myPC.toString());
        myPC.deleteFileSized(10_602_854_952L);
        System.out.println(myPC.toString());
        myPC.deleteFileSized(131_602_854_952L);
        System.out.println(myPC.toString());

    }

}
