/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Bianca
 */
public class Conflicts {
    public static void main(String[] args) {
        java.sql.Date sdate = new java.sql.Date(123,2, 2);
        java.util.Date udate = new java.util.Date();
        System.out.println(udate.toString());
        System.out.println(sdate);
    }
}
