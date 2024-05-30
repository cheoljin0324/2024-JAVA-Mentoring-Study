public class Bike extends Veicle{
    @Override
    void moveForward(){
        System.out.println("오토바이 전진");
    }

    @Override
    void moveBackward(){
        System.out.println("오토바이 후진");
    }
    
    public void stunt(){
        System.out.println("오토바이 묘기 부리기");
    }
}
