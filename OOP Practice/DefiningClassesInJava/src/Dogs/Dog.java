package Dogs;

public class Dog {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog (String name, String breed){
        this.setName(name);
        this.setBreed(breed);
    }

    public void Bark(){
        System.out.println("Woof-woof");
    }

    @Override
    public String toString() {
        return String.format(
                "My name is " + this.name + ". I am a " + this.breed + ". I can bark: "
        );
    }
}
