public class main {
    public static void main(String[] args) {
        person person1 = new person("Verat");
        person person3 = new person(69);
        System.out.println("Name "+person1.getName());
        System.out.println("Age is "+person3.age);

        person person2 = new person("Samantha");
        System.out.println("Name of second persoon is: "+person2.getName());

    }
}
