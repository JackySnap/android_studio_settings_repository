package ${PACKAGE_NAME}

import androidx.lifecycle.LiveData
import ${PACKAGE_NAME}.repository.data.json.${DATA}
import ${PACKAGE_NAME}.repository.db.Dao.jsonDao.${DATA}Dao


class ${DATA}Repo (private val dao: ${DATA}Dao){

    suspend fun insert(item: ${DATA}){
        dao.insert(item)
    }

    suspend fun getList() = dao.getData()
}