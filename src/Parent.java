public class Parent {

    private int name;
    private int age;


    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long printPhoneNumber(long phoneNo) {
        System.out.println(phoneNo);
        return phoneNo + 1;
    }

    public static void fun()
    {
        System.out.println("Parent.fun");
    }
}

class Child extends Parent {
    @Override
    public long printPhoneNumber(long phoneNumber) {
        System.out.println("Inside Child");
        return phoneNumber + 2;
    }

    public static void fun()
    {
        System.out.println("Child.fun");
    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();
        Parent p1 = new Parent();
        System.out.println(c.printPhoneNumber(3456345643l));
        System.out.println(p1.printPhoneNumber(3474656L));


        //Shadowing
        //Shadowing Child class overriding method and displays Parent class overriden method
        p.fun();
    }
}
