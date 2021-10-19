import com.sun.org.apache.bcel.internal.generic.SIPUSH;

public class Exercise7_18 {
    static class Robot{}

    static class DanceRobot extends Robot{
        void dance(){
            System.out.println("춤을 춥니다.");
        }
    }

    static class SingRobot extends Robot {
        void sing(){
            System.out.println("노래를 합니다.");
        }
    }

    static class DrawRobot extends Robot {
        void draw() {
            System.out.println("그림을 그립니다.");
        }
    }

    static void action(Robot r){
        if(r instanceof DanceRobot){
            DanceRobot dr = (DanceRobot)r;
            dr.dance();
        }
        else if(r instanceof SingRobot){
            SingRobot sr = (SingRobot)r;
            sr.sing();
        }else if(r instanceof DrawRobot){
            DrawRobot dr = (DrawRobot)r;
            dr.draw();
        }
    }


    public static void main(String[] args){
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

        for(int i=0; i<arr.length; i++){
            action(arr[i]);
        }

    }

}
