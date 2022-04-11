package com.aavidsoft.customview2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class TaskView(
    context: Context,
    attributeSet: AttributeSet?
) : androidx.appcompat.widget.AppCompatTextView(context, attributeSet) {

    var taskStatus = false

    init {
        setTextColor(Color.RED)
        setPadding(80, 10, 10, 10)

        setOnClickListener {
            taskStatus = !taskStatus

            var textColor = Color.RED
            if(taskStatus) textColor = Color.GREEN

            setTextColor(textColor)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var paint = Paint()
        paint.setColor(Color.RED)
        canvas!!.let {
            it.drawLine(60F, 0F, 60F, height.toFloat(), paint)
            it.drawLine(70F, 0F, 70F, height.toFloat(), paint)
        }
    }
}







