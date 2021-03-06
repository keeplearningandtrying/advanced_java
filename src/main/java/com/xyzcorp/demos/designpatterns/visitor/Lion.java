package com.xyzcorp.demos.designpatterns.visitor;

/**
 * @author John Ericksen
 */
public class Lion implements Animal {

    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void feed(Meat meat) {
        System.out.println("Yum, meat is delicious");
    }
}
