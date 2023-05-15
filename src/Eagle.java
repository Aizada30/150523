public class Eagle extends Animal{

    public Eagle (String name){
        super(name);
    }
    public void fly(){
        System.out.println(getName()+" can fly and attact ");
    }

    @Override
    public String toString() {
        return "Eagle{}";
    }
}
