public class Exercise6_5 {
    public static void main(String args[]){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}

class Student {
    String name;
    int no, ban, kor, eng, math, sum;
    float avg;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = kor + eng + math;
        this.avg = (int)((this.sum / 3.0f) * 10 + 0.5) / 10.0f;
    }

    String info(){
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + sum
                + "," + avg;
    }
}