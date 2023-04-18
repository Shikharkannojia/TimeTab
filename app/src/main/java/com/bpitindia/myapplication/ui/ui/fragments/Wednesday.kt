package com.bpitindia.myapplication.ui.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.data.WednesdayLectures
import com.bpitindia.myapplication.entity.Period
import com.bpitindia.myapplication.recyclerview.MainRecyclerAdapter
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.time.LocalTime

//import com.google.firebase.database.FirebaseDatabase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Wednesday.newInstance] factory method to
 * create an instance of this fragment.
 */
class Wednesday : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerHome: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var recyclerAdapter: MainRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wednesday, container, false)
        recyclerHome = view.findViewById(R.id.recyclerHome)
        layoutManager = LinearLayoutManager(activity)

//        val database = FirebaseDatabase.getInstance()
//        val myRef = database.getReference("App")
//        myRef.setValue("Hello world!!!")
//        myRef.child("Hello world!!!").child("name").setValue("xyz")


//        val list = WednesdayLectures().loadLectures()
//        val p1 = Period("LIB", "SH1-B", "Library Assistant", "9:30 - 10:20")
//        val p2 = Period("Data Mining", "403", "Dr. Mugdha", "10:20 - 11:10")
//        val p3 = Period("ST", "402", "Dr. Vishal", "11:10 - 12:00")
//        val p4 = Period("Library", "Lib", "Library Assistant", "12:00 - 12:50")
//        val p5 = Period("WC", "113", "Mr. Dinesh", "1:40 - 3:20")
//        val p6 = Period("IS Lab (G2)","108B","Dr. Charu", "3:20 - 5:00")
//        val p7 = Period("DM Lab (G1)", "401A", "Dr. Mugdha", "3:20 - 5:00")

//        list.add(p1); list.add(p2); list.add(p3); list.add(p4); list.add(p5); list.add(p6); list.add(p7)
//        for(i in 1..6){
//            val str = "P$i"
//            var name = ""
//            var room = ""
//            var teacher = ""
//            var time = ""
//
//
//            myRef.child("TimeTable").child("Wednesday").child(str).get().addOnSuccessListener {
//                name = it.child("Name").value.toString()
//                room = it.child("Room").value.toString()
//                teacher = it.child("Teacher").value.toString()
//                time = it.child("Time").value.toString()
//                val p1 = Period(name,room,teacher,time)
//                println("___________________" + name + ", " + p1.room + ", " + p1.teacher + ", " + p1.time)
//                list.add(p1)
//            }
//
//        }

//        recyclerAdapter =
//            MainRecyclerAdapter(activity as Context, list)
//        recyclerHome.adapter = recyclerAdapter
//        recyclerHome.layoutManager = layoutManager

        val database = Firebase.database
        val myRef1 = database.getReference("App").child("TimeTable").child("Wednesday")
        myRef1.addChildEventListener(object : ChildEventListener {
            var size = 0
            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                size++
                getFirebase(size)
            }

            override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {}

            override fun onChildRemoved(snapshot: DataSnapshot) {}

            override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {}

            override fun onCancelled(error: DatabaseError) {
                // Handle any errors that may occur
            }
        })

        return view
    }

    fun getFirebase(size:Int){
        val list:ArrayList<Period> = java.util.ArrayList()
        val database = Firebase.database
        val myRef = database.getReference("App")
        for(i in 1..size){
            val str = "P$i"
            var name = ""
            var room = ""
            var teacher = ""
            var time = ""

            myRef.child("TimeTable").child("Wednesday").child(str).get().addOnSuccessListener {
                name = it.child("Subject").value.toString()
                room = it.child("Room").value.toString()
                teacher = it.child("Teacher").value.toString()
                time = it.child("Time").value.toString()


                var time1 = ""
                var time2 = ""

                if(time != "null"){
                    time1 = time.substring(0,5)
                    time2 = time.substring(8,time.length)
                }
//                "${subject.startTime.hour}:${subject.startTime.minute} - ${subject.endTime.hour}:${subject.endTime.minute}"
                val p1 = Period(name,room,teacher, LocalTime.parse(time1), LocalTime.parse(time2))
                list.add(p1)
            }.addOnFailureListener{}
        }

        myRef.child("TimeTable").child("Wednesday").get().addOnSuccessListener {
            recyclerAdapter =
                MainRecyclerAdapter(activity as Context, list)
            recyclerHome.adapter = recyclerAdapter
            recyclerHome.layoutManager = layoutManager
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Wednesday.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Wednesday().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}