package com.example.jeffrey.multicasttest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.SimpleItemAnimator
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_rv_scoreboard.adapter = adapter
        val animator = activity_main_rv_scoreboard.itemAnimator as SimpleItemAnimator
        animator.supportsChangeAnimations = false

        testPopulateScoreboard()
        testUpdateScoreboard()
    }

    private fun testPopulateScoreboard() {
        val names = arrayOf("Albert", "Bobby", "Carol", "Dennis", "Emily", "Felix", "Gary",
            "Hannah", "Ian", "Jacob")
        for(i in 1..10) {
            val racer = Racer(names[i-1], 300, 300, 600, i, "Driving")
            val racerItem = RacerItem(racer)
            adapter.add(i-1, racerItem)
        }
    }

    private fun testUpdateScoreboard() {

    }
}
