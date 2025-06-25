package com.xworkz.collection.runner;


import com.xworkz.collection.dto.TreeDto;
import com.xworkz.collection.repository.TreeRepository;
import com.xworkz.collection.repository.TreeRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class TreeRunner {
            public static void main(String[] args) {

                TreeRepository treeRepo = new TreeRepositoryImpl();
                Collection<TreeDto> trees = treeRepo.findAll();

                System.out.println("=== Using forEach ===");
                trees.forEach(tree -> System.out.println(tree.getTreeName() + ", " + tree.getColor() + ", " + tree.getSize()));

                System.out.println("\n=== Using Iterator ===");
                Iterator<TreeDto> iterator = trees.iterator();
                while (iterator.hasNext()) {
                    TreeDto tree = iterator.next();
                    System.out.println(tree.getTreeName() + ", " + tree.getColor() + ", " + tree.getSize());
                }

                System.out.println("\n=== Trees with size > 200 ===");
                for (TreeDto tree : trees) {
                    if (tree.getSize() > 200) {
                        System.out.println("Big Tree: " + tree.getTreeName() + " (" + tree.getSize() + ")");
                    }
                }
            }
        }



