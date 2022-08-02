package com.example.fragmentaction

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.fragmentaction.databinding.FragmentNavHostSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NavHostSecond.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavHostSecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentNavHostSecondBinding
    lateinit var navact:NavHostActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(navact,"onattach",Toast.LENGTH_LONG)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(navact,"oncreate",Toast.LENGTH_LONG)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_nav_host_second, container, false)
        arguments?.let {
            var testingValue = it.getString("Test")?:""
            binding.tv.setText(testingValue)
        }
        Toast.makeText(navact,"oncreateview",Toast.LENGTH_LONG)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(navact,"onviewcreated",Toast.LENGTH_LONG)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Toast.makeText(navact,"onviewstaterestored",Toast.LENGTH_LONG)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(navact,"onstart",Toast.LENGTH_LONG)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(navact,"onresume",Toast.LENGTH_LONG)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(navact,"onpause",Toast.LENGTH_LONG)
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(navact,"onstop",Toast.LENGTH_LONG)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(navact,"ondestroyview",Toast.LENGTH_LONG)
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(navact,"ondestroy",Toast.LENGTH_LONG)
    }



    override fun onDetach() {
        super.onDetach()
        Toast.makeText(navact,"ondetach",Toast.LENGTH_LONG)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NavHostSecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NavHostSecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}