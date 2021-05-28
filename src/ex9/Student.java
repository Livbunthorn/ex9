package ex9;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  java.util.Scanner;
public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private  int id;
    private String name;
    private String city;
    private String country;
    private String tel;

    private String group;
    private int yearOfBirth;



    private Student() {

    }
    public Student(int id,String name, String city, String country, int yearOfBirth, String tel,String group)
            throws DOBException, ParseException, DOBException {
        setName(name);
        setYearOfBirth(yearOfBirth);
        setTel(tel);
        setCity(city);
        setCountry(country);
    }

    public static Student dataInput() throws ParseException, DOBException {
        Scanner s = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter ID:");
        student.setId(s.nextInt());
        System.out.print("Enter Name:");
        String skip = s.nextLine();
        student.setName(s.nextLine());
        System.out.print("Enter Phone Number :+855 ");
        student.setTel(s.nextLine());
        System.out.print("Enter Year Of Birth: ");
        student.setYearOfBirth(s.nextInt());
        System.out.print("Enter City: ");
        String skip1 = s.nextLine();
        student.setCity(s.nextLine());
        System.out.print("Enter Country :");
        student.setCountry(s.nextLine());
        System.out.print("Enter Group :");
        student.setGroup(s.nextLine());
        return student;
    }
    //display
    public String Display(){
        return "id : " +id+"\nName : "+name+"\nPhone Number : +855 "+tel+"\nYear Of Birth :"+yearOfBirth +
                "\nCity :"+city +"\nCountry :"+country+"\nGroup :"+group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        FieldUtil.checkNullOrEmptyOrBlank(name,"Name");
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        FieldUtil.checkNullOrEmptyOrBlank(tel,"Phone Number ");
        this.tel = tel;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) throws ParseException,  DOBException {
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        format.format(currentDate);
        Date dob = format.parse(String.valueOf(yearOfBirth+15));

        if(dob.compareTo(currentDate) <= 0) {
            this.yearOfBirth = yearOfBirth;
        }else {
            throw new DOBException();
        }


    }




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        FieldUtil.checkNullOrEmptyOrBlank(city,"City");
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        FieldUtil.checkNullOrEmptyOrBlank(country,"Country");
        this.country = country;
    }
}
