package HW10;

public class Person {
    private String name;
    private int age;
    private int height;

    public void Person(String name, int age, int height) {

        int namel = name.length();

        if (3 < namel && namel < 15 && 0 < age && age < 100 && 120 < height && height < 220) {
            this.name = name;
            this.age = age;
            this.height = height;
        } else {
            System.out.println("Invalid data");
            return;
        }


    }

    public void setAge(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
            return;
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
            return;
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
            return;
        }

    }

    public int getHeight() {
        return height;
    }

    public void printPersonInfo() {
        System.out.println(name + " " + age + " " + height);
    }
}
