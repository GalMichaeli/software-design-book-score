package il.ac.technion.cs.sd.books.external

class LineStorageFactoryImpl : LineStorageFactory {
    
    private class LineStorageImpl : LineStorage {
        
        override fun appendLine(line: String) = Unit

        override fun read(lineNumber: Int): String = ""

        override fun numberOfLines(): Int = 0
    
    }

    override fun open(fileName: String): LineStorage = LineStorageImpl()

}