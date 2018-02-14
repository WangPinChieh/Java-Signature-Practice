/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.security.*;

/**
 *
 * @author Jay
 */
public class SignaturePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            NewJFrame _NJFrame = new NewJFrame();
            _NJFrame.setVisible(true);
        } catch (Exception exp) {
            String _ErrorInfo = exp.getMessage();
            System.out.println(_ErrorInfo);
        }
    }

}
