package com.masuwes.profilesekolahmateritraining

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    private var TAG = RegisterActivity::class.java.simpleName

    private var reference: DatabaseReference? = null
    private var firebaseAuth: FirebaseAuth? = null
    private var database: FirebaseDatabase? = null

    private var email: String? = null
    private var npsn: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initialized()

        button_register.setOnClickListener {
            createNewAccount()
        }

    }

    private fun initialized() {
        database = FirebaseDatabase.getInstance()
        reference = database?.reference?.child("Users")
        firebaseAuth = FirebaseAuth.getInstance()
    }

    private fun createNewAccount() {
        email = form_nama.text.toString()
        npsn = form_npsn.text.toString()
        password = form_password.text.toString()
        if (!TextUtils.isEmpty(npsn) &&
            !TextUtils.isEmpty(email) &&
            !TextUtils.isEmpty(password)) {

        firebaseAuth!!
            .createUserWithEmailAndPassword(email!!, password!!)
            .addOnCompleteListener(this) { task ->
                progressBar(false)

                if (task.isSuccessful) {
                    // sign in success
                    Log.d(TAG, "createUserWithEmail:success")

                    val userId = firebaseAuth!!.currentUser!!.uid

                    verifyEmail()

                    // update user info in database
                    val currentUserDb = reference!!.child(userId)
                    currentUserDb.child("npsn").setValue(npsn)

                    updateUserInfo()

                } else {
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(this@RegisterActivity, "Authentifcation Failed.", Toast.LENGTH_SHORT).show()
                }

            }



        } else {
            Toast.makeText(this, "Enter All Form", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateUserInfo() {

    }

    private fun verifyEmail() {

    }

    private fun progressBar(state : Boolean) {
        if (state) {
            progress_circular.visibility = View.VISIBLE
        } else {
            progress_circular.visibility = View.GONE
        }
    }


}