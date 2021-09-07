
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
public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task) {
        if (task.isEmpty()) {
            return;
        }
        this.todos.add(task);
    }

    public void print() {

        int i = 1;
        for (String task : this.todos) {
            System.out.println(i + ": " + task);
            i++;
        }
    }

    public void remove(int number) {
        int index = number - 1;
        this.todos.remove(index);
    }
}
