package patryk.recyclerviewwithkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items: ArrayList<ExampleItem> = ArrayList()

        for (i in 0..100) {
            val item: ExampleItem = when {
                i % 3 == 0 -> {
                    ExampleItem(R.drawable.ic_android, "Android $i", "Android nr. $i description")
                }
                i % 3 == 1 -> {
                    ExampleItem(
                        R.drawable.ic_notifications,
                        "Notification $i",
                        "Notification nr. $i description"
                    )
                }
                else -> {
                    ExampleItem(
                        R.drawable.ic_flight_takeoff,
                        "Flight takeoff $i",
                        "Flight nr. $i description"
                    )
                }
            }
            items.add(item)
        }

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = ExampleAdapter(items)
        recycler_view.setHasFixedSize(true)
    }
}
