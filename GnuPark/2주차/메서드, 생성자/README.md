# 메서드와 생성자

> ## 클래스는 서로 관련있는 데이터들을 하나의 단위로 묶어두기 위한 것이다.
>
> ## 또한 그 데이터와 관련이 깊은 메서드들도 함께 묶어 들 수 있다.
>
> ## 이렇게 함으로써 코드의 응집도(Cohesion)를 높이고 결합도(Coupling)를 낮출 수 있다.
>
> - 모듈관 상호 의존성 낮아짐.

<br>

## **메서드**

```java
class Term2{
    int coef;
    int expo;

    int calcTerm (int x){
        return coef * Math.pow(x,expo);
    }
    void printTerm(){
        System.out.println(coef + "x^" + expo);
    }
}
```

- 두 메서드 모두 클래스 Term2 의 일부분이여서 매개변수로 어떤 값을 받을 필요가 없다.
- class는 여전히 설계도 일뿐, 어떠한 데이터도 담지 않는다.

```java
Term2 t = new Term2();
t.coef = 3;
t.expo = 2;
int result = calcTerm(3);
t.printTerm();
```

- 우리가 실행하는 것은 클래스가 아니라, 각각의 **객체 안의** 메서드들이다.
- 각각의 **객체들 안에** 메서드가 존재한다.

## **생성자**

```java
class Term3{
    int coef;
    int expo;

    //생성자 : 클래스 자체이름과 동일 / return 타입이 존재 하지 않음.
    public Term3(int c, int e){
        coef = c;
        expo = e;
    }
    int calcTerm (int x){
        return coef * Math.pow(x,expo);
    }
    void printTerm(){
        System.out.println(coef + "x^" + expo);
    }
}
```

- 클래스와 동일한 이름을 가지며 return 타입이 없는 특별한 메서드

- new 명령으로 객체가 생성될 때 자동으로 실행된다.

- 객체의 데이터 필드의 값을 초기화하는 것이 주 목적이다.

<br>

```java
// 기존의 초기화 방법
Term2 t = new Term2();
t.coef = 3;
t.expo = 2;
// 생성자를 이용한 초기화 방법
Term3 t2 = new Term3(3,2);
```

- 매개변수 타입에 따라 여러 생성자를 가질 수도 있다.
