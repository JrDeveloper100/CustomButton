package com.example.custombutton

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RoundRectShape
import android.util.AttributeSet
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class CustomButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    private var textColor = Color.BLACK
    private var backgroundColor = Color.CYAN
    private var cornerRadius = 0f

    fun getCornerRadius() = cornerRadius

    fun setCornerRadius(radius: Float) {
        cornerRadius = radius
    }

    fun getButtonBackgroundColor() = backgroundColor

    fun setButtonBackgroundColor(color: Int){
        backgroundColor = color
    }

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomButton)
        textColor = typedArray.getColor(R.styleable.CustomButton_textColor, textColor)
        cornerRadius = typedArray.getDimension(R.styleable.CustomButton_cornerRadius, cornerRadius)
        typedArray.recycle()

        // Apply the button properties, including corner radius
        applyButtonProperties()
    }

    private fun applyButtonProperties() {
        // Create a ShapeDrawable with a RoundRectShape to set corner radius
        val radiusArray = floatArrayOf(
            cornerRadius, cornerRadius, cornerRadius, cornerRadius,
            cornerRadius, cornerRadius, cornerRadius, cornerRadius
        )
        val backgroundDrawable = ShapeDrawable(RoundRectShape(radiusArray, null, null))
        backgroundDrawable.paint.color = backgroundColor
        background = backgroundDrawable

        // Set the text color
        setTextColor(textColor)
    }

    // Override onDraw if needed
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        applyButtonProperties()
        // Additional custom drawing code if necessary
    }
}