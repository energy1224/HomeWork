package homeLesson6;


//### Задание #0
//
//        Разобрать работу методов класса String: `charAt`, `indexOf`, `isBlank`, `isEmpty`, `substring`.


public class StringMethods {

    public static void main(String[] args) {

        String expression = "String type is immutable. This is true";

        String str2="";
        String str3= " ";

        System.out.println(expression);

        //`charAt`
        System.out.println("Под индексом 3 находится символ " + expression.charAt(3));

        // indexOf
        System.out.println("Символ 'i' находится под индексом "+ expression.indexOf('i'));
        System.out.println("Второе вхождение символа 'i' находится под индексом "+ expression.indexOf('i', 4));
        System.out.println("Подстрока 'is' находится под индексом "+ expression.indexOf("is"));
        System.out.println("Второе вхождение подстроки 'is' находится под индексом "+ expression.indexOf("is",13));

        //`isBlank`
        System.out.println("isBlank");
        System.out.println(expression.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());

        // isEmpty
        System.out.println("isEmpty");

        System.out.println(expression.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

        //substring

        String substring1 = expression.substring(15);
        String substring2 = expression.substring(15,24);

        System.out.println(substring1);
        System.out.println(substring2);








    }
}
