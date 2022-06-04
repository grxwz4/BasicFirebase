package com.example.basicfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference

        /*

        myRef.child("example").child("1").setValue(Card("1", "Negro", "Picos"))
        myRef.child("example").child("2").setValue(Card("4", "Rojo", "Corazones"))
        myRef.child("example").child("3").setValue(Card("6", "Negro", "Diamantes"))

         */

        myRef.child("example").child("3").get().addOnSuccessListener { response ->
            Log.d("firebaserespondse", response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaserespondse", "Error", it)
        }

        /*

        myRef.child("users").child("user001").setValue(User("Gerardo Rubio", "grrd98", 23))
        myRef.child("users").child("user002").setValue(User("Ana Guerrero", "anaEst", 45))
        myRef.child("users").child("user003").setValue(User("Maria Mendoza", "MariaMendoza", 14))

         */

        myRef.child("users").get().addOnSuccessListener { response ->
            Log.d("firebaserespondse", response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaserespondse", "Error", it)
        }

    }
}