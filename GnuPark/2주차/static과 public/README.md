# static 과 public

## static

- 클래스는 타입이다. 집이 아니라 집의 설계도이다. == 실체가 아니다.

- 클래스의 데이터 필드에 데이터를 저장할 수 없고, 메서드를 실행할 수도 없다.

- new 명령으로 객체를 만든 후, 객체에 데이터를 저장하고, 그 객체의 멤버 메서드를 실행한다.

  - 예외로서 **static 멤버**가 존재한다.

- **static 멤버는 클래스 안에 실재로 존재**하며 **객체에는 존재하지 않는다.**

<br>

```java
public class Test {
    public static int s = 0;
    public int t = 0;

    public static void print1() {
        System.out.println("s = " + s);
        System.out.println("t = " + t);
    }

    public void print2() {
        System.out.println("s = " + s);
        System.out.println("t = " + t);
    }

    public static void main(String args[]){
        s = 100;
        // t = 100;
        print1();
        // print2();

        Test test1 = new Test();
        test1.t = 100;
        test1.print2();

        //클래스 멤버는 이미 실재하므로 객체 생성없이 해당 클래스에서 바로 호출한다.
        Test.s = 100;
        Test.print1();
    }
}
```

- static 멤버는 class 멤버이고

- non-static 멤버는 object 멤버이다.

### 왜 main 메서드는 반드시 static이어야 하는가?

- 자바에서 프로그램은 클래스들의 집합이다. == 클래스 말곤 없다.

- 클래스는 설계도, 즉 허상이다. **따라서 클래스만 존재해선 어떤것도 실행할 수 없다.**

- 따라서 시작점은 실재해야하므로 반드시 static이어야한다.

### 왜 static 메서드에서 같은 클래스의 non-static 멤버를 액세스 할 수 없는가?

- 앞에서 메인문이 포함된 클래스의 변수들은 모두 static 선언을 하였었다.

- print1에 경우 t를 사용할 경우 객체 생성을 하지 않아 오류가 발생한다.

- 하지만 print2는 에러가 나지 않는다. 그 이유는 print2 또한 클래스 내부 메서드이므로 이 또한 객체로서 생성이되어야만 메모리를 할당한다. 할당하기 전까진 허상이므로 에러가 발생하지 않는다.

### static 메서드안에서 non-static 메서드를 실행시 오류가 난다.

- 이전에 학습한 내용대로 non-static 메서드는 클래스이므로 허상일뿐이라 객체 생성이 필요하다.

### 다른 클래스에 속한 static 멤버는 어떻게 액세스하는가?

- 클래스 멤버는 이미 실재하므로 객체 생성없이 해당 클래스에서 바로 호출한다.

### static 메서드/필드의 용도는?

- main 메서드

- 상수 혹은 클래스 당 하나만 유지하고 있으면 되는 값(혹은 객체)
  예: Math.PI,System.out

- 순수하게 기능만으로 정의되는 메서드. 대표적인 예로는 수학 함수들
  예: Math.abs(k), Math.sqrt(n), Math.min(a,b)

\+ **현실세게의 고유명사에 해당하는 것들 static으로 만들면 좋은 것 같다.**

\+ main 메서드만 static이 되도록 연습해보자

## 접근제어자 public

- **public**: 클래스 외부에서 접근이 가능하다.

- **private**: 클래스 내부에서만 접근이 가능하다.

- **default**: 동일 패키지에 있는 다른 클래스에서 접근 가능하다.

- **protected**: 동일 패키지의 다른 클래스와 다른 패키지의 하위 클래스에서도 접근 가능하다.

### 데이터 캡슐화

- 모든 데이터 멤버를 private으로 만들고 필요한 경우에 public한  
  get/set 메서드를 제공한다.

- 객체가 제공해주는 메서드 없이 객체 내부의 데이터에 접근할 수가 없다.

- 이를 data encapsulation 혹은 information hiding이라고 부른다.

```java
package section3;

public class Term3 {
    private int coef;
    private int expo;

    public Term3(int c, int e){
        coef = c;
        expo = e;
    }

    public Term3(int c, int e){
        coef = c;
        expo = e;
    }

    // 클래스 내부 멤버 변수를 read-only로 권한 제한을 할 수 있다.
    public int getExpo(){
        return expo;
    }

    public int calcTerm(int x){
        return (int) (coef * math.pow(x, expo));
    }
    public void printTerm() {
        System.out.print( coef + "x^" + expo);
    }

    public int getCoef() { // getter, accessor
        return coef;
    }

    public void setCoef(int coef) { // setter
        this.coef = coef;
    }
}
```
