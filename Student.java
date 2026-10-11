package cit;
 
class Student
{
    String name;
    int age;
    String branch;

    Student()
    {
        name = "Aishwarya";
        age = 18;
        branch = "CSE";
    }

    Student(String name) 
    {
        this.name = name;
        age = 18;
        branch = "CSE";
    }

    Student(String name, int age, String branch) 
    {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    void display() 
    {
        System.out.println(name + " " + age + " " + branch);
    }

    public static void main(String[] args) 
    {

        Student s1 = new Student();
        Student s2 = new Student("Aishwarya");
        Student s3 = new Student("Rashmi", 20, "CSE");

        s1.display();
        s3.display();
    }
}
