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
import com.bpitindia.myapplication.data.TuesdayLectures
import com.bpitindia.myapplication.entity.Period
import com.bpitindia.myapplication.recyclerview.MainRecyclerAdapter
//import com.google.firebase.database.FirebaseDatabase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Tuesday.newInstance] factory method to
 * create an instance of this fragment.
 */
class Tuesday : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_tuesday, container, false)
        recyclerHome = view.findViewById(R.id.recyclerHome)
        layoutManager = LinearLayoutManager(activity)

//        val database = FirebaseDatabase.getInstance()
//        val myRef = database.getReference("App")

        val list = TuesdayLectures().loadLectures()
//        val p1 = Period("Information Security", "SH1-B", "Dr. Charu", "9:30 - 11:10")
//        val p2 = Period("ST Lab (G1)", "401A", "Dr. Vishal", "11:10 - 12:50")
//        val p3 = Period("WC Lab (G2)", "108A", "Dr. Dinesh", "11:10 - 12:50")
//        val p4 = Period("ADBMS", "114", "Ms. Deepti", "1:40 - 2:30")
//        val p5 = Period("WC", "114", "Dr. Dinesh", "2:30 - 3:20")
//        val p6 = Period("CCA", "__", "__", "3:20 - 5:00")
//
//        list.add(p1); list.add(p2); list.add(p3); list.add(p4); list.add(p5); list.add(p6)
//        for(i in 1..6){
//            val str = "P$i"
//            var name = ""
//            var room = ""
//            var teacher = ""
//            var time = ""
//
//
//            myRef.child("TimeTable").child("Tuesday").child(str).get().addOnSuccessListener {
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


        recyclerAdapter =
            MainRecyclerAdapter(activity as Context, list)
        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Tuesday.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Tuesday().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}