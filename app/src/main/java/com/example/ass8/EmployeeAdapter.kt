package com.example.ass8


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_layout.view.*


class EmployeeAdapter(val items: List<Employee>,val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.emp_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvname?.text = "Name : "+items[position].emp_name
        holder.tvgen?.text= "Gender : "+items[position].emp_gende
        holder.tvemail?.text = "E-mail : "+items[position].emp_email
        holder.tvsalary?.text = "Salary : "+items[position].emp_salary.toString()
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val tvname = view.tv_name
    val tvgen = view.tv_gen
    val tvemail = view.tv_mail
    val tvsalary = view.tv_salary
}