package il.ac.technion.cs.sd.books.external

interface LineStorage {

    /** Appends a line to the end of the file */
    fun appendLine(line: String)

    /** Returns the line at index `lineNumber (0-indexed) */
    fun read(lineNumber: Int): String

    /** Returns the total number of lines in the file */
    fun numberOfLines(): Int
}