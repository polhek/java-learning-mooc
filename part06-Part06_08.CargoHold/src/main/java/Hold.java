
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zigagroselj
 */
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcases() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        } else {
            return;
        }
    }

    public int weightOfSuitcases() {
        int weight = 0;

        for (Suitcase item : this.suitcases) {
            weight += item.totalWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Suitcase item : this.suitcases) {
            item.printItems();
        }
    }

    @Override
    public String toString() {
        String itemOutput = "";
        String weightOutput = "(" + weightOfSuitcases() + " kg)";

        if (this.suitcases.isEmpty()) {
            return "no suitcases";
        }

        if (this.suitcases.size() == 1) {
            itemOutput = "1 suitcase ";
        } else {
            itemOutput = this.suitcases.size() + " suitcases ";
        }

        return itemOutput + weightOutput;

    }
}
