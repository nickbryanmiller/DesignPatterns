package com.nickbryanmiller;

public class TextTreeVisitor implements InterfaceVisitor {

    // We should keep a reference to what we are visiting
    private AbstractComponent ac;

    @Override
    public void visit(AbstractComponent comp) {
        this.ac = comp;
    }

    @Override
    public String toString() {
        return doTextTree("", ac);
    } // Empty string for before because it is the root

    private String doTextTree(String before, AbstractComponent comp){
        // If it is a Leaf we return the value of the leaf
        if(comp.getChildren().size() <= 0) {
            return "[" + comp.toString() + "]\n"; // All the stuff should be in brackets
        }
        else { // If not then put all the indents and stuff before
            String output = "";
            output = output + "[" + comp.toString() + "]\n";
            String childrenStr = "";

            for (int i = 0; i < comp.getChildren().size(); i++){
                String beforeChild = " |     ";
                // Add spacing to account for the last element having multiple children
                if (i == comp.getChildren().size() - 1) { beforeChild = "       ";}

                // Get the string representation of the children with the right indents
                childrenStr = childrenStr + (before + " + --- " + doTextTree(before+beforeChild, comp.getChildren().get(i)));
            }

            output = output + childrenStr;


            return output;
        }
    }

}

