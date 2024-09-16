public class TreeMultiSet extends MultiSet {

    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        // TODO complete this method
    }
    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
    public TreeMultiSet(){
        this._tree = new Tree();
    }

    @Override
    void remove(Integer item){
        this._tree.delete_item(item);

    }
    @Override
    boolean contains(Integer item){
        return this._tree.contains(item);
    }
    @Override
    boolean is_empty(){
        return this._tree.is_empty();
    }
    @Override
    int count(Integer item){
        return this._tree.count(item);
    }

}
