package com.bibu.tool;

import com.bibu.entity.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * part树结构
 *
 * @author WeitJack
 * @since 2022-02-27 21:28:20
 */
public class PartTree {

    private final List<Part> PartList;
    public PartTree(List<Part> PartList) {
        this.PartList = PartList;
    }

    /**
     * 建立树形结构
     * @return
     */
    public List<Part> buildTree(){
        List<Part> treeParts = new ArrayList<>();
        for(Part PartNode : getRootNode()) {
            buildChildTree(PartNode);
            treeParts.add(PartNode);
        }
        return treeParts;
    }

    /**
     * 递归，建立子树形结构
     * @param pNode
     * @return
     */
    private Part buildChildTree(Part pNode){
        List<Part> childParts = new ArrayList<>();
        for(Part PartNode : PartList) {
            if(PartNode.getParentId().equals(pNode.getId())) {
                childParts.add(buildChildTree(PartNode));
            }
        }
        pNode.setChildren(childParts);
        return pNode;
    }


    /**
     * 获取根节点
     * @return
     */
    private List<Part> getRootNode() {
        List<Part> rootPartLists =new  ArrayList<>();
        for(Part PartNode : PartList) {
            if(PartNode.getParentId() == 0) {
                rootPartLists.add(PartNode);
            }
        }
        return rootPartLists;
    }

}
