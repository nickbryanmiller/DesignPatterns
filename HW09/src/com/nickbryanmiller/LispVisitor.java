package com.nickbryanmiller;

public class LispVisitor implements InterfaceVisitor {

    // We should keep a reference to what we are visiting
    private AbstractComponent ac;

    @Override
    public void visit(AbstractComponent comp) {
        this.ac = comp;
    }

    @Override
    public String toString() {
        return doLisp(ac);
    }

    private String doLisp(AbstractComponent comp){
        // If it is a Leaf we return the value of the leaf
        if(comp.getChildren().size() <= 0) {
            return comp.toString();
        }
        else { // If not then put the parenthesis and operator
            String output = "(";
            for(int i = 0; i < comp.getChildren().size(); i++){
                if(i == 0) {
                    output = output + comp + " ";
                }
                output = output + doLisp(comp.getChildren().get(i));
                // If we reached the last child in the list we don't want to put a space after
                if(i < comp.getChildren().size() - 1) {
                    output = output + " ";
                }
            }
            output = output + ")";

            return output;
        }
    }

}

