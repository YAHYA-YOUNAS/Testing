package project;

import java.util.*;
import javax.swing.*;

public class Project {


    public static void main(String[] args) {

       Students s = new Students();
       Books b = new Books();
       
       while(true){
           String c = JOptionPane.showInputDialog("Please Enter: \n 1 for Students \n 2 for Books \n=============>>>>");
           while(true){
           int ans = Integer.parseInt(c);
           if(ans==1){
           s.main();
       }
           else if(ans==2){
               b.main();
           }
           }
       }
    }

}

class menu_Std{
    ArrayList data;
    menu_Std(){
        data=new ArrayList();
    }
    public boolean add(){
        Students s = new Students();
        s.CNIC = JOptionPane.showInputDialog("Enter the CNIC: ");
        s.name = JOptionPane.showInputDialog("Enter the Name: ");
        s.F_name = JOptionPane.showInputDialog("Enter the Father Name: ");
        s.address = JOptionPane.showInputDialog("Enter the Address: ");
        s.cell = JOptionPane.showInputDialog("Enter the Phone Number: "); 
        s.reg_num = JOptionPane.showInputDialog("Enter the Reg. No. Of Std: ");
        s.department = JOptionPane.showInputDialog("Enter the Department of Std: ");
        
        return data.add(s);
    }
    
    public void search(){
        String reg = JOptionPane.showInputDialog("Enter the Reg No. for search: ");
        String searched = "";
        for (int i=0; i<data.size(); i++){
            Students t = (Students)data.get(i);
            if(t.CNIC==reg){
                searched = searched + t.display_S();
            }
        }
        if(searched.isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Not Found!");
        }
        else{
            JOptionPane.showMessageDialog(null, searched);
        }
    }
    public void display_record(){
        String searched = "";
        for (int i=0; i<data.size(); i++){
            Students t = (Students)data.get(i);
            searched = searched + t.display_S();
        }
         if(searched.isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Not Found!");
        }
        else{
            JOptionPane.showMessageDialog(null, searched);
        }
    }
    
    public void remove(){
         String CNIC = JOptionPane.showInputDialog("Enter the CNIC for search: ");
        
        for (int i=0; i<data.size(); i++){
            Students t = (Students)data.get(i);
            if(t.CNIC==CNIC){
                data.remove(i);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Record Not found!");
            }
        }
        JOptionPane.showMessageDialog(null, "Record Deleted Successfully!");
        
    }
}



class Students  {
    String CNIC;
    String name;
    String F_name;
    String address;
    String cell;
    String reg_num;
    String department;

   public void main(){
       menu_Std s= new menu_Std();
       String menu = "Enter : \n 1 for add record \n 2 for remove record \n 3 for search record \n 4 for show record \n 5 for exit \n==============>>>";
       while(true){ 
       String m = JOptionPane.showInputDialog(menu);
       switch (m){
           case "1":
               s.add();
            break;
            case "2":
                s.remove();
                break;
            case "3":
                s.search();
                break;
            case "4":
                s.display_record();
                break;
            case "5":
                System.exit(0);
                break;
       }
   }       
               
   }


    public void display() {
        System.out.println("CNIC: " + CNIC + "\n" + "Name: " + name + "\n" + "Father Name: " 
                + F_name + "\n" + "Address: " + address +"\n"+ "Phone Number: " + cell+ "\n" + "Registration Number: " + reg_num + "\n" + "Department: " + department);
    }
    public String display_S() {
        return("CNIC: " + CNIC + "\n" + "Name: " + name + "\n" + "Father Name: " 
                + F_name + "\n" + "Address: " + address +"\n"+ "Phone Number: " + cell+ "Registration Number: " + reg_num + "\n" + "Department: " + department);
    }
}

    
class Books {
    String name;
    String author;
    String serial_num;
   public int total_books;
    String edition;
    
    public void main(){
       menu_Std s= new menu_Std();
       String menu = "Enter : \n 1 for add record \n 2 for remove record \n 3 for search record \n 4 for show record \n 5 for exit \n==============>>>";
      while (true){  
       String m = JOptionPane.showInputDialog(menu);
       switch (m){
           case "1":
               s.add();
            break;
            case "2":
                s.remove();
                break;
            case "3":
                s.search();
                break;
            case "4":
                s.display_record();
                break;
            case "5":
                System.exit(0);
                break;
       }
   }       
    }

    public void display() {
        System.out.println("Name: " + name + "\n" + "Author Name: " + author + "\n" 
                + "Serial name: " + serial_num + "\n" + "Edition:" + edition );
            }
    public String display_B() {
        return("Book Name: "+name+"\n"+"Author: "+author+"\n"+"Serial No. : "+serial_num+"\n"
                + "Edition: "+edition);
    }
     }
class menu_Books{
    ArrayList data;
    menu_Books(){
        data=new ArrayList();
    }
    public boolean add(){
        Books s = new Books();
        s.name = JOptionPane.showInputDialog("Enter the Book Name: ");
        s.author = JOptionPane.showInputDialog("Enter the Book Author: ");
        s.serial_num = JOptionPane.showInputDialog("Enter the Book Serial No.: ");
        s.edition = JOptionPane.showInputDialog("Enter the Book Edition: ");
        
        return data.add(s);
    }
    
    public void search(){
        String sr = JOptionPane.showInputDialog("Enter the Serial No. for search: ");
        String searched = "";
        for (int i=0; i<data.size(); i++){
            Books t = (Books)data.get(i);
            if(t.serial_num==sr){
                searched = searched + t.display_B();
            }
        }
        if(searched.isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Not Found!");
        }
        else{
            JOptionPane.showMessageDialog(null, searched);
        }
    }
    public void display_record(){
        String searched = "";
        for (int i=0; i<data.size(); i++){
            Books t = (Books)data.get(i);
            searched = searched + t.display_B();
        }
         if(searched.isEmpty()){
            JOptionPane.showMessageDialog(null,"Data Not Found!");
        }
        else{
            JOptionPane.showMessageDialog(null, searched);
        }
    }
    public void remove(){
         String sr = JOptionPane.showInputDialog("Enter the Serial No. for search: ");
        String searched = "";
        for (int i=0; i<data.size(); i++){
            Books t = (Books)data.get(i);
            if(t.serial_num==sr){
                data.remove(i);
            }
            else{
            JOptionPane.showMessageDialog(null,"Data Not Found!");
            }
        }
    }
    
}
       
        

    

