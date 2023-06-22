package rockscissorspaper;
import java.util.Scanner;

public class ycr20221189_mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임을 시작하겠습니다.");
        System.out.println("가위, 바위, 보 중 선택해 입력해주세요.");

        while (true) {
            int computer = (int) (Math.random() * 3) + 1;
            String user = scanner.nextLine();
            // 가위:1, 바위:2, 보:3

            switch (computer) {
                case 1:
                    if (user.equals("가위")) {
                        System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("바위")) {
                        System.out.println("이겼습니다!");
                        break;
                    } else if (user.equals("보")) {
                        System.out.println("졌습니다.");
                        break;
                    }
                case 2:
                    if (user.equals("바위")) {
                        System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("가위")) {
                        System.out.println("졌습니다.");
                        break;
                    } else if (user.equals("보")) {
                        System.out.println("이겼습니다!");
                        break;
                    }
                case 3:
                    if (user.equals("보")) {
                        System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("바위")) {
                        System.out.println("졌습니다.");
                        break;
                    } else if (user.equals("가위")) {
                        System.out.println("이겼습니다!");
                        break;
                    }
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }

            System.out.println("게임을 종료하시겠습니까? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                break;
            } else if (answer.equals("N") || answer.equals("n")) {
                System.out.println("가위, 바위, 보중 선택해 입력해주세요.");
            }
        }

        System.out.println("게임이 종료되었습니다.");
    }
}
