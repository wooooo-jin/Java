package Abstract;

public class InterfaceChild implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("InterfaceClid.methodA");
    }
    @Override
    public void methodB(){
        System.out.println("InterfaceClid.methodB");
    }
    @Override
    public void methodCommon(){
        System.out.println("InterfaceClid.methodCommon");
    }
}
