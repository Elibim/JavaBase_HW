package ua.lits.java_base.hw14.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBooks {
    public static void main(String[] args) {
        System.out.println("Стоворити list з 40 тасками");

        Task one = new Task("Book title One", "1973-05-12", TypeEnum.READING, Arrays.asList("Bestseller", "AudioBook") );
        Task two = new Task("Book title One", "1999-11-30", TypeEnum.NEW, Arrays.asList("AudioBook", "Crime") );
        Task three = new Task("Book title Two", "2001-05-03", TypeEnum.DONE, Arrays.asList("Bestseller", "Biography") );
        Task four = new Task("Book title Two", "1994-03-06", TypeEnum.DONE, Arrays.asList("AudioBook", "Thriller") );
        Task five = new Task("Book title Two", "2008-11-27", TypeEnum.NEW, Arrays.asList("AudioBook", "SF") );
        Task six = new Task("Book title Three", "1989-06-12", TypeEnum.DONE, Arrays.asList("Bestseller", "SF") );
        Task seven = new Task("Book title Three", "1994-06-28", TypeEnum.READING, Arrays.asList("Bestseller", "Crime") );
        Task eight = new Task("Book title Four", "1989-03-25", TypeEnum.DONE, Arrays.asList("AudioBook", "Romance") );
        Task nine = new Task("Book title Five", "2010-02-15", TypeEnum.DONE, Arrays.asList("Bestseller", "Biography") );
        Task oneZero = new Task("Book title Six", "2018-01-18", TypeEnum.READING, Arrays.asList("AudioBook", "Crime") );
        Task oneOne = new Task("Book title Six", "2020-11-13", TypeEnum.NEW, Arrays.asList("AudioBook", "Romance") );
        Task oneTwo = new Task("Book title Seven", "2005-12-19", TypeEnum.DONE, Arrays.asList("AudioBook", "Crime") );
        Task oneThree = new Task("Book title Eight", "1997-08-22", TypeEnum.READING, Arrays.asList("Thriller", "Romance") );
        Task oneFour = new Task("Book title Nine", "1992-09-27", TypeEnum.NEW, Arrays.asList("Bestseller", "Crime") );
        Task oneFive = new Task("Book title Ten", "1983-10-26", TypeEnum.DONE, Arrays.asList("Biography", "Romance") );
        Task oneSix = new Task("Book title Ten", "1968-12-23", TypeEnum.DONE, Arrays.asList("Bestseller", "Crime") );
        Task oneSeven = new Task("Book title Ten", "1949-01-22", TypeEnum.NEW, Arrays.asList("AudioBook", "Romance") );
        Task oneEight = new Task("Book title Eleven", "1999-02-16", TypeEnum.READING, Arrays.asList("Bestseller", "Thriller") );
        Task oneNine = new Task("Book title Twelve", "1992-04-12", TypeEnum.DONE, Arrays.asList("AudioBook", "Romance") );
        Task twoZero = new Task("Book title Eleven", "1993-11-28", TypeEnum.DONE, Arrays.asList("Bestseller", "Thriller") );
        Task twoOne = new Task("Book title Twenty Nine", "1984-05-26", TypeEnum.READING, Arrays.asList("AudioBook", "Crime") );
        Task twoTwo = new Task("Book title Twenty Nine", "1999-04-16", TypeEnum.NEW, Arrays.asList("AudioBook", "Romance") );
        Task twoThree = new Task("Book title Twenty Eight", "1998-09-14", TypeEnum.NEW, Arrays.asList("Bestseller", "Thriller") );
        Task twoFour = new Task("Book title Twenty Seven", "1994-10-18", TypeEnum.READING, Arrays.asList("AudioBook", "SF") );
        Task twoFive = new Task("Book title Twenty Six", "1987-01-04", TypeEnum.DONE, Arrays.asList("Bestseller", "Romance") );
        Task twoSix = new Task("Book title Twenty Five", "1948-02-02", TypeEnum.NEW, Arrays.asList("Bestseller", "Thriller") );
        Task twoSeven = new Task("Book title Twenty Four", "1969-03-12", TypeEnum.READING, Arrays.asList("AudioBook", "Romance") );
        Task twoEight = new Task("Book title Twenty Three", "1992-04-09", TypeEnum.NEW, Arrays.asList("AudioBook", "Biography") );
        Task twoNine = new Task("Book title Twenty Two", "1991-05-30", TypeEnum.READING, Arrays.asList("AudioBook", "SF") );
        Task threeZero = new Task("Book title Twenty One", "1991-06-25", TypeEnum.DONE, Arrays.asList("AudioBook", "Crime") );
        Task threeOne = new Task("Book title Twenty One", "2002-07-16", TypeEnum.DONE, Arrays.asList("Bestseller", "Crime") );
        Task threeTwo = new Task("Book title Twenty", "2007-08-05", TypeEnum.READING, Arrays.asList("Bestseller", "Romance") );
        Task threeThree = new Task("Book title Nineteen", "2020-09-07", TypeEnum.NEW, Arrays.asList("AudioBook", "SF") );
        Task threeFour = new Task("Book title Eighteen", "2020-10-03", TypeEnum.DONE, Arrays.asList("AudioBook", "Biography") );
        Task threeFive = new Task("Book title Eighteen", "1992-11-07", TypeEnum.READING, Arrays.asList("AudioBook", "Thriller") );
        Task threeSix = new Task("Book title Seventeen", "2015-12-03", TypeEnum.NEW, Arrays.asList("Bestseller", "Crime") );
        Task threeSeven = new Task("Book title Sixteen", "2017-04-17", TypeEnum.READING, Arrays.asList("AudioBook", "Romance") );
        Task threeEight = new Task("Book title Fifteen", "2019-04-12", TypeEnum.READING, Arrays.asList("AudioBook", "Biography") );
        Task threeNine = new Task("Book title Fourteen", "2020-11-30", TypeEnum.NEW, Arrays.asList("Bestseller", "Romance") );
        Task fourZero = new Task("Book title Thirteen", "2008-12-17", TypeEnum.DONE, Arrays.asList("AudioBook", "Thriller") );

        List<Task> tasks = new ArrayList<>();
        tasks.add(one);
        tasks.add(two);
        tasks.add(three);
        tasks.add(four);
        tasks.add(five);
        tasks.add(six);
        tasks.add(seven);
        tasks.add(eight);
        tasks.add(nine);
        tasks.add(oneZero);
        tasks.add(oneOne);
        tasks.add(oneTwo);
        tasks.add(oneThree);
        tasks.add(oneFour);
        tasks.add(oneFive);
        tasks.add(oneSix);
        tasks.add(oneSeven);
        tasks.add(oneEight);
        tasks.add(oneNine);
        tasks.add(twoZero);
        tasks.add(twoOne);
        tasks.add(twoTwo);
        tasks.add(twoThree);
        tasks.add(twoFour);
        tasks.add(twoFive);
        tasks.add(twoSix);
        tasks.add(twoSeven);
        tasks.add(twoEight);
        tasks.add(twoNine);
        tasks.add(threeZero);
        tasks.add(threeOne);
        tasks.add(threeTwo);
        tasks.add(threeThree);
        tasks.add(threeFour);
        tasks.add(threeFive);
        tasks.add(threeSix);
        tasks.add(threeSeven);
        tasks.add(threeEight);
        tasks.add(threeNine);
        tasks.add(fourZero);

        Long t = tasks.stream()
                .count();
        System.out.println(t);

        System.out.println("3. Знайти title усіх прочитаних (DONE) тасків і відсортувати по даті");
        tasks.stream()
                .sorted((i1, i2) -> i1.creationDate.compareTo(i2.creationDate))
                .filter(task -> task.type.equals(TypeEnum.DONE))
                .forEach(e -> System.out.println(e.getTitle() + " " + e.creationDate));

        System.out.println("4. Знайти всі унікальні title");
        tasks.stream()
                .map(task -> task.getTitle())
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("5. Знайти усі таски з унікальним title");
        tasks.stream()
                .map(task -> task.getTitle())
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("6. Знайти топ 10 тасків відсортованих за датою створення");
        tasks.stream()
                .sorted((i1, i2) -> i1.creationDate.compareTo(i2.creationDate))
                .limit(10)
                .forEach(e -> System.out.println(e.creationDate));

        System.out.println("7. Знайти кількість прочитаних (DONE) тасків");
        Long l = tasks.stream()
                .filter(task -> task.type.equals(TypeEnum.DONE))
                .count();
        System.out.println(l);

        System.out.println("8. Знайти всі унікальні tags у всіх тасках");
        tasks.stream()
                .map(e -> e.getTags())
                .flatMap(e -> e.stream())
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("9. Знайти всі прочитані (DONE) таски які мають tag 'Book' (AudioBook)");
        long a = tasks.stream()
                .filter(task -> task.type.equals(TypeEnum.DONE))
                .map(e -> e.getTags())
                .flatMap(e -> e.stream())
                .filter(tags -> tags.equals("AudioBook"))
                .count();
        System.out.println(a);

//        System.out.println("try");
//        tasks.stream()
//                .filter(task -> task.type.equals(TypeEnum.DONE))
//                .map(e -> e.getTags())
//                .flatMap(e -> e.stream())
//                .filter(tags -> tags.equals("AudioBook"))
//                .forEach(e -> System.out.println(e));

        System.out.println("10. Сторити Саммарі з тайтлом для свіх тасків");
        tasks.stream()
                .forEach(e -> System.out.println(e.getTitle()));

//        "4. Знайти всі унікальні title"/"5. Знайти усі таски з унікальним title" DIFFERENT?
    }
}
