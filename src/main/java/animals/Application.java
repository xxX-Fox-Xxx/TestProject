package main.java.animals;

public class Application {

    public static void main(String[] args) {
        // Создаем два экземпляра класса Kotik
        Kotik kotik1 = new Kotik("Barsik", "Meow", 5, 10);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Murzik");
        kotik2.setVoice("Mrrr");
        kotik2.setSatiety(7);
        kotik2.setWeight(8);

        // Вызываем метод liveAnotherDay() у первого котика
        String[] actions = kotik1.liveAnotherDay();
        // Выводим в консоль результаты действий котика за день
        for (String action : actions) {
            System.out.println(action);
        }

        // Выводим имя и вес второго котика
        System.out.println("Name: " + kotik2.getName());
        System.out.println("Weight: " + kotik2.getWeight());

        // Сравниваем голоса котиков и выводим результат сравнения
        System.out.println("Do kotiks speak the same? " + compareVoice(kotik1, kotik2));

        // Выводим количество созданных котиков
        System.out.println("Total kotiks created: " + Kotik.getCount());
    }

    // Метод для сравнения голосов котиков
    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }

}
