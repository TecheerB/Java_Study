# 클래스, 객체, 참조변수

### 모든 프리미티브 타입의 변수는 **보통 변수**이다.

- 변수 자체에 값이 저장된다.

### 프리미티브 타입이 아닌 모든 변수는 **참조 변수**이다.

- 실제 데이터가 저장될 "객체"는 new 명령으로 따로 만들어야한다.
- 참조변수에는 그 객체의 주소를 저장한다.

```java
package Section1;

public class Code_01_2 {
    Public static void main(String[] args) {
        Person1 first;
        first = new Person1();

        first.name = "John";
        first.number = "01012345678";

        System.out.println("Name: " + first.name + ", Number: " + first.number);

        Person1 second = first; //first 객체의 주소를 가지게됨.
        second.name = "Tom";
        System.out.println("Name: " + first.name + ", Number: " + first.number);
        // first.name : Tome 이 출력됨 -> 동일한 객체를 참조하기 때문

        Person1 [] members = new Person1 [8];
        members[0] = first;
        members[1] = second;

        // 각각의 원소의 타입은 Person1이다. 따라서 배열의 각 칸도 참조변수이다.
        // 따라서 배열의 각 칸에 바로 이름과 번호를 저장할 수 없다.
        // members[2].name = "David"; //error
        // members[2].number = "2345555"; //error

        //객체 생성 우선적으로 펼요
        members[2] = new Person1();
        members[2].name = "David";
        members[2].number = "2345555";

    }
}
```

<br>

```java
package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
    //static Person [] members; // error
    static Person1 [] memebers = new Person1 [100]; // 객체 생성 단계가 필요하다.
    // 데이터를 저장하는 클래스에선 static을 붙이진 않지만 메인 클래스에 해당하는 부분
    // 에는 static을 붙이고 있다.
    static int n = 0;

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            while( in.hasNext()){
                String nm = in.next();
                String nb = in.next();

                members[n] = new Person1();
                members[n++].name = nm;
                members[n++].number = nb;
                n++;
            }

            in.close();

        } catch(FileNotFoundException e){
            //TODO Auto.generated catch block
            e.printStackTrace();

        }

        bubbleSort(); // memebers, int 메인 함수 외부에 선언되어있어 이는 클래스 내부 어떤 함수도 접근이 가능하여 굳이 매개변수를 받지 않는다.
    }
```

- 클래스는 설계도에 불과 -> 데이터를 담지않음
- 객체가 데이터를 가진다.
- 설계도를 가지고 객체를 만들어라  
  -> 객체 생성만 가지고는 고유한 이름을 가질 수 없기때문에 참조변수가 필요하다.
