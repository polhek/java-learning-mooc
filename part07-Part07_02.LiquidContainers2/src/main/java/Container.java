/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zigagroselj
 */
public class Container {

    private int volume;
    private int maxVolume;

    public Container() {
        this.volume = 0;
        this.maxVolume = 100;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount <= 0) {
            return;
        }
        if (this.volume + amount > this.maxVolume) {
            this.volume = this.maxVolume;
        } else {
            this.volume += amount;
        }
    }

    public void remove(int amount) {
        if (amount <= 0) {
            return;
        }
        if (this.volume - amount <= 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }

    public String toString() {
        return this.volume + "/" + this.maxVolume;
    }

}
