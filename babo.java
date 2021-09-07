// 페널티 액수 정하기!
import java.util.Scanner;

public class babo {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int menuChoice = 0;

    while (menuChoice != 4) {
      displayMenu();
      menuChoice = getMenuChoice();

      if      (menuChoice == 1) {
    	  int min = 1;
    	  int max = 10;
    	  int rand_num = (int)Math.floor(Math.random()*(max-min+1)+min);
    	  System.out.println(rand_num +"000" + "원");
      }
      else if (menuChoice == 2){
    	  int min = 2;
    	  int max = 50;
    	  int rand_num = (int)Math.floor(Math.random()*(max-min+1)+min);
    	  System.out.println(rand_num +"000" + "원");
      }
       
      else if (menuChoice == 3){
    	  int min = 50;
    	  int max = 100;
    	  int rand_num = (int)Math.floor(Math.random()*(max-min+1)+min);
    	  System.out.println(rand_num +"000" + "원");
      }
        
      else if (menuChoice == 4)
        System.out.println("===== 프로그램을 끝냅니다! 다음에는 벌금을 내지 않도록 조심하세요! =====");
      else
        System.out.println("  !!! 유효하지 않은 선택입니다 !!!");
    }
  }

  static void displayMenu() {
    System.out.println("===== 페널티 메뉴 =====");
    System.out.println("1. 1회 불참");
    System.out.println("2. 2회 불참");
    System.out.println("3. 3회 불참");
    System.out.println("4. 끝");
  }

  static int getMenuChoice() {
    System.out.print("선택을 입력 해주세요 --> ");
    return scan.nextInt();
  }
}
