package ru.mirea.pr2;

public class TesTM94 {
        public static void main(String[] args) {
            M94 M941 = new M94(1,2);
            M94 M942 = new M94(6,7);
            M94 M943 = new M94(123,412);
            System.out.println(M941);
            System.out.println(M942);
            System.out.println(M943);
            M941.move(123,435);
            M942.move(987,235);
            M943.move(876,2);
            System.out.println(M941);
            System.out.println(M942);
            System.out.println(M943);
        }
    }