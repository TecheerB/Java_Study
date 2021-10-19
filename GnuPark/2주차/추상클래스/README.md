# 추상 클래스와 인터페이스

## 추상 클래스(Abstract Class)

```java
public abstract class Event {
    public String title;
    public Event(String title) {
        this.title = title;
    }

    public abstract boolean isRelevant(MyDate date);
    // 내용없이 머리만 있는 메서드를 추상 메서드라고 함.
}
```

- 추상(abstract) 메서드는 선언만 있고 구현이 없는 메서드

- 추상 메서드를 포함한 클래스는 추상 클래스

- 추상 메서드와 추상 클래스는 키워드 abstract로 표시

- 추상 클래스는 객체를 만들 수 없음.
  - 내용이 없으니 객체 생성시 빈껍데기의 메서드만 생성하게됨.
  - 따라서 서브 클래스를 만드는 용도로만 사용됨.

```java
package section4

private void handIsShow(){
    String dateString = kb.next();
    MyDate the Date = parseDateString();
}

```

<br>

## 인터페이스(Interface)

- 추상 메서드만을 가진 순수한 추상 클래스
- static final 데이터 멤버 (상수)를 가질 수 있음

```java
public interface Payable {
    public double calcSalary();
    public boolean salaried();
    public static final double DEDUCTIONS = 25.5;
}

public class Professor implements Payable{
    ...
    public boolean calcSalary() { ... }
    public boolean salaried() { ... }
    ...
}
```

- 인터페이스는 extends 대신 implements를 사용하여 상속받는다.

  - 상속 받는다기보다 언터페이스에서 선언된 메서드를 implements에서 정의한다.

- Payalbe 인터페이스를 구현(implements)하는 클래스는 부모의 클래스를 실제 구현해야한다.

<br>

### Comparable 인터페이스

```java
public interface Comparable {
    int compareTo(Object o);
}
```

- Comparable 인터페이스는 Java API에 이미 정의되어 있으므로 새로 정의할 필요 x

- 정렬 할 수 있다 == 크기 비교를 할 수 있다.
  - ==> 데이터가 Comparable 하다.

```java
package section4_2;

public interface MyComparable {
    public int compareTo(Object o);
}

public abstract class Shape implements MyComparable {
    public String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public abstract double computerArea();
    public abstract double computerPerimeter();

    public int compareTo( Object other ){
        double myArea = computeArea();
        double yourArea = ((Shape)other).computeArea();
        if(myArea < yourArea) return 1;
        else if (myArea == yourArea) return 0;
        else return 1;
    }
}
```

<br>

### Interface vs Abstract Class

- 추상 메서드로만 구성된 추상 클래스는 인터페이스와 완전히 동일한가?

- 다중 상속(multiple inheritance)  
  하나의 클래스가 두개의 부모 클래스를 가진다.
  - Java에서는 다중 상속을 허용하지 않는다.
    - 서로 다른 두 부모 클래스의 메서드들의 내용이 충돌을 일으킬 수 있기때문
  - 하지만 하나의 클래스가 여러 개의 interface를 implements하는 것은 가능
    - interface가 가진 메서드들은 모두 abstract Method. 즉, 선언만 되어있는  
      메서드들로만 구성되기 때문에
