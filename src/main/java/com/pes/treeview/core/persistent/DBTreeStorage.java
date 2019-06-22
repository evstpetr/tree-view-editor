package com.pes.treeview.core.persistent;

import com.pes.treeview.core.domain.DbNode;
import com.pes.treeview.core.domain.Node;
import org.springframework.stereotype.Component;

@Component
public class DBTreeStorage {

    private DbNode tree;

    public DBTreeStorage() {
        reset();
    }

    public Node getTree() {
        return tree;
    }

    public void reset() {
        tree = buildDefault();
    }

    private DbNode buildDefault(){
        //Root level
        DbNode root = new DbNode("root", null);
        //Level 1
        DbNode node11 = new DbNode("DbNode 1", root);
        DbNode node12 = new DbNode("DbNode 2", root);
        root.addChild(node11);
        root.addChild(node12);
        //Level 2
        DbNode node111 = new DbNode("DbNode 3", node11);
        DbNode node112 = new DbNode("DbNode 4", node11);
        DbNode node113 = new DbNode("DbNode 5", node11);
        node11.addChild(node111);
        node11.addChild(node112);
        node11.addChild(node113);
        DbNode node121 = new DbNode("DbNode 6", node12);
        node12.addChild(node121);
        //Level 3
        DbNode node1211 = new DbNode("DbNode 7", node121);
        DbNode node1212 = new DbNode("DbNode 8", node121);
        node121.addChild(node1211);
        node121.addChild(node1212);
        //Level 4
        DbNode node12111 = new DbNode("DbNode 9", node1211);
        DbNode node12112 = new DbNode("DbNode 10", node1211);
        DbNode node12113 = new DbNode("DbNode 11", node1211);
        node1211.addChild(node12111);
        node1211.addChild(node12112);
        node1211.addChild(node12113);

        return root;
    }
}
