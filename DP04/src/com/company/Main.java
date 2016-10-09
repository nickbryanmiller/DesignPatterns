package com.company;

public class Main {

    public static void main(String[] args) {

        // Below is the code for Currency
        Magnitude cur0 = new Currency(0);
        Magnitude cur1 = new Currency(1);
        Magnitude cur1Same = new Currency(1);
        Magnitude cur2 = new Currency(2);

        System.out.println("\nCurrency Test");
        System.out.println("--------------------------------");
        // Less than
        System.out.println("Test: Less Than");
        System.out.println("(1 < 0) = " + cur1.lessThan(cur0)); // true
        System.out.println("(1 < 1) = " + cur1.lessThan(cur1Same)); // false
        System.out.println("(1 < 2) = " + cur1.lessThan(cur2)); // false
        // Less than or equal to
        System.out.println("Test: Less Than Or Equal To");
        System.out.println("(1 <= 0) = " + cur1.lessThanEqualTo(cur0)); // true
        System.out.println("(1 <= 1) = " + cur1.lessThanEqualTo(cur1Same)); // true
        System.out.println("(1 <= 2) = " + cur1.lessThanEqualTo(cur2)); // false
        // Equal to
        System.out.println("Test: Equal To");
        System.out.println("(1 == 0) = " + cur1.equalTo(cur0)); // false
        System.out.println("(1 == 1) = " + cur1.equalTo(cur1Same)); // true
        System.out.println("(1 == 2) = " + cur1.equalTo(cur2)); // false
        // Greater than or equal to
        System.out.println("Test: Greater Than Or Equal To");
        System.out.println("(1 >= 0) = " + cur1.greaterThanEqualTo(cur0)); // true
        System.out.println("(1 >= 1) = " + cur1.greaterThanEqualTo(cur1Same)); // true
        System.out.println("(1 >= 2) = " + cur1.greaterThanEqualTo(cur2)); // false
        // Greater than
        System.out.println("Test: Greater Than");
        System.out.println("(1 > 0) = " + cur1.greaterThan(cur0)); // true
        System.out.println("(1 > 1) = " + cur1.greaterThan(cur1Same)); // false
        System.out.println("(1 > 2) = " + cur1.greaterThan(cur2)); // false
        // Not equal to
        System.out.println("Test: Not Equal To");
        System.out.println("(1 != 0) = " + cur1.notEqual(cur0)); // true
        System.out.println("(1 != 1) = " + cur1.notEqual(cur1Same)); // false
        System.out.println("(1 != 2) = " + cur1.notEqual(cur2)); // true

        System.out.println("--------------------------------");
        System.out.println("End Currency Test\n");

        // Below is the code for CartPoint
        Magnitude cp0 = new CartPoint(0, 0); // d = 0
        Magnitude cp1 = new CartPoint(1, 1); // d = sqrt(2) ≈ 1.4
        Magnitude cp1Same = new CartPoint(1, 1); // d = sqrt(2) ≈ 1.4
        Magnitude cp2 = new CartPoint(2, 2); // d = sqrt(8) ≈ 2.8

        System.out.println("\nCartPoint Test");
        System.out.println("--------------------------------");
        // Less than
        System.out.println("Test: Less Than");
        System.out.println("(1.4 < 0.0) = " + cp1.lessThan(cp0)); // true
        System.out.println("(1.4 < 1.4) = " + cp1.lessThan(cp1Same)); // false
        System.out.println("(1.4 < 2.8) = " + cp1.lessThan(cp2)); // false
        // Less than or equal to
        System.out.println("Test: Less Than Or Equal To");
        System.out.println("(1.4 <= 0.0) = " + cp1.lessThanEqualTo(cp0)); // true
        System.out.println("(1.4 <= 1.4) = " + cp1.lessThanEqualTo(cp1Same)); // true
        System.out.println("(1.4 <= 2.8) = " + cp1.lessThanEqualTo(cp2)); // false
        // Equal to
        System.out.println("Test: Equal To");
        System.out.println("(1.4 == 0.0) = " + cp1.equalTo(cp0)); // false
        System.out.println("(1.4 == 1.4) = " + cp1.equalTo(cp1Same)); // true
        System.out.println("(1.4 == 2.8) = " + cp1.equalTo(cp2)); // false
        // Greater than or equal to
        System.out.println("Test: Greater Than Or Equal To");
        System.out.println("(1.4 >= 0.0) = " + cp1.greaterThanEqualTo(cp0)); // true
        System.out.println("(1.4 >= 1.4) = " + cp1.greaterThanEqualTo(cp1Same)); // true
        System.out.println("(1.4 >= 2.8) = " + cp1.greaterThanEqualTo(cp2)); // false
        // Greater than
        System.out.println("Test: Greater Than");
        System.out.println("(1.4 > 0.0) = " + cp1.greaterThan(cp0)); // true
        System.out.println("(1.4 > 1.4) = " + cp1.greaterThan(cp1Same)); // false
        System.out.println("(1.4 > 2.8) = " + cp1.greaterThan(cp2)); // false
        // Not equal to
        System.out.println("Test: Not Equal To");
        System.out.println("(1.4 != 0.0) = " + cp1.notEqual(cp0)); // true
        System.out.println("(1.4 != 1.4) = " + cp1.notEqual(cp1Same)); // false
        System.out.println("(1.4 != 2.8) = " + cp1.notEqual(cp2)); // true

        System.out.println("--------------------------------");
        System.out.println("End CartPoint Test\n");
    }
}
