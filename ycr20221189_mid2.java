package rockscissorspaper;
import java.util.Scanner;

public class ycr20221189_mid2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userstair = 0; // 사용자 계단 위치
        int computerstair = 0; // 컴퓨터 계단 위치
                
        System.out.println("가위바위보 계단 올라가기 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요:");
                
        while (userstair < 10 && computerstair < 10) {
            int computer = (int) (Math.random() * 3) + 1;
            String user = scanner.nextLine();
            // 가위:1, 바위:2, 보:3
            
           switch (computer) {
                case 1:
                    if (user.equals("가위")) {
                    	System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("바위")) {
                    	System.out.println("이겼습니다! 한 계단 올라갑니다.");
                        userstair++;
                        computerstair--;
                        break;
                    } else if (user.equals("보")) {
                    	System.out.println("졌습니다. 한 계단 내려갑니다.");
                    	computerstair++;
                    	userstair--;
                        break;
                    }
                case 2:
                    if (user.equals("바위")) {
                    	System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("가위")) {
                    	System.out.println("졌습니다. 한 계단 내려갑니다.");
                    	computerstair++;
                    	userstair--;
                        break;
                    } else if (user.equals("보")) {
                    	System.out.println("이겼습니다! 한 계단 올라갑니다.");
                    	userstair++;
                    	computerstair--;
                        break;
                    }
                case 3:
                    if (user.equals("보")) {
                    	System.out.println("비겼습니다.");
                        break;
                    } else if (user.equals("바위")) {
                    	System.out.println("졌습니다. 한 계단 내려갑니다.");
                        computerstair++;
                        userstair--;
                        break;
                    } else if (user.equals("가위")) {
                    	System.out.println("이겼습니다! 한 계단 올라갑니다.");
                        userstair++;
                        computerstair--;
                        break;
                    }
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
           
           System.out.println("사용자 계단 위치: " + userstair);
           System.out.println("컴퓨터 계단 위치: " + computerstair);
        }

        if (userstair >= 10) {
            System.out.println("축하합니다! 먼저 10개의 계단을 올랐습니다.");
        } else if(computerstair >= 10) {
            System.out.println("게임이 종료되었습니다.");
        }

        System.out.println("게임을 종료하시겠습니까? (Y/N)");
        String answer = scanner.nextLine();
        if (answer.equals("N") || answer.equals("n")) {
            System.out.println("게임을 다시 시작합니다.");
            userstair = 0;
            computerstair = 0;
        } else {
            System.out.println("게임을 종료합니다.");
        }
	}
}
