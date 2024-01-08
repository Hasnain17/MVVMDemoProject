package com.app.mvvmsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.mvvmsample.BR
import com.app.mvvmsample.databinding.FragmentMainBinding
import com.app.mvvmsample.viewModel.MainViewModel
import com.app.mvvmsample.viewModel.MainViewModelFactory


class MainFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel
    private var _binding:FragmentMainBinding?=null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding= FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel=ViewModelProvider(this,MainViewModelFactory())[MainViewModel::class.java]

        binding.setVariable(BR.viewModel, mainViewModel)
        binding.executePendingBindings()


        binding.recyclerView.apply {
            layoutManager=LinearLayoutManager(requireContext())
            val decoration=DividerItemDecoration(requireContext(),LinearLayoutManager.VERTICAL)
            addItemDecoration(decoration)
        }
        initObserver()
    }

    private fun initObserver() {
        mainViewModel.githubResponseData.observe(viewLifecycleOwner, Observer { result->
            when(result){
                is Result.Success->{
                    binding.progressbar.visibility=View.INVISIBLE
                    mainViewModel.setAdapterData(result.data.items)
                }
                is Result.Error->{
                    Toast.makeText(requireContext(),"Error Fetching Data",Toast.LENGTH_SHORT).show()
                }
                is Result.ErrorException->{
                    Toast.makeText(requireContext(),"Exception",Toast.LENGTH_SHORT).show()

                }
        } })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}