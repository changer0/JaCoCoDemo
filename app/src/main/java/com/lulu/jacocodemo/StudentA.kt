package com.lulu.jacocodemo

/**
 * @author zhanglulu
 */
class StudentA {
    private val name: String? = null
    fun action(msg: String?) {
        //触发行为
        println(msg)
    }

    inner class StudentAChild {
        fun action(msg: String?) {
            if (msg != null) {
                //触发行为
                println(msg)
            } else {
                println("这是一个空啊")
                println("这是一个空啊")

                println("为了测试新的文件")
            }
        }
    }
}