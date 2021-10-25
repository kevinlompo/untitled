package com.company;
import com.company.Point;
import java.util.Scanner;
import java.util.*;

public class TestePoint {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le nom du point 1 : ");
        String nom1 = sc.next();
        System.out.print("Entrer l'abscisse  du point 1 : ");
        float x1 = sc.nextFloat();
        System.out.print("Entrer l'ordonnée du point 1 : ");
        float y1 = sc.nextFloat();

        System.out.println("------------------------------");

        System.out.print("Entrer le nom du point 2 : ");
        String nom2 = sc.next();
        System.out.print("Entrer l'abscisse  du point 2 : ");
        float x2 = sc.nextFloat();
        System.out.print("Entrer l'ordonnée du point 2 : ");
        float y2 = sc.nextFloat();

        Point p1 = new Point(nom1, x1, y1);
        Point p2 = new Point(nom2, x2, y2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.deplacer(14.2, 47.1);
        p2.deplacer(10.56, 24.12);

        System.out.println("------------------------------");
        System.out.println("Après déplacement, on obtient : ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p1.setNom("Pepe1");
        p2.setNom("Pepe2");

        System.out.println("------------------------------");
        System.out.println("Après modification, on obtient : ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Point [] Tab = {p1,p2};
    }
}