package ru.mirea.pr2;
public class TestPr2 {
    public static void main(String[] args) {
        Pr2 author1 = new Pr2("Bob", "BobMeGaMeN@mail.com", 'M');
        Pr2 author2 = new Pr2("Niko", "NIkoSuPa@mail.ru", 'M');
        Pr2 author3 = new Pr2("Gleb", "G.L.e.B.@mail.ru",'M');
        System.out.println(author3);
        author1.out();
        author2.out();
        author3.out();
        System.out.println();
    }
}