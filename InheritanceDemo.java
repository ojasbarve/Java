class Parent {
    int a = 10;

    void showParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Value inherited from parent: " + a);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
    }
}
