package _1_创建型模式._4_原型_Prototype;

/**
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 */
public class Prototype {
    public static void main(String[] args) {
        Student student1 = new Student("lc", 18);
        Student student2 = (Student) student1.clone();
        Student student3 = student1.copy();
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

/**
 * Java Object 提供了 clone() 方法，需要实现一个Cloneable接口来标识一个对象是“可复制”的
 * 因为是返回的是 Object 所以需要进行强转
 * 或者自己定义一个 copy() 方法，返回一明确的类型
 */
class Student implements Cloneable {
    private String name;
    private int age;

    public Object clone() {
        Student student = new Student(name, age);
        return student;
    }

    public Student copy() {
        return new Student(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}