package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grandFather1 = new Human("GrandFather1", true, 68, null, null);
        Human grandFather2 = new Human("GrandFather2", true, 69, null, null);
        Human grandMother1 = new Human("GrandMother1", false, 67, null, null);
        Human grandMother2 = new Human ("GrandMother2", false, 68, null, null);
        Human father = new Human ("Father", true, 35, grandFather1, grandMother1);
        Human mother = new Human("Mother", false, 33, grandFather2, grandMother2);
        Human child1 = new Human ("Child1", true, 16, father, mother);
        Human chil2 = new Human("Child2", false, 24, father, mother);
        Human child3 = new Human("Child3", true, 2, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(chil2);
        System.out.println(child3);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
