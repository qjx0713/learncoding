import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        /**
         * map
         */

        /*        val flow = flowOf(1, 2, 3, 4, 5)
                flow.map {
                    it * it
                }.collect {
                    println(it)
                }*/

        /**
         * filter
         */
        /*        val flow = flowOf(1, 2, 3, 4, 5)
                flow.filter {
                    it % 2 == 0
                }.map {
                    it * it
                }.collect {
                    println(it)
                }*/

        /**
         * onEach
         */
        /*        val flow = flowOf(1, 2, 3, 4, 5)
                flow.onEach {
                    println(it)
                }.collect {
                }*/

        /**
         * deBounce
         */
        /*        flow {
                    emit(1)
                    emit(2)
                    delay(600)
                    emit(3)
                    delay(100)
                    emit(4)
                    delay(100)
                    emit(5)
                }
                    .debounce(500)
                    .collect {
                        println(it)
                    }*/

        /**
         * sample
         */
        /*        flow {
                    while (true) {
                        emit("发送一条弹幕")
                    }
                }
                    .sample(1000)
                    .flowOn(Dispatchers.IO)
                    .collect {
                        println(it)
                    }*/

        /**
         * reduce
         */
        /*        val result = flow {
                    for (i in (1..100)) {
                        emit(i)
                    }
                }.reduce { acc, value -> acc + value}
                println(result)*/

        /**
         * fold
         */
        /*val result = flow {
            for (i in ('A'..'Z')) {
                emit(i.toString())
            }
        }.fold("Alphabet: ") { acc, value -> acc + value}
        println(result)*/

        /**
         * flatMapConcat
         */
        /*        flowOf(1, 2, 3)
                    .flatMapConcat {
                        flowOf("a$it", "b$it")
                    }
                    .collect {
                        println(it)
                    }*/

        /**
         * flatMapMerge
         */
        /*        flowOf(300, 200, 100)
                    .flatMapMerge {
                        flow {
                            delay(it.toLong())
                            emit("a$it")
                            emit("b$it")
                        }
                    }
                    .collect {
                        println(it)
                    }*/

        /**
         * flatMapLatest
         */
/*        flow {
            emit(1)
            delay(150)
            emit(2)
            delay(50)
            emit(3)
        }.flatMapLatest {
            flow {
                delay(100)
                emit("$it")
            }
        }
            .collect {
                println(it)
            }*/


        /**
         * zip
         */
/*        val flow1 = flowOf("a", "b", "c")
        val flow2 = flowOf(1, 2, 3, 4, 5)
        flow1.zip(flow2) { a, b ->
            a + b
        }.collect {
            println(it)
        }*/


        /**
         * buffer
         */
/*        flow {
            emit(1);
            delay(1000);
            emit(2);
            delay(1000);
            emit(3);
        }
            .onEach {
                println("$it is ready")
            }
            .buffer()
            .collect {
                delay(1000)
                println("$it is handled")
            }*/


        /**
         * conflate
         */
        flow {
            var count = 0
            while (true) {
                emit(count)
                delay(1000)
                count++
            }
        }
            .conflate()
            .collect {
                println("start handle $it")
                delay(2000)
                println("finish handle $it")
            }
    }
}