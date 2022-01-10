package com.candrakhusni.netpix.util

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FirebaseDataBase {
    val database = Firebase.database
    val notes = database.getReference("notes")

}