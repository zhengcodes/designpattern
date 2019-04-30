package creational.builder;

import creational.builder.impl.HPComputerBuilder;

public class ComputerCustomerTest {
    public static void main(String[] args) {

        Director director = new Director();

        ComputerBuilder hp = new HPComputerBuilder();

        director.setComputerBuilder(hp);

        director.constructComputer();

        //get the pc
        Computer pc = director.getComputer();
        System.out.printf(pc.toString());
    }
}
