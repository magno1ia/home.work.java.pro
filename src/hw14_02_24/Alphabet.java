package hw14_02_24;

public class Alphabet {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAlphabet () {
        System.out.println("The name alphabet is  " + this.getName());
    };

}
