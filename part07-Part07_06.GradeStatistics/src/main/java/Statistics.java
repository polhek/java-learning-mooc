
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
public class Statistics {

    private ArrayList<Integer> points;

    public Statistics() {
        this.points = new ArrayList<Integer>();
    }

    public void add(int num) {
        if (num > 100 || num < 0) {
            return;
        }
        this.points.add(num);
    }

    public double calculateAvg() {
        int count = this.points.size();
        int sum = 0;
        for (int i = 0; i < this.points.size(); i++) {
            sum += this.points.get(i);
        }
        double avg = (double) sum / count;

        return avg;
    }

    public double passingAvg() {
        int passingCount = 0;
        int passingSum = 0;

        for (int point : this.points) {
            if (point >= 50) {
                passingCount++;
                passingSum += point;
            }
        }
        if (passingCount > 0) {
            return passingSum / passingCount;
        }
        return 0.0;
    }

    public double passPercantage() {
        int countOfPass = 0;

        for (int point : this.points) {
            if (point >= 50) {
                countOfPass++;
            }
        }
        return ((1.0 * countOfPass) / this.points.size()) * 100;
    }

    public void gradeDistribution() {
        ArrayList<Integer> grades = new ArrayList<Integer>();

        for (int point : this.points) {
            if (point < 50) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else if (point >= 90) {
                grades.add(5);
            }
        }
        
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + this.stars(grades, i));
        }
    }

    public String stars(ArrayList<Integer> grades, int number) {
        String star = "";

        for (Integer grade : grades) {
            if (grade == number) {
                star += "*";
            }
        }
        return star;
    }

}
