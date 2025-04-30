
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
    return Name + ' ' + Surname + ' ' + Integer.toString(Age) + ' ' + Integer.toString(Day+' '+Month+' '+Year);

  }
  public static Student Parse(String str){
    String[] data = str.split(" ");
    if(data.length != 6)
      return new Student("Parse Error", "Parse Error", -1, -1, -1, -1);
    else
      return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
  }
}