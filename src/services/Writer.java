/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author silva
 */
public class Writer {
    public void write(String path, String value){
      
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            
            bw.write(value);
            bw.newLine();
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
