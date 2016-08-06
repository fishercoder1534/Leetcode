package learnHeadFirstJava;

public class Dog extends Pet {

    public Dog() {
        System.out.println("Dog constructor is getting called!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out
                .println("\nThis is really calling as the book stated and as I expected,\n"
                        + "each method gets put onto the stack, up to the end of the inheritance "
                        + "tree, then the root constructor is called, "
                        + "then down to the bottom subclass's constructor is called!\nNice!\nProgram ended.");
    }
}
