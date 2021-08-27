/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zigagroselj
 */
public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItems = (Item) compared;

        if (this.identifier.equals(comparedItems.identifier)) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
