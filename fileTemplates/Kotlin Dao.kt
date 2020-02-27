package ${PACKAGE_NAME}

import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class ${DATA}Dao :
    BaseDao<${DATA}> {

    @Query("SELECT * FROM ${TABLE_NAME}")
    abstract suspend fun getData(): List<${DATA}>

    @Query("DELETE FROM ${TABLE_NAME}")
    abstract suspend fun deleteAll()
}