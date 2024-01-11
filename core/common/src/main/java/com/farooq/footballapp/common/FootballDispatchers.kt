package com.farooq.footballapp.common

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val footballDispatcher: FootballDispatchers)

enum class FootballDispatchers {
    Default,
    IO,
}
