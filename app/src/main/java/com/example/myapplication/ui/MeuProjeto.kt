package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.model.*


class MeuProjeto : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var tituloView: TextView
    lateinit var editTextEmail: EditText
    lateinit var editTextSenha: EditText



    //    criar objeto user
//    atributos - email e senha ambos string
//    criar funcoes - validaremail e validar senha
//    verificar se cada um esta diferente de nullo ou vazio
//    funcao deve retornar true ou false

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("-----On Create")
        setContentView(R.layout.activity_main)


            carregarElementos()
            carregarEventos()

            val pessoa1 = Pessoa (nome= "Alan", sobrenome = "Oliveira")
            pessoa1.correr()

            val pessoa2 = Pessoa2(nome= "Yasmin", sobrenome = "Lima", idade = 12)
            pessoa2.correr()

            val professor = Professor(nome = "Giblerto", sobrenome = "Oliveira", cpf = "27775490870")
            professor.correr()



            //publica sem retorno
            val carro = Carro(nome = "Gol", ano = 2015, cor = CarroCor.BRANCO)
            carro.acelerar()
            //publica com retorno
            val descricaoDoCarro = carro.buscarDescricaoCompleta()
            println("descricaoDoCarro")


            val user = User(nome = "Alan", email = "alan_oliveiral@yahoo.com.br", senha = "123456", idade = 34 )
            if (user.validarEmail()) {
                println("Email Validado True")
            }else {
                println("Email Inválido True")
            }

            user.addIdade(novaIdade = 5)
            println(user.idade)


//        val btnLOGIN = findViewById<Button>(R.id.button)
//        val titleView = findViewById<TextView>(R.id.textView)
//
//        btnLOGIN.setOnClickListener {
//            titleView.text = "Novo Titulo"
//            Snackbar.make(it, titleView.text, Snackbar.LENGTH_SHORT).show()
//        }
    }       //CARREGAMOS EM VARIÁVEIS OS COMPONENTES DA TELA

    fun carregarElementos(){
        btnLogin = findViewById(R.id.button)
        tituloView = findViewById(R.id.textView)
        editTextEmail = findViewById(R.id.editTextTextEmailAddress2)
        editTextSenha = findViewById(R.id.editTextTextPassword)
    }
    fun carregarEventos(){
        btnLogin.setOnClickListener { R.id.button
        val intent = Intent(this, PrincipalActivity::class.java)
        startActivity(intent)
            val email = editTextEmail.text.toString()
            val senha = editTextSenha.text.toString()

            val user = User2 (email = email, senha = senha)

            if (user.validarEmail()){
                println("Email Sucesso")
            } else {
                println("Email Invalido!!")
            }
            if (user.validarSenha()){
                println("Senha Sucesso")
            } else {
                println("Senha invalida")
            }

        }

    }
    override fun onStart() {
        super.onStart()
        println("------On Start")
    }
     override fun onResume() {
         super.onResume()
         println("---On Resume")
     }
    override fun onRestart(){
        super.onRestart()
        println("----On Restart")
    }

    override fun onPause() {
        super.onPause()
        println("____On Pause")
    }
    override fun onStop(){
        super.onStop()
        println("-----On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("----On Destroy")
    }
    }
