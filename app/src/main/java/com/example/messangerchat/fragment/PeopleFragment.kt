package com.example.messangerchat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messangerchat.adapter.CustomViewAdapter
import com.example.messangerchat.model.Story
import android.util.DisplayMetrics
import com.example.messangerchat.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PeopleFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_people, container, false)

        initViews()

        return root
    }
    fun initViews(){
        refreshAdapter(prepareStoryList())
    }

    private fun refreshAdapter(stories: ArrayList<Story>) {
        var adapter = CustomViewAdapter(stories)

        var recyclerView = root.findViewById<RecyclerView>(R.id.recyclerView_people)

        recyclerView.adapter = adapter
    }

    private fun prepareStoryList(): ArrayList<Story> {
        var stories = ArrayList<Story>()

            stories.add(Story(R.drawable.img_1, "", ""))
            stories.add(Story(R.drawable.img_2, "Muxtorov Umid", "1"))
            stories.add(Story(R.drawable.img_1, "Najmiddinov Sardor", "1"))
            stories.add(Story(R.drawable.img_1, "Muxtorov Murtazo", "1"))
            stories.add(Story(R.drawable.img_1, "Sanjat", "1"))
            stories.add(Story(R.drawable.img_1, "Sanjar", "1"))
            stories.add(Story(R.drawable.img_1, "Saidaxmad", "1"))
            stories.add(Story(R.drawable.img_1, "Asliddin O'ktamov", "1"))
            stories.add(Story(R.drawable.img_1, "Bobomurod Eliyev", "1"))
            stories.add(Story(R.drawable.img_1, "Otamurod Temirov", "1"))
            stories.add(Story(R.drawable.img_1, "Sanat To'g'aymurodov", "1"))
            stories.add(Story(R.drawable.img_1, "Sadriddin Toshtemirov", "1"))
            stories.add(Story(R.drawable.img_1, "Mehrob", "1"))
            stories.add(Story(R.drawable.img_1, "Alijon Valiyev", "1"))
            stories.add(Story(R.drawable.img_1, "Atxambek Alimov", "1"))


        return stories
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PeopleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}