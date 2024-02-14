package hw12_02_24;

public class Person {
    String name;
    String fullName;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Ivan","Moroianu",25);
        first.setAge(21);
        first.setName("Mira");
        first.setFullName("Miriam");
        System.out.println(first);
        System.out.println(second);
    }

}
