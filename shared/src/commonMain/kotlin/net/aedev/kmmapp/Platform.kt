package net.aedev.kmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform