package citb;

class Animal 
{
    String name;

    Animal(String name) 
    {
        this.name = name;
    }

    void sound() 
    {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal 
{

    Dog(String name) 
    {
        super(name);
    }

    @Override
    void sound() 
    {
        System.out.println(name + " barks");
    }
}

class Main 
{
    public static void main(String[] args) 
    {

        Dog d = new Dog("Tommy");

        d.sound();
    }
}