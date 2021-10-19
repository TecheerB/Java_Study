# 상속과 다형성

## 상속(Inheritance)

```java
package section1;

public class Computer {
    //protected
    //자식 클래스에선 access할 수 있다.
    protected String manufacturer;
    protected String processor;
    protected int ramSize;
    protected int diskSize;
    protected double processorSpeed;

    public Computer(String man, String proc, int ram, int disk, double procSpeed){
        manufacturer = man;
        processor = proc;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = procSpeed;
    }

    //계산 능력
    public double computePower() {
        return ramSize * processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String toString() {
        String result = "Manufacturer: " + manufacturer +
                        "\nCPU: " + processor +
                        "\nRAM: " + ramSize + " megabytes" +
                        "\nDisk: " + diskSize + " gigabytes" +
                        "\nProcessor speed: " + processorSpeed + " gigahertz";
        return result;
    }
}
```

```java
package section1;

public class Notebook extends Computer { //Computer 클래스 상속
    public double screenSize;
    public double weight;
     // error -> Computer의 no-parament 생성자가 호출되는데 Computer에는 이미 parament 생성자가 있음 -> 따라서 직접 만들어주거나 super class 생성자를 명시 해준다.
    public Notebook( String man, String proc, int ram, int disk, double speed, double screen, double weight) {
        super (man, proc, ram, disk, speed); //나의 슈퍼클래스의 매개변수 5개를 호출한다.
        manufacturer = man;
        processor = proc;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = speed;
        screenSize screen;
        this.weight = weight;
    }

    public static void main(String [] args){
        Notebook test = new Notebook( "Dell", "i5", 4 , 1000, 3.2, 15.6, 1.2);

        // test.manufacturer = "Dell";
        // test.processor = "15";
        // test.ramSize = 4;
        // test.diskSize = 1000;
        // test.processorSpeed = 3.2;

        // test.screensize 15.6;
        // test.weight = 1.2;

    }
}
```

- IS - A 관계

  - A Notebook is a Computer.
  - Computer is the superclass of Notebook.
  - Notebook is a subclass of Computer.

- 생성자가 없을 경우 자동으로 no-parameter 생성자가 만들어진다.

  - 생성자가 하나라도 있을 경우 자동 생성되지 않는다.

- 모든 서브 클래스의 생성자는 먼저 수퍼클래스의 생성자를 호출한다.

  1. super(...)를 통해 명시적으로 호출해 주거나,
  2. 그렇지 않을 경우 자동으로 no-parameter 생성자가 호출된다.

- 흔한 오류:
  - 수퍼클래스에 no-parameter 생성자가 없는데, 서브 클래스의 생성자에서 super(...)호출을 안해주는 경우

### 부모로부터 물려받은 메서드가 불충분할때 - **메서드 오버라이딩**

- 부모로부터 물려받은 메서드를 좀 더 나에게 맞게 변경할 수 있다.

```java
package section1;

public class Notebook extends Computer {

    public double screenSize;
    public double weight;

    public Notebook( String man, String prcc, int ram, int disk, double speed, double screen, double weight) {
        super( man, proc, ram, disk, speed);
        screenSize = screen;
        this.weight = weight;
    }

    public String toString() {
        //super.toString 부모의 원본 toString 메서드
        String result = super.toString() +
                        "\nScreen Size: " + screenSize + "inches" + "\nWeight: " + weight + "kg";
        return result;
    }

    public static void main(String [] args){
        Notebook test = new Notebook( "Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);

        System.out.println( test.computePower());
        System.out.println( test.toString());
    }
}
```

<br>

## **다형성 (Polymorphism)**

- **수퍼클래스 타입의 참조변수가 서브클래스 타입의 객체를 참조할 수 있다.**

<br>

### **정적 바인딩 (static binding)**

- 타입으로 선언된 부모의 클래스 내부 메서드가 호출되어야한다.
- 컴파일러가 결정을 내리는 입장 -> static

### **동적 바인딩 (dynamic binding)**

- 객체로 생성된 자식의 메서드가 호출되어야한다.
- 실제 코드를 실행할때 즉, runtime때 라인을 실행할떄 결정하는 방식 dynamic binding

```java
Computer theComputer = new Notebook("Bravo", "Intel", 4, 240, 2/4, 15.07.5);

// Noteboook theComputer = new Computer("Bravo", "Intel", 4, 240, 2/4, 15.07.5); error -> 서브 클래스가 수퍼클래스를 참조할 수는 없다.
```

- Computer 타입의 변수 theComputer가 Notebook 타입의 객체를 참조하고 있다.

```java
System.out.println(theComputer.toString());
// static binding vs dynamic binding
// 자바에선 항상 동적 바인딩
```

- theComputer는 Computer 타입의 변수이면서 실제로는 Notebook 객체를 참조하고 있다. 그리고 두 클래스는 각자의 toString()를 가지고 있다.
- 따라서 NoteBook 클래스의 toString()메서드가 실행된다
- 이를 **동적 바인딩(dynamic binding)** 이라고 한다.
