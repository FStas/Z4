public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private int Day;
  private int Month;
  private int Year;

  public Student(String name, String surname, int age, int day, int month, int year) {
    Name = name;
    Surname = surname;
    Age = age;
    Day = day;
    Month = month;
    Year = year;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  public int GetDay() {return Day;}
  public int GetMonth() {return Month;}
  public int GetYear() {return Year;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " " + Integer.toString(Day) + " " + Integer.toString(Month) + " " + Integer.toString(Year);

    }
    public static Student Parse(String str) {
      try {
        String[] data = str.split(" ");
        if (data.length != 6) {
          return new Student("Parse Error", "Wrong number of fields", -1, -1, -1, -1);
        }

        int age = Integer.parseInt(data[2]);
        int day = Integer.parseInt(data[3]);
        int month = Integer.parseInt(data[4]);
        int year = Integer.parseInt(data[5]);

        if (age < 0 || age > 150) {
          return new Student("Parse Error", "Invalid age", -1, -1, -1, -1);
        }
        if (day < 1 || day > 31) {
          return new Student("Parse Error", "Invalid day", -1, -1, -1, -1);
        }
        if (month < 1 || month > 12) {
          return new Student("Parse Error", "Invalid month", -1, -1, -1, -1);
        }
        if (year < 1900 || year > 3000) {
          return new Student("Parse Error", "Invalid year", -1, -1, -1, -1);
        }

        return new Student(data[0], data[1], age, day, month, year);
      } catch (NumberFormatException e) {
        return new Student("Parse Error", "Invalid number format", -1, -1, -1, -1);
      }
    }
  }