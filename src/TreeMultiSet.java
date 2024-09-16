public class TreeMultiSet extends MultiSet {
    private Tree t = new Tree();
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        // TODO complete this method
        throw new UnsupportedOperationException("Not supported");
    }
    void remove(Integer item) {
        throw new UnsupportedOperationException("Not supported");
    }

    boolean contains(Integer item) {
        throw new UnsupportedOperationException("Not supported");
    }

    boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported");
    }

    int count(Integer item) {
        throw new UnsupportedOperationException("Not supported");
    }

    int size(Integer item) {
        throw new UnsupportedOperationException("Not supported");
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
