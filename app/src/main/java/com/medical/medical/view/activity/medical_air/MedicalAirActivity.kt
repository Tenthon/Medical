package com.medical.medical.view.activity.medical_air

import android.app.DatePickerDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.medical.medical.R
import com.medical.medical.base.BaseActivity
import com.medical.medical.utils.AxisDateFormatter
import kotlinx.android.synthetic.main.activity_medical_air.*
import java.util.*

class MedicalAirActivity : BaseActivity() {
    private var tanggal: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medical_air)

        setToolbar("Medical Air")
        speedMeterMedical.setSpeed(100F)
        Handler(Looper.getMainLooper()).postDelayed({
            speedMeterMedical.setSpeed(-30F)
        }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            speedMeterMedical.setSpeed(90F)

        }, 25000)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        tanggal = month + 1
        dateTvMedical.text = "$day" + " , " + tanggal + " , " + year

        imgPickerMedical.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                tanggal = month + 1
                dateTvMedical.text = "$dayOfMonth , $tanggal , $year"
            }, year, month, day)
            dpd.show()

        }


        val oxygenData = ArrayList<Entry>()
        oxygenData.add(Entry(0F, 59F))
        oxygenData.add(Entry(1F, 23F))
        oxygenData.add(Entry(2F, 16F))
        oxygenData.add(Entry(3F, 16F))
        oxygenData.add(Entry(4F, 21F))
        oxygenData.add(Entry(5F, 38F))
        oxygenData.add(Entry(6F, 47F))
        oxygenData.add(Entry(7F, 58F))
        oxygenData.add(Entry(8F, 67F))
        oxygenData.add(Entry(9F, 79F))

        val oxygenSet = LineDataSet(oxygenData, "Oxygen")
        oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        oxygenSet.color = Color.YELLOW
        oxygenSet.circleRadius = 5f
        oxygenSet.setCircleColor(Color.YELLOW)

        val legend = lineChartMedical.legend
        legend.isEnabled = true
        legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        legend.orientation = Legend.LegendOrientation.HORIZONTAL
        legend.setDrawInside(false)

        lineChartMedical.description.isEnabled = false
        lineChartMedical.xAxis.position = XAxis.XAxisPosition.BOTTOM
        lineChartMedical.data = LineData(oxygenSet)
        lineChartMedical.animateXY(100, 500)

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
        lineChartMedical.xAxis?.valueFormatter = dateMonth;

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 59F))
            oxygenData.add(Entry(1F, 23F))
            oxygenData.add(Entry(2F, 16F))
            oxygenData.add(Entry(3F, 16F))
            oxygenData.add(Entry(4F, 21F))
            oxygenData.add(Entry(5F, 38F))
            oxygenData.add(Entry(6F, 47F))
            oxygenData.add(Entry(7F, 58F))
            oxygenData.add(Entry(8F, 77F))
            oxygenData.add(Entry(9F, 89F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.YELLOW
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.YELLOW)

            val legend = lineChartMedical.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChartMedical.description.isEnabled = false
            lineChartMedical.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChartMedical.data = LineData(oxygenSet)
            lineChartMedical.animateXY(100, 500)
        }, 15000)

        Handler(Looper.getMainLooper()).postDelayed({
            val oxygenData = ArrayList<Entry>()
            oxygenData.add(Entry(0F, 59F))
            oxygenData.add(Entry(1F, 23F))
            oxygenData.add(Entry(2F, 16F))
            oxygenData.add(Entry(3F, 16F))
            oxygenData.add(Entry(4F, 21F))
            oxygenData.add(Entry(5F, 38F))
            oxygenData.add(Entry(6F, 47F))
            oxygenData.add(Entry(7F, 58F))
            oxygenData.add(Entry(8F, 57F))
            oxygenData.add(Entry(9F, 69F))

            val oxygenSet = LineDataSet(oxygenData, "Oxygen")
            oxygenSet.mode = LineDataSet.Mode.CUBIC_BEZIER
            oxygenSet.color = Color.YELLOW
            oxygenSet.circleRadius = 5f
            oxygenSet.setCircleColor(Color.YELLOW)

            val legend = lineChartMedical.legend
            legend.isEnabled = true
            legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
            legend.orientation = Legend.LegendOrientation.HORIZONTAL
            legend.setDrawInside(false)

            lineChartMedical.description.isEnabled = false
            lineChartMedical.xAxis.position = XAxis.XAxisPosition.BOTTOM
            lineChartMedical.data = LineData(oxygenSet)
            lineChartMedical.animateXY(100, 500)
        }, 25000)
    }
}