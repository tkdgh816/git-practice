package todo;

import java.util.TreeMap;

public class TodoManager {
    private final TreeMap<Integer, Todo> todoMap = new TreeMap<>();

    public Todo add(String title) {
        int id = 1;
        if (!todoMap.isEmpty()) {
            id = todoMap.lastKey() + 1;
        }
        Todo todo = new Todo(id, title);

        todoMap.put(id, todo);
        return todo;
    }
}
