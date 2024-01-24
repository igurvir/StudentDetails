/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detailsstudent;

/**
 *
 * @author gurvir
 */
public class DetailsStudent {

    /**
     * print student details using array of object 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* define 3 student */
       Student s1 = new Student();
       s1.setName("peter");
       s1.setId(112);
       Student s2 = new Student();
       s2.setName("john");
       s2.setId(113);
       Student s3 = new Student();
       s3.setName("kaur");
       s3.setId(114);
       Student[] list = new Student[3];
       list[0] = s1;
       list[1] = s2;
       list[2] = s3;
       //print data
       for (int i = 0; i<list.length; i++){
           System.out.println(list[i].getName() +" " + list[i].getId());
       }

    }
    
}
