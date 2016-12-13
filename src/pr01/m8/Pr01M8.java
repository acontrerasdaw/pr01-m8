/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr01.m8;

import java.io.*;

public class Pr01M8 {

    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine(); 
            bw.write(" <head>");bw.newLine();
            bw.write(" <title>");bw.newLine(); bw.write(" Nova p&agrave;gina web");
            bw.newLine(); bw.write(" </title>"); bw.newLine(); bw.write(" </head>"); bw.newLine();
            bw.write(" <body>");
            bw.newLine();
            bw.write(" Nova p&agrave;gina web"); 
            bw.newLine();
            bw.write(" </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            bw.close(); 
        }
    }
}
/*5. Des de Netbeans aprofitant les eines del menú “Team” 
crea i inicialitza un repositori local de tipus Git. 
Comprova que s'ha creat una carpeta de nom .git dins de la teva carpeta del projecte pr01_m8. */