package algorithmTest;

import algorithm.BTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgorithmCommonTest extends Assert {

    BTree tree = new BTree();

    @Before
    public void setUp() {
        for (int i = 1; i<=7; i++){
            tree.insert(i);
        }
    }

    @Test
    public void testInsert() {
        tree.insert(20);
        boolean expected = tree.search(20);
        assertTrue(expected);
    }

    @Test
    public void testPrint() {
        tree.print();
        String expected = tree.print();
        assertEquals(expected," \n" +
                "\t \n" +
                "\t\t3\n" +
                "\t4\n" +
                "\t \n" +
                "\t\t1\n" +
                "\t2\n" +
                "\t \n" +
                "\t\t7\n" +
                "\t\t6\n" +
                "\t\t5\n");
    }

    @Test
    public void testSearch() {
        boolean expected = tree.search(4);
        assertTrue(expected);
    }

    @Test
    public void testEmptyPrint() {
        assertEquals(tree.printBtree(null,""),"The B-Tree is Empty");
    }

    @Test
    public void testEmptySearch() {
        boolean expected = tree.search(1000);
        assertFalse(expected);
    }

    @Test
    public void testDelete() {
        assertTrue(tree.search(1));
        tree.delete(1);
        assertFalse(tree.search(1));
    }

    @Test
    public void testDeleteNothing() {
        assertTrue(tree.search(1));
        tree.delete(2000);
        assertFalse(tree.delete(2000));

    }

    @Test
    public void testMoreInsert() {
        tree.insert(20);
        tree.insert(21);
        tree.insert(30);
        tree.insert(50);
        tree.insert(2011);
        tree.insert(2022);
        tree.insert(20222);
        tree.insert(20);
        tree.insert(21);
        tree.insert(30);
        tree.insert(50);
        tree.insert(2011);
        tree.insert(2022);
        tree.insert(20222);
        boolean expected = tree.search(20222);
        assertTrue(expected);
    }


}