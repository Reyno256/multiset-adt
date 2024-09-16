
import java.util.ArrayList;
public class Tree {
    private int root;
    private ArrayList<Tree> subtrees;
    /*
     If this.root is null then this.subtrees is an null.
      This setting of attributes represents an empty tree.
      Note: self._subtrees may be empty when self._root is not None.
      This setting of attributes represents a tree consisting of just one node.
     */

    public Tree(int root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;

    }
    public Tree(int root) {
        this.root = root;
        this.subtrees = ArrayList(Tree);

    }
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
}
