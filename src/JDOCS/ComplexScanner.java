/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDOCS;

import java.io.IOException;
import java.net.MalformedURLException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeVisitor;
import org.jsoup.nodes.Node;

/**
 *
 * @author noah baertsch
 */
public class ComplexScanner{
    
    private final Document doc;
    
    /**
     * Constructor
     * 
     * @param url
     * @throws java.io.IOException
     */
    public ComplexScanner(String url) throws IOException{
        doc = Jsoup.connect(url).get();
        
        //TESTING
        //System.out.println("SCANNER: null -> " + (this.doc == null));
    }

    public int scanTotalNodes() {
        TotalNodeVisitor totalVisitor = new TotalNodeVisitor();
        this.doc.traverse(totalVisitor);
        return totalVisitor.totalNodes;
    }

    public int scanMaxNodeDepth() {
        MaxDepthNodeVisitor maxVisitor = new MaxDepthNodeVisitor();
        
        this.doc.traverse(maxVisitor);
        
        return maxVisitor.maxNodeDepth;
    }
    
    public int scanLinkNodes(){
        LinkNodeVisitor linkVisitor = new LinkNodeVisitor();
        this.doc.traverse(linkVisitor);
        return linkVisitor.totalLinks;
    }
    
    // TESTING
    public void loquaciousTraversal(){
        this.doc.traverse(new NodeVisitor(){
            @Override
            public void head(Node node, int depth) {
                System.out.println("Entering node: " + node.nodeName());
            }

            @Override
            public void tail(Node node, int depth) {
                System.out.println("Exiting node: " + node.nodeName());
            }
            
        });
    }
    
}
