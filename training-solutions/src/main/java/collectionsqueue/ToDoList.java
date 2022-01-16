package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private final List<ToDo> todos = new ArrayList<>();

    public void addToDo(ToDo toDo) {
        todos.add(toDo);
    }

    public List<ToDo> getTodos() {
        return new ArrayList<>(todos);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo t : todos) {
            if (t.isUrgent()) {
                result.addFirst(t);
            } else {
                result.addLast(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(new ToDo("Tanulni", false));
        toDoList.addToDo(new ToDo("Fát vágni", true));
        toDoList.addToDo(new ToDo("Házi feladat (háztartás, és -körül)", true));
        toDoList.addToDo(new ToDo("autó olajcsere + fényszóró", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }
}
