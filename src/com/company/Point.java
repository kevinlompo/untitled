package com.company;
import java.math.*;
import java.util.*;

public class Point {
  private String nom;
  private float x, y;
  private static int Ident = 1;
  private int i = Ident;


  public Point(String nom, float x, float y) {

      this.nom = nom;
      this.x = x;
      this.y = y;
      Ident++;
  }

  public Point(){
      Ident++;
  }

    public Point(float x, float y){

      this.x = x;
      this.y = y;
        Ident++;
    }

  public double distance(Point p) {

      double d = Math.pow(2, (this.y-this.x)) + Math.pow(2, (p.y-p.x));
      d = Math.sqrt(d);
      return d;
  }

  public boolean equals(Point p) {

      if(p == this) {
          return true;
      }
      if (!(p instanceof Point)) {
          return false;
      }
    return Double.compare(this.x, p.x) == 0 && Double.compare(this.y, p.y) == 0;
  }

  public void deplacer(double dx, double dy) {

      this.x += dx;
      this.y += dy;
  }

  public String getNom(){
      return this.nom; }
  public void setNom(String nom) {
      this.nom = nom;
  }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public  int getIdent() {
        return i;
    }

   public String toString() {
      return "Le point "+ this.nom+" a pour abscisse "+this.x+" et ordonnée "+this.y+" son ident est "+ this.getIdent();
   }
}

