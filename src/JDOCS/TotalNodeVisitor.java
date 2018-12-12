/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDOCS;

import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/**
 *
 * @author noah
 */
public class TotalNodeVisitor implements NodeVisitor{

    int totalNodes = 0;
    
    @Override
    public void head(Node node, int depth) {
        totalNodes++;
    }

    @Override
    public void tail(Node node, int depth) {
        
    }
    
}
