package cl.jpinodev.arquitecturas_mvvm_mvp.presenter

import cl.jpinodev.arquitecturas_mvvm_mvp.model.Lenguage
import cl.jpinodev.arquitecturas_mvvm_mvp.presenter.contract.MainContract

class MainPresenter (
    private val view: MainContract.View,
    private val model: MainContract.Model
    ): MainContract.Presenter {

        private var listLenguages = mutableListOf<Lenguage>()
    override fun getLenguages() {
        listLenguages = model.downloadLenguages()
        view.showLenguage(random(listLenguages))
    }

    fun random(lenguage: MutableList<Lenguage>): Lenguage{
        val position = (0 .. lenguage.size).random()
        return lenguage[position]
    }

}