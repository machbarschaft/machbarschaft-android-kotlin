package jetzt.machbarschaft.android.view.home

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.google.android.material.tabs.TabLayout
import jetzt.machbarschaft.android.R
import jetzt.machbarschaft.android.util.getBugMailIntent

class HomeFragment : Fragment() {
    companion object {
        fun newInstance() = HomeFragment()
        const val LOG_TAG = "HomeFragment"
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: HomeViewModel by viewModels()
        viewModel = model
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSortingTabs(view)
        setupBottomButtons(view)
        setupObservers(view)
    }

    private fun setupSortingTabs(view: View) {
        view.findViewById<TabLayout>(R.id.sorting_tab_layout)?.apply {
            for (sortBy in HomeViewModel.SortBy.values()) {
                addTab(newTab().also {
                    it.tag = sortBy
                    it.text = getString(sortBy.text)
                })
            }
            addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val tag = tab?.tag
                    check(tag is HomeViewModel.SortBy) { "Sorting tab tag is invalid!" }
                    Log.d(LOG_TAG, "Sorting orders by ${tag.name}")
                    viewModel.onSortByChanged(tag)
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {}

                override fun onTabUnselected(tab: TabLayout.Tab?) {}
            })
        }
    }

    private fun setupBottomButtons(view: View) {
        view.findViewById<Button>(R.id.home_btn_faq)?.apply {
            setOnClickListener {
                startActivity(
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://machbarschaft.jetzt/faq.html"))
                )
            }
        }

        view.findViewById<Button>(R.id.home_btn_contact)?.apply {
            setOnClickListener {
                startActivity(
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://machbarschaft.jetzt/#contact"))
                )
            }
        }

        view.findViewById<Button>(R.id.home_btn_bug_report)?.apply {
            setOnClickListener {
                AlertDialog.Builder(context).run {
                    setMessage(R.string.home_feedback_description)
                    setCancelable(false)
                    setPositiveButton(R.string.home_feedback_write_mail) { _, _ ->
                        startActivity(getBugMailIntent(context))
                    }
                    setNegativeButton(R.string.home_feedback_later) { dialog, _ -> dialog.dismiss() }
                }.create().show()
            }
        }
    }

    private fun setupObservers(view: View) {
        viewModel.getOrders().observe(viewLifecycleOwner) { orders ->
            view.findViewById<TextView>(R.id.order_count_text)?.apply {
                text = resources.getQuantityString(
                    R.plurals.home_order_count,
                    orders.size,
                    orders.size
                )
            }
        }
    }
}