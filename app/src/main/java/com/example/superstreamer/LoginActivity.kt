package com.example.superstreamer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.superstreamer.databinding.ActivityLoginBinding
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider

class LoginActivity : AppCompatActivity() {
    var TAG : String? = "로그 LoginActivity - "
    var auth: FirebaseAuth? = null
    var googleSignInClient: GoogleSignInClient? = null
    var GOOGLE_LOGIN_CODE = 9001
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = FirebaseAuth.getInstance()
        var GOOGLE_LOGIN_CODE = 9001

        var gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("497846755588-ekqp507hvubfqk4q8aonlbpqffh1jfem.apps.googleusercontent.com")
            .requestEmail()
            .build()

        binding.btnLoginEmail.setOnClickListener {
            signinAndSignup()
        }

        binding.btnLoginGoogle.setOnClickListener {
            googleLogin()
        }

        googleSignInClient = GoogleSignIn.getClient(this, gso)
    }

    fun googleLogin() {
        var signInIntent = googleSignInClient?.signInIntent
        startActivityForResult(signInIntent, GOOGLE_LOGIN_CODE)
    }

    fun signinAndSignup() {
        auth?.createUserWithEmailAndPassword(binding.etEmail.text.toString(), binding.etPassword.text.toString())
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //Creating a user account
                    moveMainPage(task.result?.user)
                } else {
                    //Login if you have account
                    signinEmail()
                }
            }
    }

    fun signinEmail() {
        auth?.signInWithEmailAndPassword(binding.etEmail.text.toString(), binding.etPassword.text.toString())
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //Login
                    moveMainPage(task.result?.user)
                } else {
                    //show the error message
                    Toast.makeText(this, task.exception?.message, Toast.LENGTH_LONG).show()

                }
            }
    }

//    메인 페이지로 이동
    fun moveMainPage(user: FirebaseUser?) {
        if (user != null) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GOOGLE_LOGIN_CODE) {
            var result = Auth.GoogleSignInApi.getSignInResultFromIntent(data)
            if (result!!.isSuccess) {
                var account = result.signInAccount
                //Second step
                firebaseAuthWithGoogle(account)

            }
        }
    }

    fun firebaseAuthWithGoogle(account: GoogleSignInAccount?) {
        var credential = GoogleAuthProvider.getCredential(account?.idToken, null)
        auth?.signInWithCredential(credential)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    //Login
                    moveMainPage(task.result?.user)
                } else {
                    //show the error message
                    Toast.makeText(this, task.exception?.message, Toast.LENGTH_LONG).show()

                }
            }
    }

    //자동로그인기능
    override fun onStart() {
        Log.d(TAG,"LoginActivity.kt - onStart() called 01" )
        super.onStart()
        moveMainPage(auth?.currentUser)
    }
}