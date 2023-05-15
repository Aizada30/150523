public class Shark extends Animal{

    public Shark (String name){
        super(name);
    }
    public void swim(){
        System.out.println(getName()+" can swim ");
    }

    @Override
    public String toString() {
        return "Shark{}";
    }
}
