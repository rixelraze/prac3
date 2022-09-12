import java.util.*;

class converting {

    public static <T> List<T> convertArrayToList(T[] array) {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;
    }

    public static void main(String[] args) {

        String[] arrayName = {"Ярослав", "Маня", "Коля", "Слава", "Ваня"};

        System.out.println("Массив: " + Arrays.toString(arrayName));

        List<String> list = convertArrayToList(arrayName);

        System.out.println("Список: " + list);

        Collections.sort(list);

        System.out.println("Отсортированный список: "+list);



    }




}