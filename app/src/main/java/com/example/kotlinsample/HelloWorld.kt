package com.example.kotlinsample

class HelloWorld {



    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val message = "Hello world"
            println("Given message is : $message")
            println("Sum of number is : ${add(5, 10)}")
            println("Sum of number is : ${add(5, 10, 5)}")
            var sum = add(5, 5)

//            Condition statement
            var msg = if (sum>10) "sum is greater" else "Sum is smaller"
            println("Given message is : $msg")

            if (sum > 10)
            {
                println("sum is greater")
            } else if (sum < 10)
            {
                println("sum is smaller")
            } else if (sum == 10)
            {
                println("sum is equal")

            }

            when{
                (sum > 10) -> {println("sum is greater")}
                (sum < 10) -> {println("sum is smaller")}
                (sum == 10) -> {println("sum is equal")}
            }

//            Collections List, set and Map

//            Immutable list
            val alist = listOf("ram","ravn","seetha")
            println(alist)

//            mutable list
            val mlist = mutableListOf("tes", 1, true, "end")
            mlist.add("last")
            mlist.add(1,"replaced")
            println(mlist)

//            immutable Set
            val aset =  setOf("set","get","ready")
            println(aset)

//            mutable set
            val mset = mutableSetOf("set",3 , "wet", false)
           mset.add("last")
            mset.add("tes")
            
            println(mset)

            val amap = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
            println(amap)

//            mutable map
            val mmap = mutableMapOf("1" to "one", 2 to "two", 3 to "three")
            mmap.put("4", "four")
            println(mmap)

            var arr = ArrayList<Int>()
            arr.add(5)
            arr.add(4)
            arr.add(6)
            arr.add(3)
            arr.add(2)
            arr.add(1)
            arr.add(0)

            for(i in arr)
            {
                println("array values : $i")
            }

            for(i in aset)
            {
                println("set values : $i")
            }

            for(i in amap)
            {
                println("set values : $amap")
            }

        }

        private fun add(a: Int, b: Int) : Int{
            return a + b
        }
        private fun add(a: Int, b: Int, c: Int) : Int{
            return a + b + c
        }
    }
}