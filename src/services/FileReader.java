/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author silva
 */
public class FileReader {
   
    public static String read(File arquivo){
        System.out.println("chegou aqui");
        //System.out.println(arquivo.getName());
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("teste.txt"))){
            String line;
            while((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
        }
        catch(IOException e){
            
        }
        finally{
            return null;
        }
    }
}
