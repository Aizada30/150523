public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void Parentmethod(){
        System.out.println(name+" is animal " );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
