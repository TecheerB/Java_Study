# Object 클래스와 Wrapper 클래스

## Object Class

- 클래스 Object는 **Java에서 모든 클래스의 superclass**이다.

- class Object의 멤버 메서드
  | Method | Behavior |
  | ------------------| --------------------------------------------------------------- |
  | boolean equals | Compares this object to its arguments. |
  | int hashCode() | Returns an integer hash code value for this object |
  | String toString | Returns a string that textually represents the object |
  | Class<?> getClass()| Returns a unique object that identifies the class of this object|

### toString()

```java
package section3;

public class Test{ //Subclass of Object
    public int a = 10;
    public double x = 1.23;

    public String toString(){
        return a + " " + x;
    }
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.toString());
        // 모든 클래스는 Object 상속
        // -> Object Class는 toString 메서드를 지님.

    }
}
```

- Java의 모든 클래스는 Object 클래스를 상속 받기 때문에 equals와  
  toString메서드를 가지고 있다.
- 다만 내 의도대로 작동하지 않을 것이다.
- 만약 toString 메서드를 따로 만들어주지 않은 클래스의 객체에 대해  
  해당 메서드를 호출하면 다음과 같은 String이 반환된다.
  - PhoneBook@ef08879 (클래스 이름@객체의 hash code)

<br>

### equals(Object)

```java
package section3;

public class Test{ //Subclass of Object
    public int a = 10;
    public double x = 1.23;

    // public String toString(){
    //     return a + " " + x;
    // }

    // 보동 equals 메서드를 오버라이딩하려면 매개변수 타입도 Object로 받아야한다.
    public boolean equals( Object other){

        Test other2 = (Test)other; //type casting
        //other가 Object 타입이 되므로 a와 x라는 멤버 변수를 지니지 않음
        return a == other2.a && x == other2.x;


    }
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1.toString());
        // 모든 클래스는 Object 상속
        // -> Object Class는 toString 메서드를 지님.

        if( test2.equals(test1) )
            System.out.println("yes");
            // 해당 방식대로 equals를 overriding하면
            //test1과 test2에 해당하는 두 a, x는 같은 값이므로 yes 출력
        else
            System.out.println("no");
             // 따로 overriding 해주지 않으면 서로 다른 두 객체이므로 no 출력

    }
}
```

- Object 클래스의 equals 메서드의 매개변수는 Object 타입이다.

  - public boolean equals (Object other) { ... }

- 매개변수로 제공된 객체와 자기 자신의 동일성을 검사한다.

- 이 메서드를 의도대로 사용하려면 override해야 한다.

### Wrapper class

- Java에서 primitive type 데이터와 non-primitive type 데이터,  
  즉 객체는 근본적으로 다르게 처리

- 가령 Object 타입의 배열에는 다형성의 원리에 의해서 모든 종류의  
  객체를 저장할 수 있다. 하지만, int, double, char 등의  
  primitive
  type 데이터는 저장할 수 없다. 객체가 아니므로..

- 때때로 primitive type 데이터를 객체로 만들어야 할 경우가 있다.

  - 이럴 때 Integer, Double, Character 등의 wrapper class를 이용

- 기본 타입의 데이터를 하나의 객체로 포장해주는 클래스

- integer, Double, character, Boolean 등

  ```java
  int a = 20;
  Integer age = new Integer(a);
  // array[0] = a 에서 int 는 primitive type이므로 error
  // 타입이 다르다.
  // --> Wrapper class로 감싸서 저장해야함
  // array[0] = age
  int b = age.intValue();

    String str = "1234";
    int c = Integer.parseInt(str);
    System.out.println(c);
  ```

- 데이터 타입간의 변환 기능을 제공
  ```java
  String str = "1234";
  int d= Integer.parseInt(str); // d becomes 1234
  ```

### AutoBoxing과 AutoUnboxing

- AutoBoxing

  - `array[0] = 10` 은 원칙적으로 문법에 어긋난다.
  - 하지만 java 컴파일러가 이것을 Integer 객체로 변환해준다.

- AutoUnboxing
  - 'int c = (Integer)theArray[0]'는 타입이 다르다.
  - theArray[0]에 저장된 Integer 객체를 Java 컴파일러가  
    정수로 변환해준다.
