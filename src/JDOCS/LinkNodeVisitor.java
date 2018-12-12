/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDOCS;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;

/**
 *Used to traverse a DOM tree and accumulate a count of links.
 * 
 * @author noah
 */
public class LinkNodeVisitor implements NodeVisitor{

    int totalLinks = 0;
    Element aTemp = new Element("a");
    
    @Override
    public void head(Node node, int depth) {
        // This is test code that currently does nothing of import
        Element a = null;
        if(node instanceof Element){
            a = (Element) node;
        }
        // Read the Jsoup api to understand what's hapening here, also
        // this doesnt work. I have tried all the obvious ways of comparing tags and tag names.
        // The api is very lacking and as such I deem this impossible.
        if(node.nodeName().equalsIgnoreCase("a")){
            totalLinks++;
        }
    }

    @Override
    public void tail(Node node, int depth) {
        //do nothing, we dont need this here
    }
    
}
