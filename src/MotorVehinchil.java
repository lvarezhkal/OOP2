public abstract class MotorVehinchil extends Vehinchil {
    public MotorVehinchil (String modelName, int wheelCount){
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check(){
        super.check();
        checkEngine();
    }

}
