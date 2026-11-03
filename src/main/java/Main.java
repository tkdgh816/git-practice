import todo.Todo;
import todo.TodoManager;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        while (true) {
            printMenu();

            switch (readMenu()) {
                case 1 -> addTodo();
                case 2 -> System.out.println("목록 조회 기능을 준비 중입니다.");
                case 0 -> {
                    System.out.println("종료합니다.");
                    return;
                }
            }
            System.out.println();

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("""
                ====================
                할 일 관리 프로그램
                1. 할 일 추가
                2. 목록 조회
                0. 종료
                ====================
                """);
    }

    private static int readMenu() {
        while (true) {
            System.out.print("입력 > ");
            try {
                int menu = Integer.parseInt(scanner.nextLine());
                if (menu >= 0 && menu <= 2) {
                    return menu;
                }
                System.out.println("없는 메뉴입니다.");
            } catch (NumberFormatException e) {
                System.out.println("메뉴는 숫자로 입력하세요.");
            }
        }
    }


    private static final TodoManager todoManager = new TodoManager();

    private static void addTodo() {
        while (true) {
            System.out.print("할 일 제목 > ");
            String input = scanner.nextLine();
            if (input.isBlank()) {
                System.out.println("빈 제목은 입력할 수 없습니다.");
                continue;
            }

            Todo todo = todoManager.add(input);
            System.out.println("할 일 추가 완료");
            System.out.printf("%d.%s%n%n", todo.id, todo.getTitle());
            return;
        }
    }
}
