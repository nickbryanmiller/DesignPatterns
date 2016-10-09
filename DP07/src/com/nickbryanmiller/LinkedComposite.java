package com.nickbryanmiller;

// This is a ConcreteComposite that uses a LinkedList as its composite list

public class LinkedComposite extends Composite {
    String value = "LinkedComposite";
    LinkedList<Composite> myList;

    // Constructor that allows the option of adding composites during instantiation
    public LinkedComposite(Composite... comps) {
        this.value = "LinkedComposite";
        myList = new LinkedList<Composite>();
        add(comps);
    }

    // Uses varargs to add each component to the LinkedList
    @Override
    public void add(Composite... comps) {
        for (Composite comp : comps) {
            myList.addNode(comp);
        }
    }

    // Removes each of these composites from the LinkedList
    @Override
    public void remove(Composite... comps) {
        for (Composite comp : comps) {
            myList.deleteWithValue(comp);
        }
    }

    // Gets the list associated with this particular composite type
    @Override
    public LinkedList<Composite> getComponentList() {
        return this.myList;
    }

    // Utility function that uses the below recursive function to print out the tree structure
    @Override
    public void objectToString() {
        Node<Composite> head = myList.getHead();
        if (head != null) {
            System.out.println(this.getValue() + " Containing");
            objectToString(head, myList, "\t");
        }
        else {
            System.out.println(this.getValue());
        }
    }

    // Goes through the entire tree and calls the appropriate string method after downcasting the composite
    public void objectToString(Node<Composite> head, LinkedList<Composite> aList, String indents) {
        while (head != null) {
            if (head.value instanceof LinkedComposite) {
                LinkedComposite lc = ((LinkedComposite) head.value);
                System.out.println(indents + lc.value + " Containing");
                lc.objectToString(lc.myList.getHead(), lc.myList, indents + "\t");
            }
            else if (head.value instanceof ArrayComposite) {
                ArrayComposite ac = ((ArrayComposite) head.value);
                System.out.println(indents + ac.value + " Containing");
                ac.objectToString(ac.array, indents + "\t");
            }
            else if (head.value instanceof InstanceComposite) {
                InstanceComposite ic = ((InstanceComposite) head.value);
                if (ic.variable != null) {
                    System.out.println(indents + ic.getValue() + " Containing");
                    ic.objectToString(ic.variable, indents + "\t");
                }
                else {
                    System.out.println(indents + this.getValue());
                }
            }
            else if (head.value instanceof StaticArrayComposite) {
                StaticArrayComposite sac = ((StaticArrayComposite) head.value);
                System.out.println(indents + sac.value + " Containing");
                sac.objectToString(sac.array, indents + "\t");
            }
            else if (head.value instanceof Leaf) {
                Leaf leaf = ((Leaf) head.value);
                System.out.println(indents + "Leaf " + leaf.value);
            }
            head = head.next;
        }
    }

    // Grabs the name of this object
    @Override
    public Object getValue() {
        return value;
    }
}