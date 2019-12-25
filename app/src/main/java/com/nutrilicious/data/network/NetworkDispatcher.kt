package com.nutrilicious.data.network

import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

/**
 * @author Peter Sommerhoff
 */
val NETWORK = Executors.newFixedThreadPool(2).asCoroutineDispatcher()