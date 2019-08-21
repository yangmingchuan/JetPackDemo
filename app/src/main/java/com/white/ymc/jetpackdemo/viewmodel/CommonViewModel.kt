package com.white.ymc.jetpackdemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.white.ymc.jetpackdemo.db.Student
import com.white.ymc.jetpackdemo.db.StudentDb

/**
 * view model
 *
 * Created by yangmingchuan on 2019-08-21.
 * Email:18768880074@163.com
 * com.white.ymc.jetpackdemo.viewmodel
 */

class CommonViewModel(app : Application) :  AndroidViewModel(app) {
    private val dao = StudentDb.get(app).studentDao()


    fun getRefreshLiveData(): LiveData<PagedList<Student>> {
        return LivePagedListBuilder(dao.getAllStudent(), PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)                         //配置分页加载的数量
            .setEnablePlaceholders(ENABLE_PLACEHOLDERS)     //配置是否启动PlaceHolders
            .setInitialLoadSizeHint(PAGE_SIZE)              //初始化加载的数量
            .build()).build()
    }


    companion object {

        private const val PAGE_SIZE = 10

        private const val ENABLE_PLACEHOLDERS = false
    }
}

