/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author silva
 */
public class Reader {
   
    public String read(String path){
        
        StringBuilder sb = new StringBuilder();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                
                sb.append(line).append("\n");
            }
            return sb.toString();
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
