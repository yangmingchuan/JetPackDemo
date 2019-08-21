package com.white.ymc.jetpackdemo.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 实体类
 * PrimaryKey -> 字段作为主键
 * autoGenerate -> 自增
 *
 * Created by yangmingchuan on 2019-08-21.
 * Email:18768880074@163.com
 * com.white.ymc.jetpackdemo.db
 */

@Entity
data class Student(@PrimaryKey(autoGenerate = true) val id: Int,
                   val name: String)
