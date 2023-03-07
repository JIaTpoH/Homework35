//Создать класс Student c полями (переменными) имя и номер.
//Создать несколько объектов этого класса
public class Student {
  private String name;
  private int number;

  public Student(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public static void main(String[] args) {
    Student student1 = new Student("Dima", 111);
    Student student2 = new Student("Ivan", 222);
    Student student3 = new Student("Oleg", 333);

    System.out.println("Student 1 - Name: " + student1.getName() + ", Number: " + student1.getNumber());
    System.out.println("Student 2 - Name: " + student2.getName() + ", Number: " + student2.getNumber());
    System.out.println("Student 3 - Name: " + student3.getName() + ", Number: " + student3.getNumber());

    student1.setName("Anton");
    student1.setNumber(444);

    System.out.println("Student 1 - Name: " + student1.getName() + ", Number: " + student1.getNumber());
  }
}
