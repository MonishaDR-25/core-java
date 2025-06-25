package com.xworkz.collection.repository;

import com.xworkz.collection.dto.TreeDto;

import java.util.ArrayList;
import java.util.Collection;


public class TreeRepositoryImpl implements TreeRepository{
    @Override
    public Collection<TreeDto> findAll() {

        TreeDto treeDto1=new TreeDto("Mango Tree","Dark Green",100);
        TreeDto treeDto2=new TreeDto("Banana Tree","Light Green",80);
        TreeDto treeDto3=new TreeDto("Gulmohar Tree","Red",300);
        TreeDto treeDto4=new TreeDto("Neem Tree","Green",250);
        TreeDto treeDto5=new TreeDto("Banyan Tree","Dark Green",500);

        Collection<TreeDto> collection=new ArrayList<>();
        collection.add(treeDto1);
        collection.add(treeDto2);
        collection.add(treeDto3);
        collection.add(treeDto4);
        collection.add(treeDto5);

        return collection;
    }
}
