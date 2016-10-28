package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {
        // Test
        AbstractComponent leaf1 = new LeafComponent(1);
        AbstractComponent leaf3 = new LeafComponent(3);
        AbstractComponent leaf2 = new LeafComponent(2);
        AbstractComponent leaf9 = new LeafComponent(9);
        AbstractComponent leaf11 = new LeafComponent(11);
        AbstractComponent multiplyA = new MultiplicationComponent(leaf9, leaf11);
        AbstractComponent additionA = new AdditionComponent(leaf3, leaf2, multiplyA);
        AbstractComponent divisionA = new DivisionComponent(leaf1, additionA);

        System.out.println(divisionA.evaluate());

    }
}
