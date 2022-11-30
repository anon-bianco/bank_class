/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_class;

/**
 *
 * @author hilbe
 */
public class Bank_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank icici=new bank();
        icici.bank_name="ICICI Bank";
        icici.interest=7;
        icici.dispay_interest();
        bank iob=new bank();
        iob.bank_name="IOB Bank";
        iob.interest=9;
        iob.dispay_interest();
        bank sbi=new bank();
        sbi.bank_name="SBI Bank";
        sbi.interest=8;
        sbi.dispay_interest();
    }
    
}
