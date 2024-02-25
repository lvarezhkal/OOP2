public class Truck extends MotorVehinchil {

    public Truck (String modelName, int wheelCount){
        super(modelName, wheelCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(){
        super.check();
        checkTrailer();
    }
}