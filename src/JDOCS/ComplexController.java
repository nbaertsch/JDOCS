/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDOCS;

import java.io.IOException;

/**
 *
 * @author noah
 */
public class ComplexController {
    
    private ComplexScanner doc;
    private ComplexUI gui;
   
    /**
     * Constructor 
     * 
     */
    public ComplexController(){
        this.createUI();
    }
    
    // builds UI in event queue thread
    private void createUI(){
        this.gui = new ComplexUI(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
    }
    
    public void createScanner(String url) throws IOException{
        this.doc = new ComplexScanner(url);
    }
    
    public int getTotalNodes(){
        return this.doc.scanTotalNodes();
    }
    
    public int getMaxNodeDepth(){
        return this.doc.scanMaxNodeDepth();
    }
    
    public int getTotalLinkNodes(){
        return this.doc.scanLinkNodes();
    }
    
    //TESTING
    public void loquaciousTraversal(){
        this.doc.loquaciousTraversal();
    }
    
}
