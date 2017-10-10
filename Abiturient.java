
package uits.jv1614.oop4;


public class Abiturient {
   private int id;
   private String SurName;
   private String Name;
   private String MiddleName;
   private String address;
   private int number;
   private int mark;
   
   
   public Abiturient(int id, String Name, String SurName, String MiddleName, String address, int number, int mark)  {
        
        this.id = id;
        this.Name = Name;
        this.SurName = SurName;
        this.MiddleName = MiddleName;
        this.address = address;
        this.number = number;
        this.mark = mark;
        
    }
    public int getid() {
        return id;
    }
 
    public void setid(int id) {
        this.id = id;
    }
 
    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        this.Name = name;
    }
 
    public String getSurname() {
        return SurName;
    }
 
    public void setSurname(String surname) {
        this.SurName = surname;
    }
    public String getMiddleName() {
        return MiddleName;
    }
 
    public void setMiddleName(String surname) {
        this.MiddleName = MiddleName;
    }
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    public int getnumber() {
        return number;
    }
 
    public void setnumber(int number) {
        this.number = number;
    }
    public int getmark() {
        return mark;
    }
 
    public void setmark(int mark) {
        this.mark = mark;
    }
    
    @Override
    public String toString() {
         return " id:" + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " address: " + address + '\n' +
                " telefon: " + number + '\n' +
                " mark: " + mark + '\n' ;
    }
}
