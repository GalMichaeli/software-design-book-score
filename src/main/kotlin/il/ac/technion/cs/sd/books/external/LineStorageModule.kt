package il.ac.technion.cs.sd.books.external

import dev.misfitlabs.kotlinguice4.KotlinModule

import il.ac.technion.cs.sd.books.external.LineStorageFactory

class LineStorageModule : KotlinModule() {
    override fun configure() {
        bind<LineStorageFactory>().to<LineStorageFactoryImpl>()
    }
}