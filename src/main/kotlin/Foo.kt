package cz.maio.foo

class Foo : IFoo<Result<Unit>> {
    override fun handle1(): Result<Unit> {
        return Result.failure(Exception("xxx"))
    }

    fun handle2(): Result<Unit> {
        return Result.failure(Exception("xxx"))
    }
}

interface IFoo<R> {
    fun handle1(): R
}