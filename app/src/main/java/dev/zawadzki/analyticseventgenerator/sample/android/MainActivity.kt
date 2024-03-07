package dev.zawadzki.analyticseventgenerator.sample.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.zawadzki.analyticseventgenerator.sample.android.theme.SampleAndroidApplicationTheme
import dev.zawadzki.sharedanalyticslibrary.di.eventReportingRepository
import dev.zawadzki.sharedanalyticslibrary.event.SampleActionWithTimer
import dev.zawadzki.sharedanalyticslibrary.event.SampleSomething

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Composable
private fun Content() {
    SampleAndroidApplicationTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                val sampleEvent = SampleSomething(
                    isEnabled = true,
                    clickCount = 1,
                    duration = 2000L,
                    accuracy = 0.5,
                    myType = SampleSomething.MyType.CUSTOM
                )
                eventReportingRepository.reportEvent(sampleEvent)
            }) {
                Text("Send sample event")
            }
            Button(onClick = {
                val eventWithTimer = SampleActionWithTimer(duration = 0)
                eventWithTimer.duration = 2500L
                eventReportingRepository.reportEvent(eventWithTimer)
            }) {
                Text("Send event with duration")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentPreview() {
    Content()
}
