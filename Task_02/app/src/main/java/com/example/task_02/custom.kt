package com.example.task_02

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class custom(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var Text:String = ""
    fun setText(Text: String) {
        this.Text = Text
        invalidate()}
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.BLUE // Circle color
        style = Paint.Style.FILL
    }
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE // Text color
        textSize = 50f      // Text size
        textAlign = Paint.Align.CENTER
    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val radius = width / 2f
        canvas.drawCircle(radius, radius, radius, paint)
        canvas.drawText(Text, radius, radius + 15, textPaint)
    }


}