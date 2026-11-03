import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        while (true) {
            printMenu();

            System.out.print("입력 > ");
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1 -> System.out.println("할 일 추가 기능을 준비 중입니다.");
                    case 2 -> System.out.println("목록 조회 기능을 준비 중입니다.");
                    case 0 -> {
                        System.out.println("종료합니다.");
                        return;
                    }
                    default -> System.out.println("없는 메뉴입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("메뉴는 숫자로 입력하세요.");
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
}
