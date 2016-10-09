package com.company;

public abstract class Magnitude {

    // This method will be overridden by the subclass
    public abstract boolean lessThan(Magnitude m);

    // NOTE: All of the below method will use the lessThan method to get the desired result

    // This checks if x <= y by checking if x < y or x == y by using the equalTo method for ease of coding
    public final boolean lessThanEqualTo(Magnitude m) {
        if (lessThan(m) || equalTo(m)) {
            return true;
        }
        else {
            return false;
        }
    }
    // This checks if x == y by checking if x !< y and y !< x leaving only equals
    public final boolean equalTo(Magnitude m) {
        if (!lessThan(m) && !m.lessThan(this)) {
            return true;
        }
        else {
            return false;
        }
    }
    // This checks if x !< y which means it is everything equal and greater
    public final boolean greaterThanEqualTo(Magnitude m) {
        if (!lessThan(m)) {
            return true;
        }
        else {
            return false;
        }
    }
    // This checks if x > y by checking if x !< y and x != y by using the equalTo method for ease of coding
    public final boolean greaterThan(Magnitude m) {
        if (!lessThan(m) && !equalTo(m)) {
            return true;
        }
        else {
            return false;
        }
    }
    // This checks if x != y by using the equalTo method for ease of coding
    public final boolean notEqual(Magnitude m) {
        if (!equalTo(m)) {
            return true;
        }
        else {
            return false;
        }
    }
}