package il.ac.technion.cs.sd.books.external

interface LineStorageFactory {

    /**
     * Return the LineStorage instance associated with `fileName`, if it exists.
     * Otherwise creates a new instance of LineStorage, associates it with
     * `fileName` and returns it.
     */
    fun open(fileName: String): LineStorage

}