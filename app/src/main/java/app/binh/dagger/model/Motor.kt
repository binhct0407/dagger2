package app.binh.dagger.model

/**
 * Created by BinhTran on 4/7/18.
 */
class Motor {
    private var rpm: Int = 0
    fun getRpm(): Int {
        return rpm
    }

    fun accelerate(value: Int) {
        rpm = rpm + value
    }

    fun brake()
    {
        rpm=0
    }
}