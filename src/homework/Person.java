package homework;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    private int birthYear;
    private int currentYear = 2024;


    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
        this.birthYear = calcBirthYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Имя было изменено");
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middleName;
        }
        System.out.println("Отчество было изменено");
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
        }
        System.out.println("Фамилия была изменена");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
            this.birthYear = calcBirthYear();
        }
        System.out.println("Возраст был изменен");
    }

    public int calcBirthYear() {
        return birthYear = currentYear - this.age;
    }

    @Override
    public String toString() {
        return "{ " + familyName + " " + name + " " + middleName + " " + birthYear + " }";
    }
}
