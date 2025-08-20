//Write a java program to implement multiple inheritance using interfaces academic & Sports via Student class show both academic and sports activity

interface Students{
    void Academic();
    void Sports();
}

class Arpit implements Students{
    public void Academic(){
        System.out.println("Arpit Score 8CGPA in Academics");
    }
    public void Sports(){
        System.out.println("Arpit is a good player in Cricket");
    }
}

class Ayush implements Students{
    public void Academic(){
        System.out.println("Ayush Score 9CGPA in Academics");
    }
    public void Sports(){
        System.out.println("Ayush is a good player in Football");
    }
}

public class multipleinheritance{
    public static void main(String[] args){
        Arpit arpit = new Arpit();
        arpit.Academic();
        arpit.Sports();
        Ayush ayush = new Ayush();
        ayush.Academic();
        ayush.Sports();
    }
}