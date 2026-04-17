
// Hybrid Inheritance - There are combination of :

// Single inheritance
// Multiple inheritance

class A {
    void message() {
        System.out.println("Class A");
    }
}

interface B {
    void show();
}

class C extends A implements B {
    public void show() {
        System.out.println("Interface B method");
    }
}
