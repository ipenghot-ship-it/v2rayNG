package com.v2ray.ang.dto

sealed class RealPingEvent {

    /** Periodic progress update while the batch is still running. */
    data class Progress(val text: String) : RealPingEvent()

    /** A single server result is available.
     *
     * [delayMillis] is set for delay tests, [speedKb] for speed tests;
     * the unset value stays -1.
     */
    data class Result(val guid: String, val delayMillis: Long = -1L, val speedKb: Long = -1L, val isSpeed: Boolean = false) : RealPingEvent()

    /** The entire batch has finished or been cancelled. */
    data class Finish(val status: String) : RealPingEvent()
}

