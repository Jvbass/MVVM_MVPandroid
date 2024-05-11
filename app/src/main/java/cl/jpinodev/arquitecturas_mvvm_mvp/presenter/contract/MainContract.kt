package cl.jpinodev.arquitecturas_mvvm_mvp.presenter.contract

import androidx.core.app.NotificationCompat.MessagingStyle.Message
import cl.jpinodev.arquitecturas_mvvm_mvp.model.Lenguage

//contrato a la actividad main
interface MainContract {
    interface View {
        fun showLenguage(lenguage : Lenguage)
        fun showError(message: String)
    }

    interface Presenter {
        fun getLenguages()
    }

    interface Model {
        fun downloadLenguages(): MutableList<Lenguage>
    }
}