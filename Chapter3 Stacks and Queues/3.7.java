public abstract class Animal {
    private int order;
    protected String name;
    public Animal(String n) {
        name = n;
    }

    public void setOrder(int ord) {
        order = ord;
    }

    public int getOrder() {
        return order;
    }

    publci boolean isOrderThan(Animal a) {
        return this.order < a.getOrder();
    }
}

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedLsit<Cat>();
    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order);
        order ++;
        if (a instanceof Dog) {
            dogs.addLast((Dog)a);
        } else if (a instanceof Cat) {
            cats.addList((Cat)a)；
        }
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            dequeueCats();
        }

        if (cats.size() == 0) {
            dequeueDogs();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOrderThan(cat)) {
            return dequeueDogs();
        } else {
            return dequeueCats();
        }

    }

    public Animal dequeueDogs() {
        return dogs.poll();
    }

    public Animal dequeueCats() {
        return cats.poll();

    }

    public class Dog extends Animal {
        public Dog(String n) {
            super(n);
        }
    }

    public class Cat extends Animal {
        public Cat(String n) {
            super(n);
        }
    }

}


/*
1. What is the abstract class?
    使用了关键词abstract声明的类叫作“抽象类”。如果一个类里包含了一个或多个抽象方法，
类就必须指定成abstract（抽象）。“抽象方法”,属于一种不完整的方法，只含有一个声明，没有方法主体。


2. Private and Protected
Private: 只有类内可直接访问，私有的，类的实例要通过成员函数才可以访问，这个可以起到信息隐藏.
Protected: 类内和子类可直接访问，也就是说，基类中有protected成员，子类继承于基类，那么也可以
访问基类的protected成员，要是基类是private成员，则对于子类也是隐藏的，不可访问

3. Why this approach?
如果只用一个queue，那么dequeueAny 就会很简单，但dequeueDog 和 dequeueCat就需要在整个queue中找出dog或者cat，这就增加了计算复杂度
而现在这种方法通过增加了order这个parameter，成功避免了这个问题。

*/