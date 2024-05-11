package cl.jpinodev.arquitecturas_mvvm_mvp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.jpinodev.arquitecturas_mvvm_mvp.R
import cl.jpinodev.arquitecturas_mvvm_mvp.databinding.ActivityMainBinding
import cl.jpinodev.arquitecturas_mvvm_mvp.model.Lenguage
import cl.jpinodev.arquitecturas_mvvm_mvp.model.MainModel
import cl.jpinodev.arquitecturas_mvvm_mvp.presenter.MainPresenter
import cl.jpinodev.arquitecturas_mvvm_mvp.presenter.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {
private lateinit var mainBinding: ActivityMainBinding
private lateinit var presenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        presenter= MainPresenter(this, MainModel())
        mainBinding.viewContainer.setOnClickListener {
            presenter.getLenguages()
        }

    }
    override fun showLenguage(lenguage: Lenguage) {
        mainBinding.descripcionLenguaje.text = lenguage.descripcion
        mainBinding.nombreLenguaje.text = lenguage.nombre
    }

    override fun showError(message: String) {
        TODO("Not yet implemented")
    }
}