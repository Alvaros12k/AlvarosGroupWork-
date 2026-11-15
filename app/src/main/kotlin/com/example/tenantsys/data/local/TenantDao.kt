package com.example.tenantsys.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.tenantsys.data.model.Tenant

// @Dao: the operations we can perform on the table. Room generates the implementation
@Dao
interface TenantDao {

    // suspend: executes on background thread without blocking UI
    @Insert
    suspend fun insertTenant(tenant: Tenant)

    // LiveData: Room updates this automatically whenever table changes
    @Query("SELECT * FROM tenants ORDER BY name")
    fun getAllTenants(): LiveData<List<Tenant>>
}
