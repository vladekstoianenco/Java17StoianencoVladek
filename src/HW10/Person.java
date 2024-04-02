package HW10;
/*
Создайте класс Person с переменными: name, age, height. Для данного класса используйте инкапсуляцию.
 Длина имени должна быть больше 3 и меньше 15.
 Возраст должен быть больше 0 и меньше 100 и рост должен быть не меньше 120 и не больше 220.
 Создайте  метод printPersonInfo, который будет выводить информацию о человеке,
 при этом не используя переменные класса напрямую.
В классе Main создайте объект класса Person и вызовите метод printPersonInfo со всеми заполненными значениями.
 */

public class Person {
    private String name;
    private int age;
    private int height;

    public Person() {
    }

    public Person(String name, int age, int height) {

        int namel = name.length();

        if (3 < namel && namel < 15 && 0 < age && age < 100 && 120 < height && height < 220) {
            this.name = name;
            this.age = age;
            this.height = height;
        } else {
            System.err.println("Invalid data");

        }


    }

    public void setAge(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        } else {
            System.err.println("Invalid age");
        }


    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        int namel = name.length();
        if (3 < namel && namel < 15) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        if (120 < height && height < 220) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
        }
    }

    public int getHeight() {
        return height;
    }

    public void printPersonInfo() {
        System.out.printf("Name: %s Age: %d Height: %d%n", getName(), getAge(), getHeight());
    }
}
