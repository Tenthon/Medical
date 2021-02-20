package com.medical.medical.view.activity.oxygen

import android.app.DatePickerDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.medical.medical.R
import com.medical.medical.base.BaseActivity
import com.medical.medical.utils.AxisDateFormatter
import kotlinx.android.synthetic.main.activity_oxygen.*
import java.util.*

class OxygenActivity : BaseActivity() {
    private var tanggal: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oxygen)
        setToolbar()
        speedMeter.setSpeed(100F)
        Handler(Looper.getMainLooper()).postDelayed({
            speedMeter.setSpeed(-30F)
        }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            speedMeter.setSpeed(90F)
            if (speedMeter.equals(75F)){
                toast("Awass")
                println("Awass")

            }
        }, 25000)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        tanggal = month + 1
        dateTv.text = "$day" + " , " + tanggal + " , " + year

        imgPicker.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                tanggal = month + 1
                dateTv.text = "$dayOfMonth , $tanggal , $year"
            }, year, month, day)
            dpd.show()

        }


        val oxygenData = ArrayList<Entry>()
        oxygenData.add(Entry(0F, 19F))
        oxygenData.add(Entry(1F, 23F))
        oxygenData.add(Entry(2F, 36F))
        oxygenData.add(Entry(3F, 46F))
        oxygenData.add(Entry(4F, 51F))
        oxygenData.add(Entry(5F, 68F))
        oxygenData.add(Entry(6F, 77F))
        oxygenData.add(Entry(7F, 88F))
        oxygenData.add(Entry(8F, 97F))
        oxygenData.add(Entry(9F, 90F))

        val oxygenSet = LineDataSet(oxygenData, "Oxygen")
        oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        oxygenSet.color = Color.GREEN
        oxygenSet.circleRadius = 5f
        oxygenSet.setCircleColor(Color.GREEN)

        val legend = lineChart.legend
        legend.isEnabled = true
        legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        legend.orientation = Legend.LegendOrientation.HORIZONTAL
        legend.setDrawInside(false)

        lineChart.description.isEnabled = false
        lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        lineChart.data = LineData(oxygenSet)
        lineChart.animateXY(100, 500)

        var date = ArrayList<String>();
        date.add("01-Apr")
        date.add("02-Apr")
        date.add("03-Apr")
        date.add("04-Apr")
        date.add("05-Apr")
        date.add("06-Apr")
        date.add("07-Apr")
        date.add("08-Apr")
        date.add("09-Apr")
        date.add("10-Apr")

        val dateMonth = AxisDateFormatter(date.toArray(arrayOfNulls<String>(date.size)))
        lineChart.xAxis?.valueFormatter = dateMonth;

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 19F))
            oxygenData.add(Entry(1F, 23F))
            oxygenData.add(Entry(2F, 36F))
            oxygenData.add(Entry(3F, 46F))
            oxygenData.add(Entry(4F, 51F))
            oxygenData.add(Entry(5F, 68F))
            oxygenData.add(Entry(6F, 77F))
            oxygenData.add(Entry(7F, 88F))
            oxygenData.add(Entry(8F, 90F))
            oxygenData.add(Entry(9F, 80F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.GREEN
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.GREEN)

            val legend = lineChart.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChart.description.isEnabled = false
            lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChart.data = LineData(oxygenSet)
            lineChart.animateXY(100, 500)
                                                    }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 19F))
            oxygenData.add(Entry(1F, 23F))
            oxygenData.add(Entry(2F, 36F))
            oxygenData.add(Entry(3F, 46F))
            oxygenData.add(Entry(4F, 51F))
            oxygenData.add(Entry(5F, 68F))
            oxygenData.add(Entry(6F, 77F))
            oxygenData.add(Entry(7F, 88F))
            oxygenData.add(Entry(8F, 99F))
            oxygenData.add(Entry(9F, 98F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.GREEN
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.GREEN)

            val legend = lineChart.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChart.description.isEnabled = false
            lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChart.data = LineData(oxygenSet)
            lineChart.animateXY(100, 500)
        }, 25000)


    }
}