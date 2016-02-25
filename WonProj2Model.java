/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonproj2;

import java.io.File;

/**
 *
 * @author Minhawn
 */
public class WonProj2Model {
    
    File file;
    File[] list_files;
    String outputfiles;
    String filename;
    
    void DirOutput(String inputDir)
    {
        try
        {
        file = new File(inputDir);
        list_files = file.listFiles();
        
        for(int i = 0; i < list_files.length; i++)
        {
            outputfiles += (list_files[i].getName()) + "\n";
        }
        
        
        }
        
        catch(Exception ex)
        {
            outputfiles = "Error!";
        }
    }
    
    void SearchOutput(String inputDir, String inputSearch)
    {
        try
        {
            file = new File(inputDir);
            list_files = file.listFiles();
            for(int i = 0; i < list_files.length; i++)
            {
                filename = (list_files[i].getName());
                
                if(filename.contains(inputSearch))
                {
                    outputfiles += filename + "\n";
                }
            }
           
        }
        catch(Exception ex)
            {
               outputfiles = "Error!";
            }
        
    }
    
}
