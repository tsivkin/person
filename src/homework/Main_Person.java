package homework;

import java.util.Scanner;

public class Main_Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:  ");
        String name = scanner.nextLine();

        System.out.println("Введите ваше отчество:  ");
        String middleName = scanner.nextLine();

        System.out.println("Введите вашу фамилию:  ");
        String familyName = scanner.nextLine();

        System.out.println("Введите сколько вам лет:  ");
        int age = scanner.nextInt();

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Первоначальное имя = " + person.getName());
        person.setName("Александр");
        System.out.println("Измененное имя = " + person.getName());

        System.out.println("Первоначальное отчество = " + person.getMiddleName());
        person.setMiddleName("Вячеславович");
        System.out.println("Измененное отчество = " + person.getMiddleName());

        System.out.println("Первоначальная фамилия = " + person.getFamilyName());
        person.setFamilyName("Цивкин");
        System.out.println("Измененная фамилия = " + person.getFamilyName());

        System.out.println("Первоначальный возраст = " + person.getAge());
        person.setAge(34);
        System.out.println("Измененный возраст = " + person.getAge());

        System.out.println(person);
    }

}
