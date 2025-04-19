
package com.example.veindetector

import android.graphics.Bitmap
import android.util.Log

object MockAIVeinDetector {

    fun analyzeImage(image: Bitmap): String {
        // كود وهمي لتحليل الصورة وعرض نتائج مزيفة
        Log.d("MockAI", "Image received for analysis")
        
        // تأخير بسيط لمحاكاة المعالجة
        Thread.sleep(1000)
        
        // إرجاع نتيجة وهمية
        return "Vein pattern detected successfully (Mock Result)"
    }
}
