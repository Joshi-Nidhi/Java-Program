/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetravlevelorder;

/**
 *
 * @author nidhi
 */
class BinaryTree
{

    // Root of the Binary Tree
    Node root;

    public BinaryTree()
    {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
        {
            printGivenLevel(root, i);
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
        {
            return 0;
        } else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
            {
                return (lheight + 1);
            } else
            {
                return (rheight + 1);
            }
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(Node root, int level)
    {
        if (root == null)
        {
            return;
        }
        if (level == 1)
        {
            System.out.print(root.data + " ");
        } else if (level > 1)
        {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
}
