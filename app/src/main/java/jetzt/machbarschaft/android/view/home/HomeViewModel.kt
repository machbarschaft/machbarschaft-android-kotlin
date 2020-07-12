package jetzt.machbarschaft.android.view.home

import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jetzt.machbarschaft.android.R
import jetzt.machbarschaft.android.data.Order

class HomeViewModel : ViewModel() {
    private val orders: MutableLiveData<List<Order>> by lazy {
        MutableLiveData<List<Order>>(emptyList()).also {
            loadOrders()
        }
    }

    fun getOrders(): LiveData<List<Order>> {
        return orders
    }

    fun onSortByChanged(sortBy: SortBy) {
        // TODO update orders
    }

    private fun loadOrders() {
        // TODO load orders
    }

    enum class SortBy(@StringRes val text: Int) {
        DISTANCE(R.string.home_tab_distance),
        URGENCY(R.string.home_tab_urgency)
    }
}