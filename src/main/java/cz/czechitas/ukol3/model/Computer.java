package cz.czechitas.ukol3.model;

public class Computer {
    private boolean isOn;
    private Processor cpu;
    private Memory ram;
    private Disc hardDisc;

    public boolean isOn(){
        return isOn;
    };
     public void turnOn(){
         if (ram == null || hardDisc == null || cpu == null) {
             System.err.println("The computer is missing several key components!");
         }
         else if (isOn) {
             System.err.println("The computer is already running.");
         } else {
        this.isOn=true;
         System.out.println("The computer was turned on.");
         }
     }

     public void turnOff() {
         if (isOn) {
             this.isOn = false;
             System.out.println("The computer was turned off.");
         }
        }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public Disc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(Disc hardDisc) {
        this.hardDisc = hardDisc;
    }

    public void createFileSized(long size) {
         if (hardDisc.getSpaceUsed() + size > hardDisc.getCapacity()) {
             System.err.println("Not enough free space.");
         } else {
             hardDisc.setSpaceUsed(hardDisc.getSpaceUsed() + size);
         }
    }

    public void deleteFileSized(long size) {
         if (hardDisc.getSpaceUsed() - size < 0) {
             System.err.println("Cannot delete into negative.");
         } else {
             hardDisc.setSpaceUsed(hardDisc.getSpaceUsed() - size);
         }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "isOn=" + isOn +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", hardDisc=" + hardDisc +
                '}';
    }
}
