import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        В восточном календаре принят 60-летний цикл, состоящий из 12-
//        летних подциклов, обозначаемых названиями цвета: зеленый,
//        красный, желтый, белый и черный. В каждом подцикле годы носят
//        названия животных: крысы, коровы, тигра, зайца, дракона, змеи,
//        лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года
//        определить его название, если 1984 год — начало цикла: «год
//        зеленой крысы»
        


        String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
        String[] animals = {"крыса", "корова", "тигр", "заяц", "дракон", "змея", "лошадь", "овца", "обезьяна", "курица", "собака", "свинья"};

        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Ввод года
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        // Вычисляем смещение относительно 1984 года
        int offset = year - 1984;

        // Определяем животное и цвет с использованием остатка от деления
        String animal = animals[offset % 12];
        String color = colors[(offset % 60) / 12];

        // Вывод результата
        System.out.println("Год " + color + " " + animal);

        // Закрываем Scanner
        scanner.close();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }

}