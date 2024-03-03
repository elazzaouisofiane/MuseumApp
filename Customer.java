//Java program to overload constructors  
class Customer {
    int id;
    String name;
    int age;

    // creating two arg constructor
    Customer(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Customer(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Customer c1 = new Customer(789, "Stuart");
        Customer c2 = new Customer(456, "Rosie", 37);
        c1.display();
        c2.display();
    }
}