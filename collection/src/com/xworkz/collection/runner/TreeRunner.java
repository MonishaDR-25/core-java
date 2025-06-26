package com.xworkz.collection.runner;


import com.xworkz.collection.dto.TreeDto;
import com.xworkz.collection.repository.TreeRepository;
import com.xworkz.collection.repository.TreeRepositoryImpl;

import java.util.ArrayList;
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

                // contains
                TreeDto checkTree = new TreeDto("Banana Tree", "Light Green", 80);
                System.out.println("\nContains 'Banana Tree'? " + trees.contains(checkTree)); // true

                // remove
                boolean removed = trees.remove(checkTree);
                System.out.println("Removed 'Banana Tree'? " + removed);
                System.out.println("Still contains 'Banana Tree'? " + trees.contains(checkTree)); // false

                // isEmpty
                System.out.println("\nIs tree collection empty? " + trees.isEmpty());

                // addAll
                Collection<TreeDto> newTrees = new ArrayList<>();
                newTrees.add(new TreeDto("Banyan Tree", "Green", 500));
                newTrees.add(new TreeDto("Coconut Tree", "Green", 150));
                trees.addAll(newTrees);
                System.out.println("\nTrees after addAll():" +trees.addAll(newTrees));


                // removeAll
                boolean removedAll = trees.removeAll(newTrees);
                System.out.println("\nRemoved all new trees? " + removedAll);

                // containsAll
                Collection<TreeDto> originalTrees = treeRepo.findAll();
                System.out.println("Contains all original trees? " + trees.containsAll(originalTrees));
            }
            }




