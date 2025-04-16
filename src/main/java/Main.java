/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner sc = new Scanner(System.in);
      int n = 0;
      while (n == 0)
        {
          System.out.println("1 - Wypisz studentów: ");
          System.out.println("2 - Dodaj wpis: ");
          System.out.println("0 - Zakończ program: ");
          n = sc.nextInt();
          switch (n)
            {
                case 1:
                    var students = s.getStudents();
                    for(Student current : students) {
                      System.out.println(current.ToString());
                    }
                    n = 0;
                    break;
                case 2:
                    System.out.println("Podaj imie: ");
                    String imie = sc.next();
                    System.out.println("Podaj wiek: ");
                    int wiek = sc.nextInt();
                    s.addStudent(new Student(imie, wiek));
                    n = 0;
                    break;
                default:
                    n = 1;
                    break;
            }
        }
    } catch (IOException e) {

    }
  }
}