package com.example.segundaprova

import android.content.Context
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.GestureDetector

class RecycleViewList(val context:Context, val view: RecyclerView, val listener:OnItemClickListener) : RecyclerView.OnItemTouchListener {

    lateinit var myGestureDetector: GestureDetector

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
        fun onItemLongClick(view: View, position: Int)
    }

    init {
        myGestureDetector(context, object : GestureDetector.SimpleOnGestureListener(){
            override fun onSigleTapUp(motionEvent: MotionEvent): Boolean {
                super.onSigleTapUp(motionEvent)
                val childView = view.findChildViewUnder(motionEvent.x, motionEvent.y)
                if(childView != null){
                    listener.OnItemClick(childView, view.getChildAdapterPosition(childView))
                    Long.i("Contatos", "VisualizarUp")
                }
                return true
            }

            override fun onLongPress(motionEvent: MotionEvent) {
                super.onLongPress(motionEvent)
                val childView = view.findChildViewUnder(motionEvent.x, motionEvent.y)
                if (childView != null){
                    listener.onItemLongClick(childView, view.getChildAdapterPosition(childView))
                    Log.i("Contatos", "VisualizarPress")
                }
            }
        })
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
    }

    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        myGestureDetector.onTouchEvent(e);
        return false
    }

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
    }
}

private operator fun GestureDetector.invoke(
    context: Context,
    simpleOnGestureListener: GestureDetector.SimpleOnGestureListener) {
}
