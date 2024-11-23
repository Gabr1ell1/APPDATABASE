package com.example.myapplication.roomDB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.roomDB

@Database(
    entities = [Pessoa::class],
    version = 1
)


abstract class PessoaDataBase : RoomDatabase() {
    abstract fun pessoaDao() : PessoaDao
}
