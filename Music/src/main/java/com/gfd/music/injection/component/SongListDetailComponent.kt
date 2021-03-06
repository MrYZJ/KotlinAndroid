package com.gfd.music.injection.component

import com.gfd.common.injection.component.ActivityComponent
import com.gfd.common.injection.scope.PerComponentScope
import com.gfd.music.injection.module.SongListDetailModule
import com.gfd.music.ui.activity.SongListDetailActivity
import dagger.Component

/**
 * @Author : 郭富东
 * @Date ：2018/8/13 - 13:57
 * @Email：878749089@qq.com
 * @description：
 */
@PerComponentScope
@Component(dependencies = [(ActivityComponent::class)], modules = [(SongListDetailModule::class)])
interface SongListDetailComponent {
    fun inject(activity: SongListDetailActivity)
}