package Abstract;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound(){
        System.out.println("짹짹");
    }
    
    @Override
    public void move(){
        System.out.println("훨훨");
    }
    
    @Override
    public void fly(){
        System.out.println("슝슝");
    }
}
