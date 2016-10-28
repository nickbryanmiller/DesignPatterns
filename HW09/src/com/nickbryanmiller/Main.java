package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {

        /* ----------------- Dave Homework Test Tree A ------------------------ */
        // (1 / (3 + 2 + (9 * 11)))
        AbstractComponent leafA1 = new LeafComponent(1);
        AbstractComponent leafA3 = new LeafComponent(3);
        AbstractComponent leafA2 = new LeafComponent(2);
        AbstractComponent leafA9 = new LeafComponent(9);
        AbstractComponent leafA11 = new LeafComponent(11);
        AbstractComponent multiplyA = new MultiplicationComponent(leafA9, leafA11);
        AbstractComponent additionA = new AdditionComponent(leafA3, leafA2, multiplyA);
        AbstractComponent divisionA = new DivisionComponent(leafA1, additionA);

        System.out.println("Start of First Tree Test");
        System.out.println("---------------------------------------");
        System.out.print("InfixVisitor Expression: ");
        InterfaceVisitor infix = new InfixVisitor();
        divisionA.acceptVisitor(infix);
        System.out.print(infix.toString());

        System.out.print("\nLispVisitor Expression: ");
        InterfaceVisitor lisp = new LispVisitor();
        divisionA.acceptVisitor(lisp);
        System.out.print(lisp.toString());

        System.out.print("\nEvaluatingVisitor Expression: ");
        InterfaceVisitor eval = new EvaluatingVisitor();
        divisionA.acceptVisitor(eval);
        System.out.print(eval.toString());

        System.out.print("\nTextTreeVisitor Expression: \n");
        InterfaceVisitor text = new TextTreeVisitor();
        divisionA.acceptVisitor(text);
        System.out.print(text.toString());
        System.out.println("\n---------------------------------------");
        System.out.println("End of First Tree Test\n");



        /* ----------------- Dave Homework Test Tree B ------------------------ */
        // (11 + ((1 / 2) * ((3 + -5) - 45)) + -23)
        AbstractComponent leafB11 = new LeafComponent(11);
        AbstractComponent leafB1 = new LeafComponent(1);
        AbstractComponent leafB2 = new LeafComponent(2);
        AbstractComponent leafB3 = new LeafComponent(3);
        AbstractComponent leafBN5 = new LeafComponent(-5);
        AbstractComponent leafB45 = new LeafComponent(45);
        AbstractComponent leafBN23 = new LeafComponent(-23);
        AbstractComponent additionB1 = new AdditionComponent(leafB3, leafBN5);
        AbstractComponent subtractB1 = new SubtractionComponent(additionB1, leafB45);
        AbstractComponent divisionB1 = new DivisionComponent(leafB1, leafB2);
        AbstractComponent multiplyB1 = new MultiplicationComponent(divisionB1, subtractB1);
        AbstractComponent additionB2 = new AdditionComponent(leafB11, multiplyB1, leafBN23);

        System.out.println("Start of Second Tree Test");
        System.out.println("---------------------------------------");
        System.out.print("InfixVisitor Expression: ");
        infix = new InfixVisitor();
        additionB2.acceptVisitor(infix);
        System.out.print(infix.toString());

        System.out.print("\nLispVisitor Expression: ");
        lisp = new LispVisitor();
        additionB2.acceptVisitor(lisp);
        System.out.print(lisp.toString());

        System.out.print("\nEvaluatingVisitor Expression: ");
        eval = new EvaluatingVisitor();
        additionB2.acceptVisitor(eval);
        System.out.print(eval.toString());

        System.out.print("\nTextTreeVisitor Expression: \n");
        text = new TextTreeVisitor();
        additionB2.acceptVisitor(text);
        System.out.print(text.toString());

        System.out.println("\n---------------------------------------");
        System.out.println("End of Second Tree Test\n");



        /* ----------------- Nick Homework Test Tree C ------------------------ */
        // (5 + ((4/3) * (3/4) * (7 - 13)) + (-2) + 3)
        AbstractComponent leafC5a = new LeafComponent(5);
        AbstractComponent leafC4a = new LeafComponent(4);
        AbstractComponent leafC3a = new LeafComponent(3);
        AbstractComponent leafC3b = new LeafComponent(3);
        AbstractComponent leafC4b = new LeafComponent(4);
        AbstractComponent leafC7a = new LeafComponent(7);
        AbstractComponent leafC13a = new LeafComponent(13);
        AbstractComponent leafCN2a = new LeafComponent(-2);
        AbstractComponent leafC3c = new LeafComponent(3);
        AbstractComponent addC1 = new AdditionComponent(); // root
        AbstractComponent multiplyC1 = new MultiplicationComponent();
        AbstractComponent divC1 = new DivisionComponent();
        AbstractComponent divC2 = new DivisionComponent();
        AbstractComponent subC1 = new SubtractionComponent();
        addC1.add(leafC5a, multiplyC1, leafCN2a, leafC3c);
        multiplyC1.add(divC1, divC2, subC1);
        divC1.add(leafC4a, leafC3a);
        divC2.add(leafC3b, leafC4b);
        subC1.add(leafC7a, leafC13a);


        System.out.println("Start of Third Tree Test");
        System.out.println("---------------------------------------");
        System.out.print("InfixVisitor Expression: ");
        infix = new InfixVisitor();
        addC1.acceptVisitor(infix);
        System.out.print(infix.toString());

        System.out.print("\nLispVisitor Expression: ");
        lisp = new LispVisitor();
        addC1.acceptVisitor(lisp);
        System.out.print(lisp.toString());

        System.out.print("\nEvaluatingVisitor Expression: ");
        eval = new EvaluatingVisitor();
        addC1.acceptVisitor(eval);
        System.out.print(eval.toString());

        System.out.print("\nTextTreeVisitor Expression: \n");
        text = new TextTreeVisitor();
        addC1.acceptVisitor(text);
        System.out.print(text.toString());

        System.out.println("\n---------------------------------------");
        System.out.println("End of Third Tree Test\n");



        /* ----------------- Nick Homework Test Tree D ------------------------ */
        // (1/0) -> error
        AbstractComponent leafD1 = new LeafComponent(1);
        AbstractComponent leafD0 = new LeafComponent(0);
        AbstractComponent divD0 = new DivisionComponent(leafD1, leafD0);

        System.out.println("Start of Fourth Tree Test");
        System.out.println("---------------------------------------");
        System.out.print("InfixVisitor Expression: ");
        infix = new InfixVisitor();
        divD0.acceptVisitor(infix);
        System.out.print(infix.toString());

        System.out.print("\nLispVisitor Expression: ");
        lisp = new LispVisitor();
        divD0.acceptVisitor(lisp);
        System.out.print(lisp.toString());

        System.out.print("\nEvaluatingVisitor Expression: ");
        eval = new EvaluatingVisitor();
        divD0.acceptVisitor(eval);
        System.out.print(eval.toString());

        System.out.print("\nTextTreeVisitor Expression: \n");
        text = new TextTreeVisitor();
        divD0.acceptVisitor(text);
        System.out.print(text.toString());

        System.out.println("\n---------------------------------------");
        System.out.println("End of Fourth Tree Test\n");

    }
}
