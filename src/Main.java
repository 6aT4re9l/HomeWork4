import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        task 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = in.nextInt();

        if (age >= 18)
            {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            }
        else
            {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }

//        task 2
        System.out.println("Введите температуру на улице:");
        int temperature = in.nextInt();
        if (temperature < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        else
        {
            System.out.println("Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.");
        }

//        task 3
        System.out.println("Введите скорость автомобиля:");
        int speed = in.nextInt();
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + ", то  придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
//        task 4
        System.out.println("Введите возраст человека:");
        int age1 = in.nextInt();
        if (age1 >= 2 && age1 <= 6){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в садик");
        }
        if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        else{
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }
//        task 5
        System.out.println("Введите возраст человека:");
        int age2 = in.nextInt();
        if (age2 < 5 ){
            System.out.println("Hельзя кататься на аттракционе");
        }
        if (age2 >= 5 && age2 <= 14){
            System.out.println("Mожно кататься на аттракционе в сопровождении");
        }
        else{
            System.out.println("Mожно кататься на аттракционе без сопровождения взрослого");
        }
//        task 6
        byte countTrain = 102;
        System.out.println("Введите кол-во человек в вагоне:");
        byte countPeople = in.nextByte();
        if (countPeople < 60){
            System.out.println("Сидячие места есть");
        } else if (countPeople < 102) {
            System.out.println("Сидячих мест нет");
        }
        else{
            System.out.println("Мест в поезде нет");
        }
//        task 7
        System.out.println("Введите первое число");
        int one = in.nextInt();
        System.out.println("Введите второе число");
        int two = in.nextInt();
        System.out.println("Введите третье число");
        int three = in.nextInt();
        if (one > two && one > three){
            System.out.println("Первое самое большое число");
        }
        if (two > one && two > three){
            System.out.println("Второе самое большое число");
        }
        else {
            System.out.println("Третье самое большое число");
        }
    }

}