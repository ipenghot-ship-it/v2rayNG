package com.v2ray.ang.dto

import java.io.Serializable

/** One persisted test result delivered from the task process to the UI.
 *
 * Exactly one of [delayMillis] or [speedKb] is set depending on the test kind;
 * an unset value stays -1.
 */
data class RealPingResult(
    val guid: String,
    val delayMillis: Long = -1L,
    val speedKb: Long = -1L,
    val isSpeed: Boolean = false,
) : Serializable
