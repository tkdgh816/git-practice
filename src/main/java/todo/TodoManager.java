package todo;

import java.util.TreeMap;

public class TodoManager {
    private final TreeMap<Integer, Todo> todoMap = new TreeMap<>();

    private int nextId = 1;

    public Todo add(String title) {
        Todo todo = new Todo(nextId, title);
        todoMap.put(nextId, todo);

        nextId++;
        return todo;
    }
}
