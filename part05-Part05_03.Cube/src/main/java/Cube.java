/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zigagroselj
 */
public class Cube {

    private int edgelength;

    public Cube(int edgelength) {
        this.edgelength = edgelength;

    }

    public int volume() {
        return this.edgelength * this.edgelength * this.edgelength;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.edgelength + " and the volume " + volume();
    }
}
