package io.fotoapparat.routine.sound

import io.fotoapparat.hardware.Device
import kotlinx.coroutines.runBlocking

/**
 * Mute the Shutter sound of camera if possible.
 */
internal fun Device.mute(): Boolean = runBlocking {
    val cameraDevice = awaitSelectedCamera()

    cameraDevice.setShutterSound(false)
}

/**
 * Unmute the Shutter sound of camera.
 */
internal fun Device.unmute(): Boolean = runBlocking {
    val cameraDevice = awaitSelectedCamera()

    cameraDevice.setShutterSound(false)
}
