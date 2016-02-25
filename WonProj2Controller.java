/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonproj2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Minhawn
 */
public class WonProj2Controller {
    
    WonProj2View proj2view;
    WonProj2Model proj2model;
    
    WonProj2Controller(WonProj2Model model, WonProj2View view)
    {
        proj2model = model;
        proj2view = view;
        
        
        view.addOutputDirListener(new OutputDirListener());
        view.addOutputSearchListener(new OutputSearchListener());
    }
    
    
    class OutputDirListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try
        {
            proj2model.DirOutput(proj2view.DirSearch.getText());
            proj2view.File_List.setText(proj2model.outputfiles);
            proj2model.outputfiles ="";
        }
        catch(Exception ex)
        {
           System.out.println("Error!");
        }
        }

    
    }
    
    class OutputSearchListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try
        {
            proj2model.SearchOutput(proj2view.DirSearch.getText(), proj2view.FileSearch.getText());
            proj2view.File_List.setText(proj2model.outputfiles);
            proj2model.outputfiles ="";
        }
        catch(Exception ex)
        {
           System.out.println("Error!");
        }
        }        
    }
}
