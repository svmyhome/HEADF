package formatString;

import java.util.Calendar;
import java.util.Date;

public class formatString {

    public static void main(String[] args) {
        System.out.println("----------------Форматирование чисел------------------------");
        int one = 1234567890;
        double two =1234567890.1234567890;
        System.out.println("Расставляем знаки между нулями"  + 100000000);
        System.out.println(String.format("Расставляем знаки между нулями %,d", 100000000));
        System.out.println(String.format("Расставляем запятую перед 2 символами %.2f", 100000000.9494943));
        System.out.println(String.format("Расставляем точки между нулями и запятую %,.2f", 100000000.9494943));
        System.out.println(String.format("Закодирован символ %c", 43));
        System.out.println(String.format("Выводим несколько отформатированных значений подряд первое значение %,d второе значение %,.2f", one, two));
        System.out.println("--------------------Работа с датой через DATE------------------");
        System.out.println(new Date());
        Date today = new Date();
        System.out.println(String.format("Полная дата = %tc", today));
        System.out.println(String.format("Только время = %tr", today));
        System.out.println(String.format("День недели, месяц и число = %tA, %tB %td", today, today, today));
        System.out.println("--------------------Работа с датой через CALENDARE------------------");
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());
        c1.set(2020,11,26, 15,48); // установил свое время
        System.out.println(c1.getTime());
        long sec1 = c1.getTimeInMillis();
        System.out.println(sec1);
        c1.roll(c1.DATE, 10);
        System.out.println(c1.getTime());
        c1.add(c1.DATE, 30);
        System.out.println(c1.getTime());

    }

}
