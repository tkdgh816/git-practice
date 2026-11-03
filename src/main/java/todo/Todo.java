package todo;

public class Todo {
    public final int id;
    private String title;
    private TodoState state = TodoState.UNDONE;

    Todo(int id, String title) {
        this.id = id;
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.isBlank()){
            throw new IllegalArgumentException("빈 제목은 입력할 수 없습니다.");
        }

        this.title = title.strip();
    }

    public TodoState getState() {
        return state;
    }

    public TodoState toggleState() {
        state = switch (state) {
            case DONE -> TodoState.UNDONE;
            case UNDONE -> TodoState.DONE;
        };

        return state;
    }
}
