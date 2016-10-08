package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {
//        Composite lc = new LinkedComposite();
//        lc.add(new Leaf<String>( "A" ), new Leaf<String>( "B" ));
//        //ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
//        //ac.toString();
//        Composite lc2 = new LinkedComposite();
//        lc2.add(new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
//        lc2.objectToString();

        Composite lc = new LinkedComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
        Composite ac = new LinkedComposite( new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
        ac.objectToString();
        ac.remove(lc);
        ac.objectToString();
    }
}
