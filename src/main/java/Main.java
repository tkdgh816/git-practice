import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        while (true) {
            printMenu();

            switch (readMenu()) {
                case 1 -> System.out.println("할 일 추가 기능을 준비 중입니다.");
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
}
