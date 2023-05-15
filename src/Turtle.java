public class Turtle extends Animal{

    public Turtle (String name){
        super(name);
    }
    public void attact(){
        System.out.println(getName()+" can not attact as shark ");
    }

    @Override
    public String toString() {
        return "Turtle{}";
    }
}
