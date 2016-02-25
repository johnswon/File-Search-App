/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wonproj2;

/**
 *
 * @author Minhawn
 */

public class WonProj2 {
    
public static void main(String[] args) {

    WonProj2Model model = new WonProj2Model();
    WonProj2View view = new WonProj2View();
    WonProj2Controller controller = new WonProj2Controller(model, view);
    
    view.setVisible(true);
}
}
